package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;
import java.util.UUID;


@Data
@Entity
public class Category {


    @Id
    @GeneratedValue
    private UUID id;


    private String name;


    @OneToMany(mappedBy = "category")
    List<Product> products;
}