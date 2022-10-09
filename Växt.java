package Inlämningsuppgift1;

public class Växt {


    private String name;
    private double length;




    public Växt(double length, String name) {
       this.name = name;
        this.length = length;

    }


 public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void print() {
    }
}

