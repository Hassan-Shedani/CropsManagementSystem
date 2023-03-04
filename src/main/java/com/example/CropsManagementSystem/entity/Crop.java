package com.example.CropsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Crop {
    @Id
    private String cropId;
    @Column
    private String cropName;
    private String cropType;
    private  String cropStartDate;
    private String cropEndDate;

}
