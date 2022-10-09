package Inlämningsuppgift1;

import javax.swing.*;

public class Main {


    public Main() {

        //Polymorfism
        Växt igge = new kaktus(20,"Igge");
        Växt laura = new palm( 5.0,"Laura");
        Växt meatloaf = new kottattande(0.7, "Meatloaf");
        Växt putte = new palm(1.0, "Putte");
        String v;
        while (true) {
            v = JOptionPane.showInputDialog("Vilken växt vill du vattna av Igge, Laura, Meatloaf, Putte?");
            if (v.equals(igge.getName()) || v.equals(laura.getName()) || v.equals(meatloaf.getName()) || v.equals(putte.getName())) {
                JOptionPane.showMessageDialog(null, "Växten är inlaggd i växthotellet Greenest");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "växten är ej inlaggd i växthotellet Greenest");
             }
        }
        //polymorfism metoden hämtas från de olika objekten
        if (v.equals(igge.getName())) {
            igge.print();
        } else if (v.equals(laura.getName())) {
           laura.print();
        } else if (v.equals(meatloaf.getName())) {
            meatloaf.print();
        } else if (v.equals(putte.getName())) {
           putte.print();
        }


    }

    public static void main(String[] args) {

        Main m = new Main();
    }
}
