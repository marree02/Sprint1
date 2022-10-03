package Inlämningsuppgift1;

import javax.swing.*;

public class palm extends Växt implements printVäxt{

    private double water = 0.5 ;

    public palm(String name, double length) {
        super(name, length);
    }

    public double getWater() {
        return water;
    }

    public double calcPalm(){
        return getWater() * getLength();
    }

    @Override
    public void print() {
        JOptionPane.showMessageDialog(null,"Palmen: "+ getName() + " behöver " + calcPalm() +"L vatten om dagen");

    }
}
