package com.glqdlt.example.exdesignpattern.bridge;

public class SubmitButton extends Button {

    private SubmitForm submitForm;

    public SubmitForm getSubmitForm() {
        return submitForm;
    }


    public void setSubmitForm(SubmitForm submitForm) {
        this.submitForm = submitForm;
    }

    public SubmitButton(SubmitForm submitForm) {
        this.submitForm = submitForm;
    }

    public SubmitButton(SubmitForm submitForm, ClickCallback clickListenFunction) {
        super(clickListenFunction);
        this.submitForm = submitForm;
    }

    protected void clickImplements() {
        System.out.println(String.format("Form 을 외부 API 로 발싸ㅏㅏ ==> %s", this.submitForm.toString()));
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("발싸 완료");
    }

}
