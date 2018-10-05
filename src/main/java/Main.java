import java.awt.*;

public class Main {
    public static void main(String[] args) {
       Dimensions d = new Dimensions(20,25,5);
       Monitor m = new Monitor("27 inch Beast ",27,"Hp",new Resolution(100,200));
       Motherboard mB = new Motherboard("Bj-300","Pentium",4,6,"V2.44");
       Case computerCase = new Case("H420","Fuji","240 powerSupply",new Dimension());
       PC personal = new PC(computerCase,m,mB);

       personal.description();
        personal.poweUp("Osx112");


        //============================
    }

   
}
