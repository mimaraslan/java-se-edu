package com.mimaraslan.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Order {

    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private int id;

    @Column(name = "PRODUCT", length = 100)
    private String product;


    @Column(name = "CODE", length = 50)
    private String code;

    @Column(name = "AMOUNT", precision = 10, scale = 2)
    private float amount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ORDER_DATE", length = 40)
    private Date orderDate;

    public Order() {
    }

    public Order(String code, float amount, Date orderDate) {
        this.code = code;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public Order(int id, String code, float amount, Date orderDate) {
        this.id = id;
        this.code = code;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public Order(String product, String code, float amount, Date orderDate) {
        this.product = product;
        this.code = code;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
