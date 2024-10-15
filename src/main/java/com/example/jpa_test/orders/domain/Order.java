package com.example.jpa_test.orders.domain;

import com.example.jpa_test.store.domain.Store;
import com.example.jpa_test.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "ORDERS", indexes = {@Index(columnList = "productName")})
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ORDER_PRICE")
    private int price;
    @Column(name = "ORDER_PRODUCTNAME")
    private String productName;
    @ManyToOne
    @JoinColumn(name = "STORE_ID")
    private Store store;
}
