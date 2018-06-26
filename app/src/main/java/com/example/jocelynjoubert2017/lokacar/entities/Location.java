package com.example.jocelynjoubert2017.lokacar.entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


import com.example.jocelynjoubert2017.lokacar.utils.DateConverter;

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

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }

    @NonNull
    private long dateReservation;
    @NonNull
    private long dateDepart;
    @NonNull
    private long dateRetourReel;

    @Nullable
    private long dateRetourPrevu;


    @ColumnInfo(name = "vehicule_id") // foreignKey
    private String vehiculeId;

    @ColumnInfo(name = "agence_id") // foreignKey
    private String agenceId;

    @ColumnInfo(name = "client_id") // foreignKey
    private String clientId;


    public Location() {
    }

    public Location(Date dateReservation, Date dateDepart, Date dateRetourReel, Date dateRetourPrevu, String vehiculeId, String agenceId, String clientId) {
        this.dateReservation = DateConverter.dateToTimestamp(dateReservation);
        this.dateDepart = DateConverter.dateToTimestamp(dateDepart);
        this.dateRetourReel = DateConverter.dateToTimestamp(dateRetourReel);
        this.dateRetourPrevu = DateConverter.dateToTimestamp(dateRetourPrevu);
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

    public long getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(long dateReservation) {
        this.dateReservation = dateReservation;
    }

    /**
     * Méthode surchargé
     * @param dateReservation
     */
    public void setDateReservation(Date dateReservation) {
        this.dateDepart =  DateConverter.dateToTimestamp(dateReservation);
    }


    public long getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(long dateDepart) {
        this.dateDepart = dateDepart;
    }

    /**
     * Méthode surchargé
     * @param dateDepart
     */
    public void setDateDepart(Date dateDepart) {
        this.dateDepart = DateConverter.dateToTimestamp(dateDepart);
    }


    public long getDateRetourReel() {
        return dateRetourReel;
    }

    public void setDateRetourReel(long dateRetourReel) {
        this.dateRetourReel = dateRetourReel;
    }

    /**
     * Méthode surchargé
     * @param dateretourReel
     */
    public void setDateretourReel(Date dateretourReel) {
        this.dateRetourReel = DateConverter.dateToTimestamp(dateretourReel);
    }


    public long getDateRetourPrevu() {
        return dateRetourPrevu;
    }

    public void setDateRetourPrevu(long dateRetourPrevu) {
        this.dateRetourPrevu = dateRetourPrevu;
    }

    /**
     * Méthode surchargé
     * @param dateRetourPrevu
     */
    public void setDateRetourPrevu(Date dateRetourPrevu) {
        this.dateRetourPrevu = DateConverter.dateToTimestamp(dateRetourPrevu);
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