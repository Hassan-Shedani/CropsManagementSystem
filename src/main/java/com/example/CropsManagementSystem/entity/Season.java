package com.example.CropsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Season {
    @Id
    private String seasonId;
    @Column
    private String seasonName;








}
