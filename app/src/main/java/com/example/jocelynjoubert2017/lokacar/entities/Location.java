package com.example.jocelynjoubert2017.lokacar.entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


import java.util.Date;

@Entity(tableName = "locations",
        foreignKeys = {
                @ForeignKey(entity = Vehicule.class, parentColumns = "immat", childColumns = "vehicule_id"),
                @ForeignKey(entity = Agence.class, parentColumns = "id", childColumns = "agence_id"),
                @ForeignKey(entity = Client.class, parentColumns = "id", childColumns = "client_id")

        })
public class Location {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @NonNull
    private Date dateReservation;
    @NonNull
    private Date dateDepart;
    @NonNull
    private Date dateRetourReel;

    @Nullable
    private Date dateRetourPrevu;

    @ColumnInfo(name = "vehicule_id") // foreignKey
    private String vehiculeId;

    @ColumnInfo(name = "agence_id") // foreignKey
    private String agenceId;

    @ColumnInfo(name = "client_id") // foreignKey
    private String clientId;


    public Location() {
    }

    public Location(Date dateReservation, Date dateDepart, Date dateRetourReel, Date dateRetourPrevu, String vehiculeId, String agenceId, String clientId) {
        this.dateReservation = dateReservation;
        this.dateDepart = dateDepart;
        this.dateRetourReel = dateRetourReel;
        this.dateRetourPrevu = dateRetourPrevu;
        this.vehiculeId = vehiculeId;
        this.agenceId = agenceId;
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateRetourReel() {
        return dateRetourReel;
    }

    public void setDateRetourReel(Date dateRetourReel) {
        this.dateRetourReel = dateRetourReel;
    }

    public Date getDateRetourPrevu() {
        return dateRetourPrevu;
    }

    public void setDateRetourPrevu(Date dateRetourPrevu) {
        this.dateRetourPrevu = dateRetourPrevu;
    }

    @NonNull
    public String getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(@NonNull String vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    @NonNull
    public String getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(@NonNull String agenceId) {
        this.agenceId = agenceId;
    }

    @NonNull
    public String getClientId() {
        return clientId;
    }

    public void setClientId(@NonNull String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Location{" +
                ", dateReservation=" + dateReservation +
                ", dateDepart=" + dateDepart +
                ", dateRetourReel=" + dateRetourReel +
                ", dateRetourPrevu=" + dateRetourPrevu +
                ", vehicule=" + vehiculeId +
                ", agence=" + agenceId +
                ", client=" + clientId +
                '}';
    }
}
