import java.awt.*;

public class Case {

    //Trying to test

    String model;
    String manuFacturer;
    String powerSupply;
    Dimension dimension;

    //testtest


    public Case(String model, String manuFacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manuFacturer = manuFacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public  static void pressPowerButton(){
        System.out.println("Power Button Pressed");

    }

    public String getModel() {
        return model;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manuFacturer='" + manuFacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}
