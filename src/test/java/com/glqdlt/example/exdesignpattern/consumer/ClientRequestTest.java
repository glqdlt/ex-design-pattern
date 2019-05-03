package com.glqdlt.example.exdesignpattern.consumer;

import com.glqdlt.example.exdesignpattern.provider.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jhun
 * 2019-05-03
 */
public class ClientRequestTest {

    @Test
    public void callFacade() {
        GreetingFacade greetingFacade = new GreetingFacade();
        String res = greetingFacade.echo("jhun");
        Assert.assertEquals("Hello jhun", res);
    }

    @Test
    public void callStragy() {
        GreetingStragy greetingStragy = new GreetingStragy(new GreetingCustom());
        String res = greetingStragy.echo("jhun");
        Assert.assertEquals("wow~ jhun", res);
    }


    @Test
    public void callStragyNull() {
        GreetingStragy greetingStragy = new GreetingStragy(null);
        String res = greetingStragy.echo("jhun");
        Assert.assertEquals("hello jhun", res);
    }

    @Test
    public void callDefault() {
        Greeting greeting = new GrettingImpl();
        String res = greeting.echo("jhun");
        Assert.assertEquals("Hello jhun", res);
    }

    @Test
    public void callAdapter() {
        GreetingAdapter greetingAdapter = new GreetingAdapter(new GrettingImpl());
        String res = greetingAdapter.echo("jhun", 32);
        Assert.assertEquals("Hello name ==> jhun, old ==>32", res);
    }

    @Test
    public void callProxy() {
        Greeting greeting = new GreetingProxy(new GrettingImpl()) {
            @Override
            public void preHandler() {
                System.out.println("pre call~~~");
            }

            @Override
            public void postHandler() {
                System.out.println("post call~");
            }
        };
        Assert.assertEquals("Hello jhun", greeting.echo("jhun"));
    }

    @Test
    public void callProxyWithDeco() {
        Greeting greeting = new GreetingProxy(new GrettingImpl()) {
            @Override
            public void preHandler() {
                System.out.println("pre call~~~");
            }

            @Override
            public void postHandler() {
                System.out.println("post call~");
            }

            @Override
            public String deco(String name) {
                return name + "!!";
            }
        };
        Assert.assertEquals("Hello jhun!!", greeting.echo("jhun"));

    }
}