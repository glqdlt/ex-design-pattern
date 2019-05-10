package com.glqdlt.example.exdesignpattern.template;

/**
 * @author Jhun
 * 2019-05-10
 */
public abstract class HotDrink {

    private void setting(){
        System.out.println("준비 중..");
    }

    private void drop(){
        System.out.println("추출 중");
    }

    protected abstract void brew();

    public final void drink(){
        setting();
        if(hooking()){
            brew();
        }
        drop();
        System.out.println("꿀꺽 꿀꺽");
    }

    public boolean hooking(){
        return true;
    }
}
