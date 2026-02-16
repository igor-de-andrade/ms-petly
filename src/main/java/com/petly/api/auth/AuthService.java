package com.petly.api.auth;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.petly.api.auth.dto.LoginRequest;
import com.petly.api.security.JwtService;
import com.petly.api.users.User;
import com.petly.api.users.UserRepository;
import com.petly.api.users.exception.BusinessException;

@Service
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthService(UserRepository repository,
                       PasswordEncoder passwordEncoder,
                       JwtService jwtService) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public String login(LoginRequest request) {

        User user = repository.findByEmail(request.email())
                .orElseThrow(() -> new BusinessException("E-mail ou senha incorretos"));

        if (!passwordEncoder.matches(request.senha(), user.getSenha())) {
            throw new BusinessException("E-mail ou senha incorretos");
        }

        return jwtService.generateToken(user.getEmail());
    }
}
