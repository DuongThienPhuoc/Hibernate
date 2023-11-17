package com.example.hql_with_javaee.dao;

import com.example.hql_with_javaee.entity.UserEntity;
import jakarta.persistence.*;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    private EntityManagerFactory entityManagerFactory;

    public UserDAOImpl() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("JPACFG");
    }

    public List<UserEntity> getAllUser() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            TypedQuery<UserEntity> query = entityManager.createQuery("FROM UserEntity", UserEntity.class);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}
