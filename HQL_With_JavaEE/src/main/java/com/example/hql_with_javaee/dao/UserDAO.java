package com.example.hql_with_javaee.dao;

import com.example.hql_with_javaee.entity.UserEntity;

import java.util.List;

public interface UserDAO {
    List<UserEntity> getAllUser();
}
