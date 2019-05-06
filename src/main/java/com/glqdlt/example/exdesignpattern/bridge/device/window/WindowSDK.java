package com.glqdlt.example.exdesignpattern.bridge.device.window;

import com.glqdlt.example.exdesignpattern.bridge.device.Device;

public interface WindowSDK extends Device {
    default void checkLicense(String license) {
        System.out.println("마이크로소프트에 등록 된 SDK 인지 확인합니다..");
        System.out.println(String.format("당신의 라이센스.. ==> %s", license));
        System.out.println("체크 중..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("체크 완료");
    }

    @Override
    default String getDeviceName(){
        return "Window";
    };
}
