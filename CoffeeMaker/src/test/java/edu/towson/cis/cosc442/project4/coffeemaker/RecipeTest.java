package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RecipeTest {
    private Recipe recipe;
    private Recipe recipe2;
    @BeforeEach 
    void setUp(){
        recipe = new Recipe();
        recipe.setName("Black");
        recipe.setAmtChocolate(1);
        recipe.setAmtCoffee(1);
        recipe.setAmtMilk(1);
        recipe.setAmtSugar(1);

    }

    @Test
    void testEquals() {
        recipe2 = new Recipe();
        recipe2.setName("Black");
        assertEquals(true, recipe.equals(recipe2));
    }

    @Test
    void testGetAmtChocolate() {
        int chocolateAmt = 1;
        assertEquals(chocolateAmt, recipe.getAmtChocolate());
    }

    @Test
    void testGetAmtCoffee() {
        int coffeeAmt = 1;
        assertEquals(coffeeAmt, recipe.getAmtCoffee());
    }

    @Test
    void testGetAmtMilk() {
        int milkAmt = 1;
        assertEquals(milkAmt, recipe.getAmtMilk());
    }

    @Test
    void testGetAmtSugar() {
        int sugarAmt = 1;
        assertEquals(sugarAmt, recipe.getAmtSugar());
    }

    @Test
    void testGetName() {
        String name = "Black";
        assertEquals(name, recipe.getName());
    }

    @Test
    void testGetPrice() {
        int price = 1;
        recipe.setPrice(1);
        assertEquals(price, recipe.getPrice());
    }

    @Test
    void testToString() {
        String name = "Black";
        assertEquals(name, recipe.toString());
    }

    @Test
    void testSetAmtChocolate() {
        recipe.setAmtChocolate(-1);
        assertEquals(0, recipe.getAmtChocolate());
    }

    @Test
    void testSetAmtCoffee() {
        recipe.setAmtCoffee(-1);
        assertEquals(0, recipe.getAmtCoffee());
    }

    @Test
    void testSetAmtMilk() {
        recipe.setAmtMilk(-1);
        assertEquals(0, recipe.getAmtMilk());
    }

    @Test
    void testSetAmtSugar() {
        recipe.setAmtSugar(-1);
        assertEquals(0, recipe.getAmtSugar());
    }

    @Test
    void testSetPrice() {
        recipe.setPrice(-1);
        assertEquals(0, recipe.getPrice());
    }
}
