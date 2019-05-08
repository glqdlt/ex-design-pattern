package com.glqdlt.example.exdesignpattern.fpp;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

/**
 * @author Jhun
 * 2019-05-07
 */
public class CurriedTest {

    Function<Integer, Function<Integer, Integer>> aaaa = x -> y -> x + y;

    Function<Integer, Function<Integer, Integer>> aaa2 = x -> {return y -> x + y;};

    Function<Integer, Function<Integer, Integer>> bbbb = (x) -> {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + x;
            }
        };
    };

    @Test

    public void name() {

        Assert.assertEquals(3, (int) aaaa.apply(1).apply(2));
        Assert.assertEquals(3, (int) bbbb.apply(1).apply(2));

    }
}