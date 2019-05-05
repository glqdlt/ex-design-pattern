package com.glqdlt.example.exdesignpattern.bridge.window;

import com.glqdlt.example.exdesignpattern.bridge.ClickCallback;
import com.glqdlt.example.exdesignpattern.bridge.SubmitButton;
import com.glqdlt.example.exdesignpattern.bridge.SubmitForm;

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
