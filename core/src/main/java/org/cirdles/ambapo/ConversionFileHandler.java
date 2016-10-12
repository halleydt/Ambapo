/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cirdles.ambapo;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evc1996
 */
public class ConversionFileHandler {
        private String currentFileLocationToConvert;
        private final String[] HEADER_LAT_LONG = {"LATITUDE, LONGITUDE, DATUM\n"};
        private final String[] HEADER_UTM_FROM_LATLONG = {"EASTING, NORTHING, HEMISPHERE, ZONE NUMBER, ZONE LETTER, FROM LAT/LONG DATUM"};
    
    public boolean currentFileLocationToConvertIsFile() {
        return new File(currentFileLocationToConvert).isFile();
    }
    
    /**
     * @return the currentFileLocationToConvert
     */
    public String getCurrentFileLocationToConvert() {
        return currentFileLocationToConvert;
    }

    /**
     * @param aCurrentFileLocationToConvert the currentPrawnFileLocation to set
     */
    public void setCurrentPrawnFileLocation(String aCurrentFileLocationToConvert) {
        currentFileLocationToConvert = aCurrentFileLocationToConvert;
    }
    
    public List<String[]> extractDataToConvert() throws FileNotFoundException, IOException{
        List<String[]> listOfDataToConvert = null;
        
        try (CSVReader csvReader = new CSVReader(new FileReader(currentFileLocationToConvert))) {
            listOfDataToConvert = csvReader.readAll();
        } catch(Exception e){
            System.out.println("\nUnable to extract data from file.");
        }
        
        return listOfDataToConvert;
            
        
    }
    
    public void writeConversionsUTMToLatLong(List<String[]> dataToConvert, File outputFile) throws IOException, Exception {
        
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(outputFile))){
            csvWriter.writeNext(HEADER_LAT_LONG);
            Datum datum;
            UTM utm;
            Coordinate latAndLong;
            String[] lineToWrite;
            
            for(String[] utmInfo : dataToConvert) {
                utm = new UTM(
                        new BigDecimal(Double.parseDouble(utmInfo[0].trim().replace("\"", ""))),
                        new BigDecimal(Double.parseDouble(utmInfo[1].trim().replace("\"", ""))),
                        utmInfo[2].trim().replace("\"", "").charAt(0),
                        Integer.parseInt(utmInfo[3].replace("\"", "").trim()),
                        utmInfo[4].trim().replace("\"", "").charAt(0));
                
                datum = Datum.valueOf(utmInfo[5].trim().replace("\"", ""));
                
                latAndLong = UTMToLatLong.convert(utm, datum.getDatum());
                lineToWrite = new String[]{latAndLong.getLatitude().toString(),
                    latAndLong.getLongitude().toString(), datum.getDatum()};
                
                csvWriter.writeNext(lineToWrite);
            }
        }
        
    }
    
    
}
