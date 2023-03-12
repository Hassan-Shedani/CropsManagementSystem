package com.example.CropsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Crop {
    @Id
    private String cropId;
    private String cropName;
    private String cropType;
    private  String cropStartDate;
    private String cropEndDate;

    public String getCropId() {
        return cropId;
    }

    public void setCropId(String cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public String getCropStartDate() {
        return cropStartDate;
    }

    public void setCropStartDate(String cropStartDate) {
        this.cropStartDate = cropStartDate;
    }

    public String getCropEndDate() {
        return cropEndDate;
    }

    public void setCropEndDate(String cropEndDate) {
        this.cropEndDate = cropEndDate;
    }

}
