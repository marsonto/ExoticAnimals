package com.auth.server.services;

import com.auth.server.pojo.JWTTokenResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service
public class TokenServiceImpl implements TokenService {

    @Value("${token.secret}")
    private String secret;

    @Value("${token.validity}")
    private int validity;

    @Override
    public JWTTokenResponse generateToken(String username) {

        final Date createdDate = new Date();
        final Date expirationDate = new Date(createdDate.getTime() + validity);

        return new JWTTokenResponse(Jwts.builder()
                .setClaims(new HashMap<>())
                .setSubject(username)
                .setIssuedAt(createdDate)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact());
    }
}
