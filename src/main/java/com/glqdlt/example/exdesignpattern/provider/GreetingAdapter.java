package com.glqdlt.example.exdesignpattern.provider;

/**
 * @author Jhun
 * 2019-05-03
 */
public class GreetingAdapter {

    private Greeting greeting;

    public GreetingAdapter(Greeting greeting) {
        this.greeting = greeting;
    }

    public String echo(String name, Integer old) {
        return greeting.echo(String.format("name ==> %s, old ==>%s", name, old));
    }
}
