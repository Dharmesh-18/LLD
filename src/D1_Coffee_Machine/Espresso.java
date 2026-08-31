package D1_Coffee_Machine;

public class Espresso implements Coffee{

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
