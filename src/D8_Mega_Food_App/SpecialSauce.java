package D8_Mega_Food_App;

public class SpecialSauce extends FoodDecorator {

    public SpecialSauce(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " Special Sauce";
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 15;
    }
}
