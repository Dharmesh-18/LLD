package D8_Mega_Food_App;

public class Burger implements FoodItem {

    @Override
    public String getDescription() {
        return "Burger with fresh veggies and patty";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
