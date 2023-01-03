package com.Love.ToCode.PizzaStores;

import com.Love.ToCode.IngredientFactory.PizzaIngredientFactory;
import com.Love.ToCode.IngredientFactory.NYPizzaIngredientFactory;

import com.Love.ToCode.Pizzas.Pizza;
import com.Love.ToCode.otherPizzas.CheesePizza;
import com.Love.ToCode.otherPizzas.ClamPizza;
import com.Love.ToCode.otherPizzas.PepperoniPizzeria;
import com.Love.ToCode.otherPizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {


    // implementation of the factory method
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New Your Style Cheese Pizza");

        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("new York style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizzeria(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
