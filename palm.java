package Inlämningsuppgift1;

import javax.swing.*;

public class palm extends Växt implements printVäxt{
    private double water = 0.5 ;

    public palm(double length, String name) {
        super(length, name);

    }

    public double getWater() {
        return water;
    }

    public double calcPalm(){
        return getWater() * getLength();
    }

    @Override
    public void print() {
            JOptionPane.showMessageDialog(null, "Palmen: " + getName() + " behöver " + calcPalm() + "L "
                    + Water.KRANVATTEN.typeOfWater +" om dagen");

        }
    }

