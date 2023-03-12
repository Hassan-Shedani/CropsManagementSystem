package com.example.CropsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seed {
    @Id
    private String seedId;
    private String seedName;
    private String seedQuality;
    private String seedQuantity;
    private String seedMfgDate;
    private String seedExpDate;

    public String getSeedId() {
        return seedId;
    }

    public void setSeedId(String seedId) {
        this.seedId = seedId;
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName;
    }

    public String getSeedQuality() {
        return seedQuality;
    }

    public void setSeedQuality(String seedQuality) {
        this.seedQuality = seedQuality;
    }

    public String getSeedQuantity() {
        return seedQuantity;
    }

    public void setSeedQuantity(String seedQuantity) {
        this.seedQuantity = seedQuantity;
    }

    public String getSeedExpDate() {
        return seedExpDate;
    }

    public void setSeedExpDate(String seedExpDate) {
        this.seedExpDate = seedExpDate;
    }
}
