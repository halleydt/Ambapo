/*
 * DatumEnum.java
 *
 * Created Oct 25, 2015
 *
 * Copyright 2015 CIRDLES.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.cirdles.ambapo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Elaina Cole
 */




public enum Datum {
    
    //datum name, equatorial radius, polar radius, flattening 3D, eccentricity, 
    //  meridian radius, alpha series, betaSeries
    
    WGS84("WGS84",  6378137.0, 6356752.314, 0.00167922, 0.081819191, 6367449.146,
        new double[]{0.000837732, 0.000000760853, 0.00000000119765, 
        0.00000000000242917, 0.00000000000000571182, 0.0000000000000000148, 
        0.0000000000000000000410769, 0.000000000000000000000119999, 
        0.000000000000000000000000364726, 0.00000000000000000000000000115606},
        
        new double[]{0.000837732, 0.0000000590587, 0.000000000167348, 
        0.00000000000021648, 0.000000000000000378793, 0.000000000000000000723677,
        0.00000000000000000000149345, 0.00000000000000000000000325384,
        0.00000000000000000000000000739137, 0.0000000000000000000000000000173816}
        ),
    
    NAD83("NAD83", 6378137.0, 6356752.314, 0.00167922, 0.081819191, 6367449.146,
        new double[] {0.000837732, 0.000000760853, 0.00000000119765, 
        0.00000000000242917, 0.00000000000000571182, 0.0000000000000000148,
        0.0000000000000000000410769, 0.000000000000000000000119999, 
        0.000000000000000000000000364726, 0.00000000000000000000000000115606},
        
        new double[] {0.000837732, 0.0000000590587, 0.000000000167348, 
        0.00000000000021648, 0.000000000000000378793, 0.000000000000000000723677,
        0.00000000000000000000149345, 0.00000000000000000000000325384,
        0.00000000000000000000000000739137, 0.0000000000000000000000000000173816}),
    
    GRS80("GRS80", 6378137.0, 6356752.3, 0.00167922, 0.081819191, 6367449.146,
        new double[] {0.000837732, 0.000000760853, 0.00000000119765, 
        0.00000000000242917, 0.00000000000000571182, 0.0000000000000000148,
        0.0000000000000000000410769, 0.000000000000000000000119999, 
        0.000000000000000000000000364726, 0.00000000000000000000000000115606,},
        
        new double[]{0.000837732, 0.0000000590587, 0.000000000167348, 
        0.00000000000021648, 0.000000000000000378793, 0.000000000000000000723677,
        0.00000000000000000000149345, 0.00000000000000000000000325384,
        0.00000000000000000000000000739137, 0.0000000000000000000000000000173816}
        ),
    
    WGS72("WGS72", 6378135.0, 6356750.5, 0.001679206, 0.081818849, 6367447.239,
        new double[]{0.000837725, 0.00000076084, 0.00000000119762, 
        0.00000000000242909, 0.00000000000000571158, 0.0000000000000000147992, 
        0.0000000000000000000410745, 0.000000000000000000000119991, 
        0.000000000000000000000000364698, 0.00000000000000000000000000115596},
    
        new double[]{0.000837725, 0.0000000590577, 0.000000000167344, 
        0.000000000000216473, 0.000000000000000378777, 0.000000000000000000723641,
        0.00000000000000000000149337, 0.00000000000000000000000325362,
        0.00000000000000000000000000739081, 0.0000000000000000000000000000173801}),
    
    AGD65("AGD65", 6378160.0, 6356774.7, 0.001679263, 0.081820217, 6367471.839,
        new double[]{0.000837753, 0.000000760891, 0.00000000119774, 
        0.00000000000242941, 0.00000000000000571254, 0.0000000000000000148022,
        0.0000000000000000000410841, 0.000000000000000000000120023, 
        0.000000000000000000000000364808, 0.00000000000000000000000000115635,},
    
        new double[]{0.000837753, 0.0000000590617, 0.000000000167361, 
        0.000000000000216502, 0.000000000000000378841, 0.000000000000000000723786,
        0.00000000000000000000149372, 0.0000000000000000000000032545, 
        0.00000000000000000000000000739304, 0.0000000000000000000000000000173859}),
    
    KRASOVSKY_1940("KRASOVSKY_1940", 6378245.0, 6356863.0, 0.001678981, 0.08181337, 
        6367558.487, new double[]{0.000837612, 0.000000760636, 0.00000000119713, 
        0.00000000000242779, 0.00000000000000570775, 0.0000000000000000147873,
        0.0000000000000000000410359, 0.000000000000000000000119862,
        0.000000000000000000000000364258, 0.00000000000000000000000000115441},
    
        new double[]{0.000837613, 0.0000000590418, 0.000000000167277, 
        0.000000000000216356, 0.000000000000000378523, 0.000000000000000000723057,
        0.00000000000000000000149196, 0.00000000000000000000000325013, 
        0.00000000000000000000000000738188, 0.0000000000000000000000000000173568}),
    
