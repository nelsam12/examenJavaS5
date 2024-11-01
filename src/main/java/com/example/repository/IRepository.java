package com.example.repository;

import java.util.List;

public interface IRepository <T> {
    List<T> selectAll();
    T selectById(int id);
    void insert(T entity);
}
