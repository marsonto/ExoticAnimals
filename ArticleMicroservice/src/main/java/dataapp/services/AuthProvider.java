package dataapp.services;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class AuthProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        authentication.getCredentials();
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
