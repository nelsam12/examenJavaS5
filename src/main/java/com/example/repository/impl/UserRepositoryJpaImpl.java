package com.example.repository.impl;

import com.example.entities.User;
import com.example.repository.IUserRepository;

public class UserRepositoryJpaImpl extends RepositoryJpaImpl<User> implements IUserRepository {

    public UserRepositoryJpaImpl() {
        super(User.class);
        this.table = "users";
    }

    @Override
    public User getConnexion(String login, String password) {
        return null;
    }
}
