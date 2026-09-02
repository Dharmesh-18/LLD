package D4_Pizza_Shop;

public class PepperoniPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pepperoni Pizza";
    }

    @Override
    public double getCost() {
        return 150;
    }
}
