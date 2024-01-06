package com.mimaraslan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROPERTIES")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    Long id;

    @Column (name = "PROPERTY_NAME", length = 80)
    String propertyName;

    @Column (name = "TITLE", length = 150)
    String title;

    @Column (name = "DESCRIPTION", length = 200)
    String description;

    @Column (name = "TYPE", length = 50)
    String type;

    BigDecimal price;
    int bedroom;
    int bathroom;
    float area;
    String location;

    //

}
