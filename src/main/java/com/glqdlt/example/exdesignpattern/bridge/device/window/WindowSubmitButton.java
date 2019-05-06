package com.glqdlt.example.exdesignpattern.bridge.device.window;

import com.glqdlt.example.exdesignpattern.bridge.button.ClickCallback;
import com.glqdlt.example.exdesignpattern.bridge.button.SubmitButton;
import com.glqdlt.example.exdesignpattern.bridge.button.SubmitForm;

public final class WindowSubmitButton extends SubmitButton implements WindowButton {

    private String lisense;

    public WindowSubmitButton(SubmitForm submitForm, String license) {
        super(submitForm);
        this.lisense = license;
    }

    public WindowSubmitButton(SubmitForm submitForm, ClickCallback clickListenFunction, String license) {
        super(submitForm, clickListenFunction);
        this.lisense = license;
    }

    @Override
    protected void clickImplements() {
        checkLicense(lisense);
        super.clickImplements();
    }
}
