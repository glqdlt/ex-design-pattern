package com.glqdlt.example.exdesignpattern.builder;

import lombok.*;

@ToString
@Getter
@Builder
public class AccountForLombok {
    private final String name;
    private final String id;
    private final String password;
    private final String email;
    private final String address;
    private final String phone;

}
