package com.glqdlt.example.exdesignpattern.observer;

/**
 * @author Jhun
 * 2019-07-29
 */
public class WhiteBoard {

    private EventListener eventListener;

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.eventListener.sendEvent(this.getText());
    }

    public WhiteBoard(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
