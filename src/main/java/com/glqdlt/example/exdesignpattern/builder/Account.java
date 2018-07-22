package com.glqdlt.example.exdesignpattern.builder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
public class Account {

    private final String name;
    private final String id;
    private final String password;
    private final String email;
    private final String address;
    private final String phone;

    private Account(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.password = builder.password;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public static class Builder{

        private final String name;
        private final String id;
        private final String password;

        private String phone;
        private String address;
        private String email;

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder(String name, String id, String password) {
            this.name = name;
            this.id = id;
            this.password = password;
        }

        public Account build(){
            return new Account(this);
        }
    }




}
