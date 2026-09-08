package D8_Mega_Food_App;

public class Pizza implements FoodItem {

    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
