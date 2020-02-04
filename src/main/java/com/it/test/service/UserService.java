package com.it.test.service;

import com.it.test.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    User getUserByLogin(String login);
}