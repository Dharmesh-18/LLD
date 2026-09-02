package D4_Pizza_Shop;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
}
