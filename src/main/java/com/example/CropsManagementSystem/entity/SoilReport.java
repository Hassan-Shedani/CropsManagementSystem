package com.example.CropsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SoilReport {

    @Id
    private String soilId;
    private double soilPH;
    private double macroNutrientLvl;
    private double microNutrientLvl;
    private String soilTexture;
    private double organicMatterAmount;

    public String getSoilId() {
        return soilId;
    }

    public void setSoilId(String soilId) {
        this.soilId = soilId;
    }

    public double getSoilPH() {
        return soilPH;
    }

    public void setSoilPH(double soilPH) {
        this.soilPH = soilPH;
    }

    public double getMacroNutrientLvl() {
        return macroNutrientLvl;
    }

    public void setMacroNutrientLvl(double macroNutrientLvl) {
        this.macroNutrientLvl = macroNutrientLvl;
    }

    public double getMicroNutrientLvl() {
        return microNutrientLvl;
    }

    public void setMicroNutrientLvl(double microNutrientLvl) {
        this.microNutrientLvl = microNutrientLvl;
    }

    public String getSoilTexture() {
        return soilTexture;
    }

    public void setSoilTexture(String soilTexture) {
        this.soilTexture = soilTexture;
    }

    public double getOrganicMatterAmount() {
        return organicMatterAmount;
    }

    public void setOrganicMatterAmount(double organicMatterAmount) {
        this.organicMatterAmount = organicMatterAmount;
    }
}
