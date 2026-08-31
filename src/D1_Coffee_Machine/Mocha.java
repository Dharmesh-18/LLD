package D1_Coffee_Machine;

public class Mocha implements Coffee{

    @Override
    public String getDesc() {
        return "Mocha";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
