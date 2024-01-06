package com.mimaraslan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BUYERS")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    Long id;

    @Column(name = "FIRST_NAME")
    String firstName;

    @Column(name = "LAST_NAME")
    String lastName;

    @Column(name = "EMAIL")
    String email;

    @Column(name = "PHONE")
    String phone;

    // Bir gayrimenkulü birden fazla kişi satın alabilir mi?
    //   m            m
    // Buyer       Property
    @ManyToMany(mappedBy = "buyers",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<Property> properties = new HashSet<>();

}
