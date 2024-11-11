package com.example.manish.completecrud.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // remember to  ask what they do
    private long id;
    private  String name;
    private  String email;
    private  String password;
}
