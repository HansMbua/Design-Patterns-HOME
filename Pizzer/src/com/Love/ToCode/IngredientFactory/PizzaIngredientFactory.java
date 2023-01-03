package com.Love.ToCode.IngredientFactory;

import com.Love.ToCode.Ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce creatSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPeperoni();
    public Clams createClam();
}