    NAD27("NAD27", 6378206.4, 6356583.8, 0.001697916, 0.082271854, 6367399.689,
        new double[]{0.000847037, 0.000000777856, 0.00000000123803,
        0.000000000002539, 0.00000000000000603648, 0.0000000000000000158152,
        0.000000000000000000044383, 0.0000000000000000000001311, 
        0.000000000000000000000000402898, 0.00000000000000000000000000129141},
    
        new double[]{0.000847038, 0.0000000603846, 0.000000000172996, 
        0.000000000000226279, 0.000000000000000400347, 0.00000000000000000077337,
        0.00000000000000000000161377, 0.00000000000000000000000355513,
        0.00000000000000000000000000816568, 0.0000000000000000000000000000194166}),
    
    IN24("IN24", 6378388.0, 6356911.9, 0.001686344, 0.081991978, 6367654.477,
        new double[] {0.000841278, 0.00000076731, 0.00000000121293, 
        0.00000000000247059, 0.00000000000000583384, 0.0000000000000000151802,
        0.0000000000000000000423109, 0.000000000000000000000124128,
        0.000000000000000000000000378874, 0.00000000000000000000000000120605},
    
        new double[] {0.000841278, 0.0000000595622, 0.000000000169486, 
        0.000000000000220176, 0.000000000000000386894, 0.000000000000000000742289,
        0.00000000000000000000153836, 0.0000000000000000000000033659,
        0.00000000000000000000000000767836, 0.0000000000000000000000000000181332}),
    
    HAYFORD_1909("HAYFORD_1909", 6378388.0, 6356911.9, 0.001686344, 0.081991978, 
        6367654.477, new double[] {0.000841278, 0.00000076731, 0.00000000121293,
        0.00000000000247059, 0.00000000000000583384, 0.0000000000000000151802,
        0.0000000000000000000423109, 0.000000000000000000000124128,
        0.000000000000000000000000378874, 0.00000000000000000000000000120605},
    
        new double[]{0.000841278, 0.0000000595622, 0.000000000169486,
        0.000000000000220176, 0.000000000000000386894, 0.000000000000000000742289,
        0.00000000000000000000153836, 0.0000000000000000000000033659,
        0.00000000000000000000000000767836, 0.0000000000000000000000000000181332}),
    
    CLARKE_1880("CLARKE_1880", 6378249.1, 6356514.9, 0.001706683, 0.082483257, 
        6367386.637, new double[]{0.000851401, 0.000000785895, 0.00000000125727,
        0.00000000000259177, 0.00000000000000619373, 0.0000000000000000163109,
        0.0000000000000000000460102, 0.000000000000000000000136608, 
        0.000000000000000000000000421991, 0.00000000000000000000000000135966},
    
        new double[] {0.000851401, 0.0000000610115, 0.000000000175688, 
        0.000000000000230987, 0.000000000000000410786, 0.000000000000000000797633,
        0.000000000000000000001673, 0.00000000000000000000000370463, 
        0.00000000000000000000000000855299, 0.0000000000000000000000000000204428}),
    
    CLARKE_1866("CLARKE_1866", 6378206.4, 6356583.8, 0.001697916, 0.082271854, 
        6367399.689, new double[]{0.000847037, 0.000000777856, 0.00000000123803,
        0.000000000002539, 0.00000000000000603648, 0.0000000000000000158152,
        0.000000000000000000044383, 0.0000000000000000000001311, 
        0.000000000000000000000000402898, 0.00000000000000000000000000129141},
    
        new double[]{0.000847038, 0.0000000603846, 0.000000000172996,
        0.000000000000226279, 0.000000000000000400347, 0.00000000000000000077337,
        0.00000000000000000000161377, 0.00000000000000000000000355513,
        0.00000000000000000000000000816568, 0.0000000000000000000000000000194166}),
    
    AIRY_1830("AIRY_1830", 6377563.4, 6356256.9, 0.001673221, 0.081673399, 
        6366914.606, new double[]{0.000834746, 0.000000755436, 0.00000000118488,
        0.00000000000239469, 0.00000000000000561065, 0.0000000000000000144859,
        0.0000000000000000000400618, 0.000000000000000000000116616, 
        0.000000000000000000000000353177, 0.00000000000000000000000000111541},
    
        new double[]{0.000834746, 0.0000000586364, 0.000000000165562,
        0.000000000000213404, 0.000000000000000372077, 0.000000000000000000708307,
        0.00000000000000000000145651, 0.00000000000000000000000316202,
        0.00000000000000000000000000715713, 0.0000000000000000000000000000167705}),
    
