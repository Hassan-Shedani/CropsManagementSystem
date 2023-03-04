package com.example.CropsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Seed {
    @Id
    private String seedId;
    @Column
    private String seedName;
    @Column
    private String seedQuality;
    @Column
    private String seedQuantity;
    @Column
    private String seedExpDate;
}
