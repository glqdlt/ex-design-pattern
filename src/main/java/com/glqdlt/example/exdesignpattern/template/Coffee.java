package com.glqdlt.example.exdesignpattern.template;

/**
 * @author Jhun
 * 2019-05-10
 */
public class Coffee extends HotDrink {
    @Override
    protected void brew() {
        System.out.println("커피를 만들자");
    }
}
