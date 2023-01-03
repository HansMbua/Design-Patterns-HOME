package com.Love.ToCode.PizzaStores;

import com.Love.ToCode.IngredientFactory.PizzaIngredientFactory;
import com.Love.ToCode.IngredientFactory.ChicagoPizzaIngredientFactory;
import com.Love.ToCode.Pizzas.Pizza;
import com.Love.ToCode.otherPizzas.CheesePizza;
import com.Love.ToCode.otherPizzas.ClamPizza;
import com.Love.ToCode.otherPizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{





    //abstract Method
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
          pizza = new CheesePizza(ingredientFactory);
          pizza.setName("Chicago Style cheese Pizza");
        } else if (type.equals("veggie")) {
           pizza = new VeggiePizza(ingredientFactory);
           pizza.setName("chicago style Veggie pizza");
        } else if (type.equals("clam")) {
           pizza = new ClamPizza(ingredientFactory);
           pizza.setName("chicago clam pizza");
        }

        return pizza;

    }
}
