package com.example.jocelynjoubert2017.lokacar.entities;


import android.accounts.Account;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "gerants")
public class Gerant {

    @DatabaseField(generatedId = true)
    private int id;
    private String prenom;
    private String nom;
    private String email;
    private String motPasse;

    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Agence agence;


    public Gerant() {
    }

    public Gerant(int id, String prenom, String nom, String email, String motPasse, Agence agence) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.motPasse = motPasse;
        this.agence = agence;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }


    @Override
    public String toString() {
        return "Gerant{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", motPasse='" + motPasse + '\'' +
                ", agence=" + agence +
                '}';
    }
}
