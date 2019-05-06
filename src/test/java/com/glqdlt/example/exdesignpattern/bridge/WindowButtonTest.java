package com.glqdlt.example.exdesignpattern.bridge;

import com.glqdlt.example.exdesignpattern.bridge.button.SubmitForm;
import com.glqdlt.example.exdesignpattern.bridge.device.window.WindowButton;
import com.glqdlt.example.exdesignpattern.bridge.device.window.WindowCancelButton;
import com.glqdlt.example.exdesignpattern.bridge.device.window.WindowSubmitButton;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class WindowButtonTest {

    private SubmitForm submitForm;
    private final String license = "abc123";

    @Before
    public void setUp() throws Exception {
        submitForm = new SubmitForm();
        submitForm.setId("test-id");
        submitForm.setPassword("password1234");
    }

    @Test
    public void windowSubmitButton() throws Exception {
        WindowButton windowSubmitButton = new WindowSubmitButton(submitForm, license);
        System.out.println(windowSubmitButton.getDeviceName());
        windowSubmitButton.click();
    }

    @Test
    public void windowSubmitButtonWithCallback() throws Exception {
        WindowButton callbackButton = new WindowSubmitButton(submitForm, () -> IntStream.rangeClosed(1, 3).boxed().forEach(x -> System.out.println("카운트 다운!" + x)), license);
        System.out.println(callbackButton.getDeviceName());
        callbackButton.click();
    }

    @Test
    public void windowCancelButton() throws Exception {
        WindowButton cancelButton = new WindowCancelButton(license);
        cancelButton.click();
    }
}