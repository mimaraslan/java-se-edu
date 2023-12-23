package com.mimaraslan.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CUSTOMER_DETAIL")
public class CustomerDetail {

    @OneToOne
    @JoinColumn
    private Customer customer;

    @Id
    @GeneratedValue( generator = "generator")
    @GenericGenerator(name = "generator", strategy = "foreign",
    parameters = @Parameter(name = "property", value = "customer"))
    @Column(name = "CUSTOMER_DETAIL_ID")
    private int customerId;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "PHONE")
    private String phone;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECORD_DATE")
    private Date recordDate;

    public CustomerDetail() {
    }

    public CustomerDetail(String address, String phone, Date recordDate) {
        this.address = address;
        this.phone = phone;
        this.recordDate = recordDate;
    }

    public CustomerDetail(int customerId, String address, String phone, Date recordDate) {
        this.customerId = customerId;
        this.address = address;
        this.phone = phone;
        this.recordDate = recordDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
