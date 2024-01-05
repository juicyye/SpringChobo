package com.example.firstProject.ioc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {
    @Test
    void 돈까스(){
        IngredientFactory ingredientFactory = new IngredientFactory();
        Chef chef = new Chef(ingredientFactory);
        String menu = "돈까스";

        // 수행
        String food = chef.cook(menu);

        String expected = "한우 등심으로 만든 돈까스";

        assertEquals(expected, food);
    }

}