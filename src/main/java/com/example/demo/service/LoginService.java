package com.example.demo.service;

import com.example.demo.domain.Login;
import java.util.List;
import java.util.Optional;

public interface LoginService {
    List<Login> findAll();
    Optional<Login> findByUsername(String username);
    Login save(Login login);
    void deleteByUsername(String username);
}
