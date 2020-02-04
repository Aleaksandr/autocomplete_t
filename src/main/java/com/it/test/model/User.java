package com.it.test.model;


import com.it.test.predefined.UserType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 6147177658948182661L;
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;
    @Column(name = "LOGIN", length = 95)
    private String login;
    @Column(name = "PASSWORD", length = 95)
    private String password;
    @Column(name = "TYPE", length = 45)
    @Enumerated(EnumType.STRING)
    private UserType type;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserType getType() {
        return type;
    }

    public User setType(UserType type) {
        this.type = type;
        return this;
    }
}