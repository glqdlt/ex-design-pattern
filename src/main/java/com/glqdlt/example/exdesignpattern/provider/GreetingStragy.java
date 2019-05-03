package com.glqdlt.example.exdesignpattern.provider;

/**
 * @author Jhun
 * 2019-05-03
 */
public class GreetingStragy {

    private Greeting greeting;

    public GreetingStragy(Greeting greeting) {
        this.greeting = greeting;
    }

    public String echo(String name){
        if(greeting == null){
            greeting = new GrettingImpl();
        }
        return greeting.echo(name);
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
}
