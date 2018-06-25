package com.example.jocelynjoubert2017.lokacar.entities;


import android.media.Image;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "modeles")
public class Modele {

    @DatabaseField(generatedId = true)
    private int id;
    private String nom;
    private String typeVehicule;
    private String typeCarburant;
    private int prixParJour;
    private Image photo;

    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Marque marque;


    public Modele() {
    }

    public Modele(int id, String nom, String typeVehicule, String typeCarburant, int prixParJour, Image photo, Marque marque) {
        this.id = id;
        this.nom = nom;
        this.typeVehicule = typeVehicule;
        this.typeCarburant = typeCarburant;
        this.prixParJour = prixParJour;
        this.photo = photo;
        this.marque = marque;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public int getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(int prixParJour) {
        this.prixParJour = prixParJour;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Modele{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", typeVehicule='" + typeVehicule + '\'' +
                ", typeCarburant='" + typeCarburant + '\'' +
                ", prixParJour=" + prixParJour +
                ", photo=" + photo +
                ", marque=" + marque +
                '}';
    }
}
