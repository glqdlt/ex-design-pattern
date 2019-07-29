package com.glqdlt.example.exdesignpattern.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jhun
 * 2019-07-29
 */
public class EventListener {

    private List<Observer> observers = new LinkedList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void sendEvent(Object event) {
        for (Observer o : observers) {
            o.eventListener(event);
        }
    }
}
