package com.glqdlt.example.exdesignpattern.provider;

/**
 * @author Jhun
 * 2019-05-03
 */
public class GreetingCustom implements Greeting {
    @Override
    public String echo(String name) {
        return "wow~ " + name;
    }
}
