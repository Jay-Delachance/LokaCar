package com.example.jocelynjoubert2017.lokacar.entities;


import android.media.Image;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "ChiffresAffaires")
public class ChiffreAffaires {

    @DatabaseField(generatedId = true)
    private int id;
    private Date dateCA;
    private int totalCA;


    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Agence agence;


    public ChiffreAffaires() {
    }

    public ChiffreAffaires(int id, Date dateCA, int totalCA, Agence agence) {
        this.id = id;
        this.dateCA = dateCA;
        this.totalCA = totalCA;
        this.agence = agence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCA() {
        return dateCA;
    }

    public void setDateCA(Date dateCA) {
        this.dateCA = dateCA;
    }

    public int getTotalCA() {
        return totalCA;
    }

    public void setTotalCA(int totalCA) {
        this.totalCA = totalCA;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Override
    public String toString() {
        return "ChiffreAffaires{" +
                "id=" + id +
                ", dateCA=" + dateCA +
                ", totalCA=" + totalCA +
                ", agence=" + agence +
                '}';
    }
}
