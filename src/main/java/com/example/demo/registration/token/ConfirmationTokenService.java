package com.example.demo.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfirmationTokenRepository repository;

    public void saveConfirmationToken(ConfirmationToken token) {
        repository.save(token);
    }
}
