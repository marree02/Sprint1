package Inlämningsuppgift1;

import javax.swing.*;

public class kaktus extends Växt implements printVäxt{

    private int mineralWater = 2;

    public kaktus(String name, double length) {
        super(name, length);

    }

    public int getWater() {
        return mineralWater;
    }

    @Override
    public void print() {
        JOptionPane.showMessageDialog(null,"Kaktusen: "+ getName() + " behöver " + mineralWater +"cl mineral vatten om dagen");
    }
}
