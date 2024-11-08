package com.ufps.edu.co.SegundoParcialWeb.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private Date birthday;

    private Integer depId;
    private Date entryDate;

    @OneToMany(mappedBy = "chief", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private ArrayList<Departament> departamentsList = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "posId", referencedColumnName = "id", nullable = false)
    private Position position;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private ArrayList<Visit> visitantList = new ArrayList<>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private ArrayList<ProjectAssigment> projectAssignments = new ArrayList<>();

}