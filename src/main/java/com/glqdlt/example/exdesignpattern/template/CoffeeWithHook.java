package com.glqdlt.example.exdesignpattern.template;

/**
 * @author Jhun
 * 2019-05-10
 */
public class CoffeeWithHook extends HotDrink {
    @Override
    protected void brew() {
        System.out.println("난 호출안됨");
    }

    @Override
    public boolean hooking() {
        return false;
    }
}
