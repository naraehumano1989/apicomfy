package com.ecommerce.apinocountry.models.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart")
    private Long id;
    @OneToOne
    private User user;

  @OneToMany(cascade = CascadeType.ALL)
    private List<Product> items;

}
