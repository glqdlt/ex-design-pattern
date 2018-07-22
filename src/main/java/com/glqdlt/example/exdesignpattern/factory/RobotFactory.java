package com.glqdlt.example.exdesignpattern.factory;

class RobotFactory {

    static Robot createRobot(String name){
        switch (name){
            case "normal" :
                return new NormalRobot();
            case "super" :
                return new SuperRobot();
            default:
                return new DefaultRobot();
        }
    }
}
