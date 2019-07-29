package com.glqdlt.example.exdesignpattern.observer;

/**
 * @author Jhun
 * 2019-07-29
 */
public class Table implements Observer {

    private Integer tableNumber;

    public Table(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public void eventListener(Object event) {
        System.out.println(String.format("%s 표 그리기", event));
    }
}
