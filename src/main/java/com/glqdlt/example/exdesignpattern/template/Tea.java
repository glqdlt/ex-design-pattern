package com.glqdlt.example.exdesignpattern.template;

/**
 * @author Jhun
 * 2019-05-10
 */
public class Tea extends HotDrink{
    @Override
    protected void brew() {
        System.out.println("녹차를 만들다");
    }
}
