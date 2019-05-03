package com.glqdlt.example.exdesignpattern.provider;

/**
 * @author Jhun
 * 2019-05-03
 */
public class GreetingFacade {

    private Greeting greeting;

    public GreetingFacade() {
        greeting = new GrettingImpl();
    }

    public String echo(String name) {
        return greeting.echo(name);
    }
}