    BESSEL_1841("BESSEL_1941", 6377397.2, 6356079.0, 0.001674185, 0.081696846, 
        6366742.561, new double[]{0.000835226, 0.000000756305, 0.00000000118692,
        0.00000000000240021, 0.00000000000000562681, 0.000000000000000014536,
        0.0000000000000000000402234, 0.000000000000000000000117154, 
        0.000000000000000000000000355011, 0.00000000000000000000000000112186},
    
        new double[]{0.000835226, 0.0000000587041, 0.000000000165848, 
        0.000000000000213896, 0.00000000000000037315, 0.000000000000000000710758,
        0.0000000000000000000014624, 0.00000000000000000000000317662,
        0.00000000000000000000000000719432, 0.0000000000000000000000000000168674}),
    
    EVEREST_1830("EVEREST_1830", 6377276.3, 6356075.4, 0.00166499, 0.08147292, 
        6366680.262, new double[] {0.000830648, 0.000000748035, 0.0000000011675,
        0.00000000000234798, 0.00000000000000547417, 0.0000000000000000140641,
        0.0000000000000000000387039, 0.000000000000000000000112109, 
        0.00000000000000000000000033786, 0.00000000000000000000000000106174},
    
        new double[]{0.000830649, 0.0000000580594, 0.000000000163133,
        0.000000000000209237, 0.000000000000000363017, 0.00000000000000000068766,
        0.0000000000000000000014071, 0.00000000000000000000000303972,
        0.00000000000000000000000000684646, 0.0000000000000000000000000000159635});
    
    
    private String datum;
    private final double equatorialRadius;
    private final double polarRadius;
    private final double meridianRadius;
    private final double flattening3D;
    private final double eccentricity;
    private final double[] alphaSeries;
    private final double[] betaSeries;
    
    private static final String[] datumNameArray = {Datum.WGS84.datum, Datum.AGD65.datum, Datum.AIRY_1830.datum,
        Datum.BESSEL_1841.datum, Datum.CLARKE_1866.datum, Datum.CLARKE_1880.datum,
        Datum.EVEREST_1830.datum, Datum.GRS80.datum, Datum.HAYFORD_1909.datum,
        Datum.IN24.datum, Datum.KRASOVSKY_1940.datum, Datum.NAD27.datum,
        Datum.NAD83.datum, Datum.WGS72.datum};
    
    
    public static final Set<String> DATUMS = new HashSet<>(Arrays.asList(datumNameArray));
       
    
    private Datum(String datum, double equatorialRadius, double polarRadius,
            double flattening3D, double eccentricity, double meridianRadius, 
            double[] alphaSeries, double[] betaSeries){
        
        this.datum = datum;
        this.equatorialRadius = equatorialRadius;
        this.polarRadius = polarRadius;
        this.meridianRadius = meridianRadius;
        this.flattening3D =  flattening3D;
        this.eccentricity = eccentricity;
        this.alphaSeries = alphaSeries;
        this.betaSeries = betaSeries;
        
    }
    
    /**
     * Get the datum.
     * @return datum
     */
    public String getDatum(){
        return datum;
    }
    
    /**
     * Get the datum's equatorial radius.
     * @return equatorialRadius
     */
    public double getEquatorialRadius(){
        return equatorialRadius;
    }
    
    /**
     * Get the datum's polar radius.
     * @return polarRadius
     */
    public double getPolarRadius(){
        return polarRadius;
    }
    
    /**
     * Get the datum's meridian radius.
     * @return meridianRadius
     */
    public double getMeridianRadius() {
        return meridianRadius;
    }
    
    /**
     * Get the datum's flattening 3D.
     * @return flattening3D
     */
    public double getFlattening3D() {
        return flattening3D;
    }
    
    /**
     * Get the datum's eccentricity.
     * @return eccentricity
     */
    public double getEccentricity() {
        return eccentricity;
    }
    
    /**
     * Get the datum's alpha series numbers calculated using a Krueger series.
     * @return alphaSeries
     */
    public double[] getAlphaSeries(){
        return alphaSeries;
    }
    
    /**
     * Get the datum's beta series numbers calculated using a Krueger series.
     * @return betaSeries
     */
    public double[] getBetaSeries() {
        return betaSeries;
    }
    
    /**
     * See if enumeration contains a specific datum's information or not.
     * @param datumToFind
     * @return boolean
     */
    public static boolean containsDatum(String datumToFind) {
        boolean datumFound = false;
        
        if (DATUMS.contains(datumToFind.toUpperCase()))
            datumFound = true;
        
        return datumFound;
    }
    
    
}
