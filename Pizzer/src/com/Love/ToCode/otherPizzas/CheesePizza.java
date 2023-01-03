package com.Love.ToCode.otherPizzas;

import com.Love.ToCode.IngredientFactory.PizzaIngredientFactory;
import com.Love.ToCode.Pizzas.Pizza;

public class CheesePizza extends Pizza {


   private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.creatSauce();
        cheese = ingredientFactory.createCheese();

    }
}
