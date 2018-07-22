package com.glqdlt.example.exdesignpattern.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class RobotFactoryTest {

    @Test
    public void superRobot() {
        Robot superRobot = RobotFactory.createRobot("super");
        log.info(superRobot.getName());
        assertEquals("super",superRobot.getName());
    }

    @Test
    public void defaultRobot() {
        Robot defaultRobot = RobotFactory.createRobot("what?");
        log.info(defaultRobot.getName());
        assertEquals("default",defaultRobot.getName());
    }

    @Test
    public void normalRobot(){
        Robot normalRobot = RobotFactory.createRobot("normal");
        log.info(normalRobot.getName());
        Assert.assertEquals("normal",normalRobot.getName());
    }

}