package com.example.jocelynjoubert2017.lokacar.entities;


import android.media.Image;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "clients")
public class Client {

    @DatabaseField(generatedId = true)
    private int id;
    private String prenom;
    private String nom;
    private String codePostal;
    private String ville;
    private String telephone;
    private String emai;


    public Client() {
    }

    public Client(int id, String prenom, String nom, String codePostal, String ville, String telephone, String emai) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.codePostal = codePostal;
        this.ville = ville;
        this.telephone = telephone;
        this.emai = emai;
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

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                ", telephone='" + telephone + '\'' +
                ", emai='" + emai + '\'' +
                '}';
    }
}
