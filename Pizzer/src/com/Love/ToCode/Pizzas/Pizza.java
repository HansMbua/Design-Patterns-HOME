package com.Love.ToCode.Pizzas;

import com.Love.ToCode.Ingredient.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies verggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;


    /**
     * we made this method abstract because we will get the ingredient from here
     */
    public abstract void prepare();


    //   protected ArrayList toppings = new ArrayList();

//        System.out.println("Preparing " + name);
//        System.out.println("Tossing dough...");
//        System.out.println("Adding sauce...");
//        System.out.println("Adding toppings:");
//
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println(" "+toppings.get(i));
//        }


    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices ");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return null;
    }
}
