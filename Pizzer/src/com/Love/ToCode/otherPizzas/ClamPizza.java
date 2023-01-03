package com.Love.ToCode.otherPizzas;

import com.Love.ToCode.IngredientFactory.PizzaIngredientFactory;
import com.Love.ToCode.Pizzas.Pizza;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.creatSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();

    }
}
