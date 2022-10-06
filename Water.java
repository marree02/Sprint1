package Inlämningsuppgift1;

public enum Water {


    MINERALVATTEN("Mineralvatten"), PROTEINDRYCK("Proteindryck"), KRANVATTEN("Kranvatten");
    public final String typeOfWater;

    Water(String w){
        this.typeOfWater = w;
    }

}
