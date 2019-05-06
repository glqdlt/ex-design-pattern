package com.glqdlt.example.exdesignpattern.bridge.button;

public abstract class ButtonBase implements Button {
//    자바8의 default 메소드를 통해 인터페이스를 선언할 수도 있지만, default 메소드에는 final 키워드를 적용하질 못한다.
//    click 에 final 을 걸어두는 것은 상속을 해서 clickEventListenr()를 재정의 해서 없애버린다던지의.. 제한을 두고 싶기 때문이다.

    private ClickCallback clickListenFunction;

    public ButtonBase() {
    }

    public ButtonBase(ClickCallback clickListenFunction) {
        this.clickListenFunction = clickListenFunction;
    }

    @Override
    public final void click() {
        clickEventListener();
        clickImplements();
    };

    protected abstract void clickImplements();

    private void clickEventListener(){
        System.out.println("외부의 클릭 이벤트를 수행");
        if (clickListenFunction != null) {
            this.clickListenFunction.handler();
        }else{
            System.out.println("클릭 이벤트리스너가 없어서 그냥 pass");
        }
    };

}
