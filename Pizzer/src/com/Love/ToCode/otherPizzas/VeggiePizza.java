package com.Love.ToCode.otherPizzas;

import com.Love.ToCode.IngredientFactory.PizzaIngredientFactory;
import com.Love.ToCode.IngredientFactory.NYPizzaIngredientFactory;
import com.Love.ToCode.Pizzas.Pizza;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing: "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.creatSauce();
        cheese = ingredientFactory.createCheese();

    }
}
