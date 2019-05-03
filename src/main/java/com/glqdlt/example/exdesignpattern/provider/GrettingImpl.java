package com.glqdlt.example.exdesignpattern.provider;

/**
 * @author Jhun
 * 2019-05-03
 */
public class GrettingImpl implements Greeting {
    @Override
    public String echo(String name) {
        return String.format("Hello %s", name);
    }
}
