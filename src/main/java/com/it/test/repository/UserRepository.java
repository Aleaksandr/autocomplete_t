package com.it.test.repository;

import com.it.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>  {
    User getUserByLogin(String login);
}