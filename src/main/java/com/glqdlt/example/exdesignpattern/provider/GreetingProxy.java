package com.glqdlt.example.exdesignpattern.provider;

/**
 * @author Jhun
 * 2019-05-03
 */
public abstract class GreetingProxy implements Greeting {

    private Greeting greeting;

    public GreetingProxy(Greeting target) {
        this.greeting = target;
    }

    public String echo(String name) {
        preHandler();
        String n = deco(name);
        String res = greeting.echo(n);
        postHandler();
        return res;
    }

    public String deco(String name) {
        return name;
    }

    public abstract void preHandler();

    public abstract void postHandler();
}
