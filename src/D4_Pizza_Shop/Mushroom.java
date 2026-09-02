package D4_Pizza_Shop;

public class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }
}
