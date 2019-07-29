package com.glqdlt.example.exdesignpattern.observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jhun
 * 2019-07-29
 */
public class WhiteBoardTest {

    @Test
    public void drawBoard() {

        Chart chart = new Chart();
        Table table1 = new Table(1);
        Table table2 = new Table(2);

        EventListener eventListener = new EventListener();
        eventListener.addObserver(chart);
        eventListener.addObserver(table1);
        eventListener.addObserver(table2);

        WhiteBoard whiteBoard = new WhiteBoard(eventListener);
        whiteBoard.setText("대한민국 서울 아파트 가격");

    }
}