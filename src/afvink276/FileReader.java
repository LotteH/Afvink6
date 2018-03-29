package afvink276;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReader {

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

    public static String readFile(String bestandNaam) throws IOException {
        StringBuilder seq = new StringBuilder();
        try {
            BufferedReader inFile;
            inFile = new BufferedReader(new java.io.FileReader(bestandNaam));
            String line;
            inFile.readLine();
            while ((line = inFile.readLine()) != null) {

                seq.append(line); // -1 zorgt dat hij de lege tabs ook ziet
            }
            return seq.toString();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AfvinkLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
