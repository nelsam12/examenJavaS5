package com.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.enums.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity 
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int id;
    @Column(length = 60)
    private String nom;
    @Column(length = 60)
    private String prenom;
    @Column(length = 60, unique = true)
    private String login;
    @Column(length = 255)
    private String password;
    @Enumerated(EnumType.ORDINAL)
    private Role role;

    // RELATION
    @JoinColumn()
    @OneToOne(mappedBy = "user")
    private Client client;
}
