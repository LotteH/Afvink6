package afvink276;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class HTMLGenerator {

    private float gcPercentage;

    public static void main(String[] args) {
        HTMLGenerator generator = new HTMLGenerator(50.25f);
        generator.createHTMLFile();
    }
    public HTMLGenerator(float f){
        this.gcPercentage = f;
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
        htmlArray.add("<p>"+gcPercentage+"% GC zit er in uw sequentie!</p>");
        htmlArray.add("</body>");
        htmlArray.add("</html>");
        return htmlArray;
    }
}
