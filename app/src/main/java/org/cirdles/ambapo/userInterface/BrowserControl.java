/*
 * Copyright 2006-2016 CIRDLES.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cirdles.ambapo.userInterface;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author evc1996
 */
public class BrowserControl {
    public static void showURI(String location) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(location);
            desktop.browse(oURL);
        } catch (URISyntaxException | IOException e) {
            // act dumb for now
        }
    }
}
