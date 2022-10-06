package Inlämningsuppgift1;

public class Växt {
    protected Name name;
    private double length;




    public Växt(double length, Name name) {
       this.name = name;
        this.length = length;

    }


 public Name getName() {
       return name;
   }

   public void setName(String name) {
       this.name = Name.valueOf(name);
   }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}

