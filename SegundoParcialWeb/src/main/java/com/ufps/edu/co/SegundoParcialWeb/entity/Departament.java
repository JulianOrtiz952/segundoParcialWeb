package com.ufps.edu.co.SegundoParcialWeb.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Entity
@Data
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "chief", nullable = false)
    @JsonIgnore
    private Employee chief;


    @OneToMany(mappedBy = "departament", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private ArrayList<Visit> visitantList = new ArrayList<>();


}
