package com.Love.ToCode.PizzaStores;

import com.Love.ToCode.Pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza pizza;


    public Pizza orderPizza(String type) {


        pizza = createPizza(type);

        pizza.prepare(); // abstract method from the pizza class
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // factory method
    // the store that is initialized its method that implements this abstract method is going to run
    // trying to create a different store that create its pizza in a different way
    protected abstract Pizza createPizza(String type);


}
