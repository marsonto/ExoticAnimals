package com.auth.server.services;

import com.auth.server.pojo.JWTTokenResponse;

public interface TokenService {

    JWTTokenResponse generateToken(String username);
}
