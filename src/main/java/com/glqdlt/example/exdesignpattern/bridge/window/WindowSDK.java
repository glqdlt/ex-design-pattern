package com.glqdlt.example.exdesignpattern.bridge.window;

public interface WindowSDK {
    default void checkLicense(String licesne) {
        System.out.println("마이크로소프트에 등록 된 SDK 인지 확인합니다..");
        System.out.println(String.format("당신의 라이센스.. ==> %s", licesne));
        System.out.println("체크 중..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("체크 완료");
    }

    default String getPlatformName() {
        final String name = "window sdk";
        return name;
    }
}
