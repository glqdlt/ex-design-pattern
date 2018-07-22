package com.glqdlt.example.exdesignpattern.builder;

import com.glqdlt.example.exdesignpattern.builder.Account;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class AccountTest {

    @Test
    public void isBuildAccount() {
        Account.Builder accountBuilder = new Account.Builder("이름", "아이디", "패스워드");
        accountBuilder.setAddress("서울");
        accountBuilder.setEmail("이메일@이메일.com");
        accountBuilder.setPhone("123-123-123");
        Account someAccount = accountBuilder.build();
        log.info(someAccount.toString());
        Assert.assertEquals("아이디",someAccount.getId());
        Assert.assertEquals("123-123-123",someAccount.getPhone());
    }

    @Test
    public void isBuildAccount2(){
        Account someAccount = new Account.Builder("이름","아이디","패스워드").setAddress("지구").build();
        log.info(someAccount.toString());
        Assert.assertEquals("아이디",someAccount.getId());
        Assert.assertNull(someAccount.getPhone());
    }
}