package br.com.pedrofurtadoflores.springsecuritysessionapi.config.security;

import org.springframework.web.bind.annotation.*;

import br.com.pedrofurtadoflores.springsecuritysessionapi.model.User;
import br.com.pedrofurtadoflores.springsecuritysessionapi.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User successfully registered!";
    }
}
