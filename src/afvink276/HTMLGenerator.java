package afvink276;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class HTMLGenerator {

    private String gcPercentage;

    public HTMLGenerator(){
        this.gcPercentage = AfvinkLogica.getGcPercentage();
        try {
            Desktop.getDesktop().open(new File("gcSite.html"));
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }

    private void createHTMLFile(){
        ArrayList<String> htmlScript = createHTML();;
        try {
            FileWriter writer = new FileWriter("gcSite.html");
            BufferedWriter buffer = new BufferedWriter(writer);
            for(String text : htmlScript) {
                buffer.write(text);
            }
            buffer.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,"error: "+e.toString());
        }
    }

    private ArrayList<String> createHTML(){
        ArrayList<String> htmlArray = new ArrayList<>();
        htmlArray.add("<html>");
        htmlArray.add("<body>");
        htmlArray.add("<p>"+gcPercentage+"</p>");
        htmlArray.add("</body>");
        htmlArray.add("</html>");
        return htmlArray;
    }
}
