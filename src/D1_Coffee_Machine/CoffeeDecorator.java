package D1_Coffee_Machine;

public class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDesc() {
        return coffee.getDesc();
    }

    public double getCost() {
        return coffee.getCost();
    }
}
