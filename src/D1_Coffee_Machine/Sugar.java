package D1_Coffee_Machine;

public class Sugar extends CoffeeDecorator{

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDesc() {
        return coffee.getDesc() + ", Sugar";
    }

    public double getCost() {
        return coffee.getCost() + 5.0;
    }
}
