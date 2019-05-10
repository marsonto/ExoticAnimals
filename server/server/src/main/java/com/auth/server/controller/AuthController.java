package com.auth.server.controller;

import com.auth.server.pojo.JWTTokenResponse;
import com.auth.server.pojo.User;
import com.auth.server.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class AuthController {

    private final TokenService tokenService;

    @Autowired
    public AuthController(final TokenService token){
        this.tokenService = token;
    }

    @PostMapping("login")
    public ResponseEntity<JWTTokenResponse> createCustomer(@RequestBody User user) {
        return new ResponseEntity<>(tokenService.generateToken(user.getUsername()), HttpStatus.OK);
    }
}