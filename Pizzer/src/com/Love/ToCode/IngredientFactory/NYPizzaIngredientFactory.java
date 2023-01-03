package com.Love.ToCode.IngredientFactory;
import com.Love.ToCode.Ingredient.*;
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce creatSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RegginanoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(),new Onion(),new Mushroom,new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPeperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
