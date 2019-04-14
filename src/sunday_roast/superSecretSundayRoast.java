package sunday_roast;

import java.util.ArrayList;

public class superSecretSundayRoast {

    private ArrayList<ingredient> ingredients = new ArrayList<ingredient>();

    public void addIngredient(ingredient i) {
        this.ingredients.add(i);
    }

    public ArrayList<ingredient> getIngredients() {
        return this.ingredients;
    }

    public ArrayList<ingredient> getIngredients(String password) {
        if (password.equals("strongpassword123")) {
            return this.ingredients;
        } else
            return null;

    }
    private void checkIngredients(){
        Scanner myScanner = new Scanner (System.in);
        System.out.println("So, you want to view th ingreddies eh? password first young one!");
        String password = myScanner.nextLine();
        ArrayList<ingredient i : ingredients>

    }




}