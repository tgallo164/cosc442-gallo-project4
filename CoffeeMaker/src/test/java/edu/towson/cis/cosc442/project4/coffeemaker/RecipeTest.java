package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
Does not specifically test the setter methods as they are also 
tested within the getter method tests
*/
public class RecipeTest {
    private Recipe recipe;
    @BeforeEach 
    void setUp(){
        recipe = new Recipe();
    }

    @Test
    void testEquals() {

    }

    @Test
    void testGetAmtChocolate() {
        int chocolateAmt = 1;
        recipe.setAmtChocolate(1);
        assertEquals(chocolateAmt, recipe.getAmtChocolate());
    }

    @Test
    void testGetAmtCoffee() {
        int coffeeAmt = 1;
        recipe.setAmtCoffee(1);
        assertEquals(coffeeAmt, recipe.getAmtCoffee());
    }

    @Test
    void testGetAmtMilk() {
        int milkAmt = 1;
        recipe.setAmtMilk(1);
        assertEquals(milkAmt, recipe.getAmtMilk());
    }

    @Test
    void testGetAmtSugar() {
        int sugarAmt = 1;
        recipe.setAmtSugar(1);
        assertEquals(sugarAmt, recipe.getAmtSugar());
    }

    @Test
    void testGetName() {
        String name = "Black";
        recipe.setName("Black");
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
        recipe.setName("Black");
        assertEquals(name, recipe.toString());
    }
}
