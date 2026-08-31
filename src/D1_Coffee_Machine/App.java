package D1_Coffee_Machine;

public class App {

    public static void main(String[] args) {


        System.out.println("+++++++++++Espresso++++++++++++++");

        Coffee espresso = new Espresso();
        System.out.println("Cost: " + espresso.getCost() + " Desc: " + espresso.getDesc());
        espresso = new Milk(espresso);
        System.out.println("Cost: " + espresso.getCost() + " Desc: " + espresso.getDesc());

        System.out.println("+++++++++++Mocha++++++++++++++");

        Coffee mocha = new Mocha();
        System.out.println("Cost: " + mocha.getCost() + " Desc: " + mocha.getDesc());
        mocha = new Sugar(mocha);
        System.out.println("Cost: " + mocha.getCost() + " Desc: " + mocha.getDesc());

    }
}
