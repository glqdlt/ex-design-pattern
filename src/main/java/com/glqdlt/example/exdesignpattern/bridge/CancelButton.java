package com.glqdlt.example.exdesignpattern.bridge;

public class CancelButton extends Button {

    public CancelButton() {
    }

    public CancelButton(ClickCallback clickListenFunction) {
        super(clickListenFunction);
    }

    @Override
    protected void clickImplements() {
        System.out.println("현재 작업을 취소하고 새로고침합니다.");
        refresh();
    }

    private void refresh(){
        System.out.println("새로고침!");
    }
}
