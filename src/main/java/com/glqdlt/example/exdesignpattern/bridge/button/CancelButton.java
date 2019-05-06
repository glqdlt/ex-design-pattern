package com.glqdlt.example.exdesignpattern.bridge.button;

public class CancelButton extends ButtonBase {

    public CancelButton() {
    }

    public CancelButton(ClickCallback clickListenFunction) {
        super(clickListenFunction);
    }

    @Override
    protected void clickImplements() {
        System.out.println("현재 작업을 취소하고 새로고침합니다.");
        refresh();
        System.out.println("새로고침 완료");
    }

    private void refresh(){
        System.out.println("새로고침!");
    }
}
