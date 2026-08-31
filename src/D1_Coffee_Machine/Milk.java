package D1_Coffee_Machine;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDesc() {
        return coffee.getDesc() + ", Milk";
    }

    public double getCost() {
        return coffee.getCost() + 10.0;
    }
}
