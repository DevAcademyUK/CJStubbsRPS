package sunday_roast;

import java.util.ArrayList;

public class makeRoast {

    superSecretSundayRoast roast = new superSecretSundayRoast();


    public static void main(String[] args) {
        makeRoast mr = new makeRoast();
        mr.addIngredients();
    }

    private void addIngredients() {
        roast.addIngredient(new ingredient("Chicken", 12));
        roast.addIngredient(new ingredient("Roast Potatoes", 200));
        roast.addIngredient(new ingredient("Broccoli", 4));
        roast.addIngredient(new ingredient("Cauliflower", 4));
        roast.addIngredient(new ingredient("Peas", 7000));
        roast.addIngredient(new ingredient("Carrots", 75));
        roast.addIngredient(new ingredient("Cabbages", 4));
        roast.addIngredient(new ingredient("Parsnips", 2));
        roast.addIngredient(new ingredient("Brussel Sprouts", -1));

    }


    private void checkIngredients() {
        for (ingredient i : roast.getIngredients()) {
            System.out.println("ingredient: " + i.ingredientName
                    + ", amount: " + i.ingredientQuantity);
        }
    }

  }

