package Inlämningsuppgift1;

import javax.swing.*;

public class Main {


    public Main() {

        kaktus igge = new kaktus(20.0,Name.IGGE);
        palm laura = new palm( 5.0,Name.LAURA);
        kottattande meatloaf = new kottattande(0.7, Name.MEATLOAF);
        palm putte = new palm(1.0, Name.PUTTE);
        String v;
        while (true) {
            v = JOptionPane.showInputDialog("Vilken växt vill du vattna av Igge, Laura, Meatloaf, Putte?");
            if (v.equals(igge.nameI.typeOfName) || v.equals(laura.nameL.typeOfName) || v.equals(meatloaf.nameM.typeOfName) || v.equals(putte.nameP.typeOfName)) {
                JOptionPane.showMessageDialog(null, "Växten är inlaggd i växthotellet Greenest");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "växten är ej inlaggd i växthotellet Greenest");
            }
        }
        if (v.equals(igge.nameI.typeOfName)) {
            igge.print();
        } else if (v.equals(laura.nameL.typeOfName)) {
           laura.print();
        } else if (v.equals(meatloaf.nameM.typeOfName)) {
            meatloaf.print();
        } else if (v.equals(putte.nameP.typeOfName)) {
           putte.print();
        }


    }

    public static void main(String[] args) {

        Main m = new Main();
    }
}
