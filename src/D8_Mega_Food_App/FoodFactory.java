package D8_Mega_Food_App;

public class FoodFactory {

    public static FoodItem createFoodItem(String type) {
        if(type == null) {
            throw new IllegalArgumentException("Type cannot be empty!");
        }

        switch(type) {
            case "BURGER" -> {
                return new Burger();
            }
            case "PIZZA" -> {
                return new Pizza();
            }
            default -> {
                throw new IllegalArgumentException("Unsupported food type provided!");
            }
        }
    }
}
