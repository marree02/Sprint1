package Inlämningsuppgift1;

import javax.swing.*;

public class kottattande extends Växt implements printVäxt {


    private double baseShake = 0.1;
    private double extraShake = 0.2;

    public kottattande(double length,String name) {
        super(length,name);
    }

    public double getBaseShake() {
        return baseShake;
    }

    public double getExtraShake() {
        return extraShake;
    }

    public double calcKott(){
        return getBaseShake() + (getExtraShake() * getLength());
    }

    @Override
    public void print() {
        JOptionPane.showMessageDialog(null,"Köttätande växten: "+ getName() + " behöver " + calcKott()+"L "
                + Water.PROTEINDRYCK.typeOfWater + " om dagen");

    }
}
