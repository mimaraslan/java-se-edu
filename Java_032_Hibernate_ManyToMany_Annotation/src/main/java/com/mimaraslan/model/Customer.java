package com.mimaraslan.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable (name = "CUSTOMERS_ADDRESS",
            joinColumns = { @JoinColumn(name = "CUSTOMER_ID", nullable = false)  },
            inverseJoinColumns = { @JoinColumn(name = "ADDRESS_ID", nullable = false)}
    )
    private Set<Address> address = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID", nullable = false)
    private int customerId;

    @Column(name = "FIRST_NAME", length = 65, nullable = false)
    private String firstname;
    @Column(name = "LAST_NAME", length = 75)
    private String lastname;

    public Customer() {
    }

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Customer(int customerId, String firstname, String lastname) {
        this.customerId = customerId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }
}
