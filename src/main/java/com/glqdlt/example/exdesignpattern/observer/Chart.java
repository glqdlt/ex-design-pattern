package com.glqdlt.example.exdesignpattern.observer;

/**
 * @author Jhun
 * 2019-07-29
 */
public class Chart implements Observer {
    private String text;

    @Override
    public void eventListener(Object event) {
        String text = (String) event;
        this.text = text;
        draw();
    }

    public void draw(){
        System.out.println(String.format("%s 에 맞는 차트 그리기",text));
    }
}
