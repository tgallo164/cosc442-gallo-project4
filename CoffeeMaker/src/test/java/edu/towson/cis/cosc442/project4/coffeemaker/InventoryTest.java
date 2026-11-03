package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    private Inventory inventory;
    private Recipe recipe;
    @BeforeEach
    void setUp(){
        inventory = new Inventory();
        recipe = new Recipe();
        inventory.setCoffee(1);
        inventory.setMilk(1);
        inventory.setSugar(1);
        inventory.setChocolate(1);
        recipe.setAmtChocolate(1);
        recipe.setAmtCoffee(1);
        recipe.setAmtMilk(1);
        recipe.setAmtSugar(1);
        recipe.setName("Black");
    }

    @Test
    void testEnoughIngredients() {
        boolean isEnough = true;
        assertEquals(isEnough, inventory.enoughIngredients(recipe));
    }

    @Test
    void testGetChocolate() {
        int chocolateAmt = 1;
        assertEquals(chocolateAmt, inventory.getChocolate());
    }

    @Test
    void testGetCoffee() {
        int coffeeAmt = 1;
        assertEquals(coffeeAmt, inventory.getCoffee());
    }

    @Test
    void testGetMilk() {
        int milkAmt = 1;
        assertEquals(milkAmt, inventory.getMilk());
    }

    @Test
    void testGetSugar() {
        int sugarAmt = 1;
        assertEquals(sugarAmt, inventory.getSugar());
    }

    @Test
    void testToString() {
        String amounts = "Coffee: " + inventory.getCoffee() + "\n" + "Milk: " + inventory.getMilk() + "\n"
        + "Sugar: " + inventory.getSugar() + "\n" + "Chocolate: " + inventory.getChocolate() + "\n";

        assertEquals(amounts, inventory.toString());
    }
}
