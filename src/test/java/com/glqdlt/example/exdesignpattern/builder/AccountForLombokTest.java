package com.glqdlt.example.exdesignpattern.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class AccountForLombokTest {

    @Test
    public void isBuildAccount() {
        AccountForLombok accountForLombok = AccountForLombok.builder().id("아이디").address("어디주소").phone("123-123-123").build();
        log.info(accountForLombok.toString());
        Assert.assertEquals("아이디",accountForLombok.getId());
        Assert.assertNull(accountForLombok.getName());
    }
}