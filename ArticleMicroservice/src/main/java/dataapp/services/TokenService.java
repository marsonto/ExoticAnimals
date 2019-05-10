package dataapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TokenService {

    private final String secret;

    @Autowired
    public TokenService(@Value("$(token.secret)") final String secret) {
        this.secret = secret;
    }
}
