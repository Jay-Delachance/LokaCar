package com.example.jocelynjoubert2017.lokacar.entities;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "locations")
public class Location {

    @DatabaseField(generatedId = true)
    private int id;
    private Date dateDepart;
    private Date dateRetour;

    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Vehicule vehicule;

    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Agence agence;

    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Client client;


    public Location() {
    }

    public Location(int id, Date dateDepart, Date dateRetour, Vehicule vehicule, Agence agence, Client client) {
        this.id = id;
        this.dateDepart = dateDepart;
        this.dateRetour = dateRetour;
        this.vehicule = vehicule;
        this.agence = agence;
        this.client = client;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", dateDepart=" + dateDepart +
                ", dateRetour=" + dateRetour +
                ", vehicule=" + vehicule +
                ", agence=" + agence +
                ", client=" + client +
                '}';
    }
}
