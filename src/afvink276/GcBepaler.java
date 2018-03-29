/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink276;

/**
 *
 * @author damia
 */
public class GcBepaler {
    private float gc = 0;
    private float totaal = 0;
    private String resultaat = "";
    private float gc_per;


     public String gcBerekenen(String nucSeq){
       for(int i = 0 ; i < nucSeq.length(); i ++) {
         char nuc = nucSeq.charAt(i);
         String nucleotide = Character.toString(nuc);
          if(nucleotide.toLowerCase().equals("g")||nucleotide.toLowerCase().equals("c") ){
              gc += 1;
               }
          else{
              totaal +=1;
          }
       }
       gc_per = gc / totaal * 100;
       resultaat = "Uw sequentie heeft de volgende gc percentage "+ Float.toString(gc_per);
       return resultaat;
    }
    
}
