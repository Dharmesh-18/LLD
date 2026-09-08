package D8_Mega_Food_App;

public class Cheese extends FoodDecorator {

    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " Cheese";
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 10;
    }
}
