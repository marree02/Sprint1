package Inlämningsuppgift1;

import javax.swing.*;

public class palm extends Växt implements printVäxt{

    protected Name nameL = Name.LAURA;
    protected Name nameP = Name.PUTTE;
    private double water = 0.5 ;

    public palm(double length, Name name) {
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
        if(name.equals(Name.LAURA)) {
            JOptionPane.showMessageDialog(null, "Palmen: " + nameL.typeOfName + " behöver " + calcPalm() + "L "
                    + Water.KRANVATTEN.typeOfWater +" om dagen");
        }else {
            JOptionPane.showMessageDialog(null, "Palmen: " + nameP.typeOfName + " behöver " + calcPalm() + "L "
                    + Water.KRANVATTEN.typeOfWater +" om dagen");
        }
    }
}
