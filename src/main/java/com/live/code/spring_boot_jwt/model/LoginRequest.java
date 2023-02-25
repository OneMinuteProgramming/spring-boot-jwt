package com.live.code.spring_boot_jwt.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String userName;
    private String password;
}
