package com.example.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.repository.IRepository;

public class RepositoryJpaImpl <T> implements IRepository<T> {

    protected EntityManager em;
    protected String table;
    protected Class<T> entity;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySqlUnit");

    public RepositoryJpaImpl(Class<T> entity) {
    
        this.entity = entity;
        if (em == null) {
            this.em = emf.createEntityManager();
        }
    }
    @Override
    public List<T> selectAll() {
        return em.createQuery("SELECT e FROM " + entity.getSimpleName() + " e", entity).getResultList();
    }

    @Override
    public T selectById(int id) {
        return null;
    }

    @Override
    public void insert(T entity) {
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
}
