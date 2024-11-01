package com.example.repository;

import com.example.entities.User;

public interface IUserRepository extends IRepository<User> {
    User getConnexion(String login, String password);
}
