/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink276;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author lotte
 */
public class AfvinkLogica {

    static String[] aRegel;

    public static String kiesFile() {

        JFileChooser filechooser = new JFileChooser();

        int reply = filechooser.showOpenDialog(null);
        if (reply == JFileChooser.APPROVE_OPTION) {

            File selectedFile = filechooser.getSelectedFile();
            String bestandNaam = selectedFile.getAbsolutePath();
            return bestandNaam;
        }
        return null;
    }

    public static void readFile(String bestandNaam) throws IOException {

        try {
            BufferedReader inFile;
            inFile = new BufferedReader(new FileReader(bestandNaam));
            String line;
            inFile.readLine();
            while ((line = inFile.readLine()) != null) {

                aRegel = line.split("\t", -1); // -1 zorgt dat hij de lege tabs ook ziet
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AfvinkLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
