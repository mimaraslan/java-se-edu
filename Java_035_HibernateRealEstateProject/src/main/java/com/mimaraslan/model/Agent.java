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
@Table(name = "AGENTS")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    private  Long id;

    @Column(name = "AGENT_NAME")
    private String agentName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "OFFICE_ADDRESS")
    private String officeAddress;

    //   1             m
    // Agent        Property
    @OneToMany (mappedBy = "agent",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<Property> properties = new HashSet<>();


}
