package Inlämningsuppgift1;

import javax.swing.*;
import java.util.StringJoiner;

public class kaktus extends Växt implements printVäxt{

    //inkapsling
    private int water = 2;
    public kaktus(double length, String name) {
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
        JOptionPane.showMessageDialog(null,"Kaktusen: "+ getName() + " behöver " + getWater() +"cl "+
                Water.MINERALVATTEN.typeOfWater+" om dagen");
    }
}
