package com.glqdlt.example.exdesignpattern.bridge;

public class SubmitForm {
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SubmitForm{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
