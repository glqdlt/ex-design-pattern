package com.glqdlt.example.exdesignpattern.bridge.window;

import com.glqdlt.example.exdesignpattern.bridge.CancelButton;
import com.glqdlt.example.exdesignpattern.bridge.ClickCallback;

public class WindowCancelButton extends CancelButton implements WindowButton{

    private String license;

    public WindowCancelButton(String license) {
        this.license = license;
    }

    public WindowCancelButton(ClickCallback clickListenFunction, String license) {
        super(clickListenFunction);
        this.license = license;
    }

    @Override
    protected void clickImplements() {
        checkLicense(license);
        super.clickImplements();
    }
}
