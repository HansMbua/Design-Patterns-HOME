package com.Love.ToCode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription()+" "+ beverage.cost());


        //ordering HouseBlend
        Beverage beverage1 = new Espresso("LARGE");

        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription()+" total: €"+beverage1.cost());




    }
}
