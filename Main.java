package Inlämningsuppgift1;

import javax.swing.*;

public class Main {
//test för github:)

    public Main() {

        kaktus igge = new kaktus("Igge", 20.0);
        palm laura = new palm("Laura", 5.0);
        kottattande meatloaf = new kottattande("Meatloaf", 0.7);
        palm putte = new palm("Putte", 1.0);
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
