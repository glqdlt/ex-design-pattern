package com.glqdlt.example.exdesignpattern.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jhun
 * 2019-05-10
 */
public class HotDrinkTest {

    @Test
    public void templatePattern() {
        HotDrink coffee = new Coffee();
        coffee.drink();

        HotDrink coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.drink();

    }
}