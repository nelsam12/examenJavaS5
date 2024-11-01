package com.example.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clients" )
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 30, unique = true)
    private String surnom;
    @Column(length = 255, unique = false)
    private String adresse;
    @Column(length = 15, unique = true)
    private String telephone;

    // RELATION
    @JoinColumn()
    @OneToOne(cascade = CascadeType.PERSIST)
    private User user;
}
