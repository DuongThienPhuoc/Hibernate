package com.example.hql_with_javaee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class RoleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "authority")
    private String authority;
    @OneToOne(mappedBy = "role")

    private UserEntity user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
