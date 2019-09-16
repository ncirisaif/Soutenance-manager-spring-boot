package com.spring.soutenance.springsocial.controller;

import com.spring.soutenance.DAO.UserRepository;
import com.spring.soutenance.DTO.UserDto;
import com.spring.soutenance.domain.UserApp;
import com.spring.soutenance.springsocial.exception.BadRequestException;
import com.spring.soutenance.springsocial.model.AuthProvider;
import com.spring.soutenance.springsocial.payload.ApiResponse;
import com.spring.soutenance.springsocial.payload.AuthResponse;
import com.spring.soutenance.springsocial.payload.LoginRequest;
import com.spring.soutenance.springsocial.payload.SignUpRequest;
import com.spring.soutenance.springsocial.security.TokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private TokenProvider tokenProvider;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = tokenProvider.createToken(authentication);
        return ResponseEntity.ok(new AuthResponse(token));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserDto userDto) {
        if(userRepository.existsByEmail(userDto.getEmail())) {
            throw new BadRequestException("Email address already in use.");
        }

        // Creating user's account
        UserApp user = new UserApp();
        user.setEmail(userDto.getEmail());
        if(!user.getPassword().equals(userDto.getConfirmPassword())) throw new RuntimeException("Please confirm your password");

        user.setPassword(userDto.getPassword());

        user.setProvider(AuthProvider.local);

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        UserApp result = userRepository.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/user/me")
                .buildAndExpand(result.getId()).toUri();

        return ResponseEntity.created(location)
                .body(new ApiResponse(true, "User registered successfully@"));
    }

}
