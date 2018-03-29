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

    private static float gcPercentage;

    public static void openEnLeesBestand(){
        try {
            afvink276.FileReader reader = new afvink276.FileReader();
            reader.readFile(reader.kiesFile());
            // TODO: gc percentage berekenen en plaatsten in de atribuut in deze class!!!!!!
            HTMLGenerator generator = new HTMLGenerator();
        } catch (IOException ex) {
            Logger.getLogger(Afvink276.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static float getGcPercentage() {
        return gcPercentage;
    }
}
