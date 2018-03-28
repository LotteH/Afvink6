/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink276;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lotte
 */
public class Afvink276 extends JFrame implements ActionListener {

    // bestand zoeken
    JLabel bestandLabel;
    JButton bladerButton;

    //GC percentage
    static JTextField GCField;
    JLabel GCLabel;

    /**
     * Methode maakt GUI frame aan.
     */
    public static void main(String[] args) {
        Afvink276 frame = new Afvink276();
        frame.setSize(250, 150);
        frame.setTitle("DjeeSee Maker");
        frame.setResizable(false);
        frame.createGUI();
        frame.show();
    }

    /**
     * Methode creërt inhoud van de GUI.
     */
    public void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        //bestand zoeken
        bestandLabel = new JLabel("                         Ouvrez un fichier et lisez-le:                         ");
        window.add(bestandLabel);

        bladerButton = new JButton("                         Ouvert                         ");
        bladerButton.addActionListener(this);
        window.add(bladerButton);

        // GC percentage
        GCLabel = new JLabel("GC% =  ");
        window.add(GCLabel);

        GCField = new JTextField(10);
        window.add(GCField);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        File selectedFile;
        int reply;
        String bestand;

        if (event.getSource() == bladerButton) {
            try {
                AfvinkLogica.readFile(AfvinkLogica.kiesFile());
            } catch (IOException ex) {
                Logger.getLogger(Afvink276.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
