package com.example.jocelynjoubert2017.lokacar.entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;


import java.util.Date;

@Entity(tableName = "ChiffresAffaires",
        foreignKeys = {
        @ForeignKey(entity = Agence.class, parentColumns = "id", childColumns = "agence_id")
})
public class ChiffreAffaires {

    @PrimaryKey
    private Date dateCA;
    private float totalCA;


    @ColumnInfo(name = "agence_id") // foreignKey
    private String agenceId;


    public ChiffreAffaires() {
    }

    public ChiffreAffaires(Date dateCA, float totalCA, String agenceId) {
        this.dateCA = dateCA;
        this.totalCA = totalCA;
        this.agenceId = agenceId;
    }

    public Date getDateCA() {
        return dateCA;
    }

    public void setDateCA(Date dateCA) {
        this.dateCA = dateCA;
    }

    public float getTotalCA() {
        return totalCA;
    }

    public void setTotalCA(int totalCA) {
        this.totalCA = totalCA;
    }

    public String getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(String agenceId) {
        this.agenceId = agenceId;
    }

    @Override
    public String toString() {
        return "ChiffreAffaires{" +
                ", dateCA=" + dateCA +
                ", totalCA=" + totalCA +
                ", agence=" + agenceId +
                '}';
    }
}
