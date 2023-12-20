package com.example.firstProject.ioc;

public class IngredientFactory {
    public Ingredient get(String menu) {
        switch(menu){
            case "돈까스":
                return new Pork("한우 등심");
            default: return null;
        }
    }
}
