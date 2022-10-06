package Inlämningsuppgift1;

import javax.swing.*;

public class kaktus extends Växt implements printVäxt{

    //inkapsling
    public Name nameI = Name.IGGE;
    private int water = 2;
    public kaktus(double length, Name name) {
        super(length, name);

    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    @Override
    public void print() {
        JOptionPane.showMessageDialog(null,"Kaktusen: "+ nameI.typeOfName + " behöver " + getWater() +"cl "+
                Water.MINERALVATTEN.typeOfWater+" om dagen");
    }
}
