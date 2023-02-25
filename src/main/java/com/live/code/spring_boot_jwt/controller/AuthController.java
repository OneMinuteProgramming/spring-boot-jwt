package com.live.code.spring_boot_jwt.controller;

import com.live.code.spring_boot_jwt.model.LoginRequest;
import com.live.code.spring_boot_jwt.model.LoginResponse;
import com.live.code.spring_boot_jwt.util.JwtTokenUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class AuthController {

    final private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        // Query records from database, match the userName and password (Omitted)
        if (loginRequest.getUserName() != null) {
            return ResponseEntity.ok(new LoginResponse(jwtTokenUtil.generateToken(loginRequest.getUserName())));
        }else{
            throw new ErrorResponseException(HttpStatusCode.valueOf(401));
        }


    }
}
