package com.Love.ToCode.IngredientFactory;

import com.Love.ToCode.Ingredient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce creatSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzeralla();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Spinich(), new Eggeplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPeperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
