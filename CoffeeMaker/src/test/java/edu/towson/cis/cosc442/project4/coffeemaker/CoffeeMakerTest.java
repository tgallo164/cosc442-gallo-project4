package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {
    private CoffeeMaker coffee;
    private Inventory inventory;
    private Recipe recipe1;
    private Recipe recipe2;


    @BeforeEach 
    void setUp(){
    coffee = new CoffeeMaker();
    inventory = new Inventory();
    recipe1 = new Recipe();
    recipe2 = new Recipe();
    recipe1.setPrice(1);
    recipe1.setName("Black");
    recipe2.setName("Decaf");
    recipe2.setPrice(1);
    coffee.addRecipe(recipe1);
    coffee.addRecipe(recipe2);
    }

    @Test
    void testAddInventory() {
        boolean canAddInventory = true;
        assertEquals(canAddInventory, coffee.addInventory(1, 1, 0, 1));
        assertEquals(false, coffee.addInventory(0, 0, 1, 0));
        assertEquals(canAddInventory, coffee.addInventory(0, 0, 0, 0));
        coffee.addInventory(5, 5, 0, 2);
        assertEquals(21, coffee.checkInventory().getCoffee());
        assertEquals(21, coffee.checkInventory().getMilk());
        assertEquals(15, coffee.checkInventory().getSugar());
        assertEquals(18, coffee.checkInventory().getChocolate());
        
    }

    @Test
    void testAddRecipe() {
        boolean canAddRecipe = true;
        Recipe recipe3 = new Recipe();
        assertEquals(canAddRecipe, coffee.addRecipe(recipe3));
        assertEquals(false, coffee.addRecipe(recipe1));
        Recipe recipe4 = new Recipe();
        coffee.addRecipe(recipe4);
        Recipe recipe5 = new Recipe();
        assertEquals(false, coffee.addRecipe(recipe5));
    }

    @Test
    void testCheckInventory() {
        inventory = coffee.checkInventory();
        assertEquals(inventory, coffee.checkInventory());
    }

    @Test
    void testDeleteRecipe() {
        boolean canDeleteRecipe = true;
        Recipe recipe3 = new Recipe();
        assertEquals(canDeleteRecipe, coffee.deleteRecipe(recipe1));
        assertEquals(false, coffee.deleteRecipe(null));
        assertEquals(false, coffee.deleteRecipe(recipe3));
    }

    @Test
    void testEditRecipe() {
        boolean canEditRecipe = true;
        assertEquals(canEditRecipe, coffee.editRecipe(recipe1, recipe2));
        Recipe recipe3 = new Recipe();
        recipe3.setName("Latte");
        assertEquals(false, coffee.editRecipe(recipe1, recipe3));
    }

    @Test
    void testGetRecipeForName() {
        assertEquals(recipe1, coffee.getRecipeForName("Black"));
    }

    @Test
    void testGetRecipes() {
        assertEquals(coffee.getRecipes(), coffee.getRecipes());
    }

    @Test
    void testMakeCoffee() {
        int change = 1;
        assertEquals(change, coffee.makeCoffee(recipe1, 2));

    }
}
