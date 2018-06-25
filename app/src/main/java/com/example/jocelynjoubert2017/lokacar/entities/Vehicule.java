package com.example.jocelynjoubert2017.lokacar.entities;


import android.media.Image;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "vehicules")
public class Vehicule {

    @DatabaseField(generatedId = true)
    private int id;
    private String immat;

    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Marque marque;

    @DatabaseField(canBeNull = false, foreign = true) // foreignKey
    private Modele modele;


    public Vehicule() {
    }

    public Vehicule(int id, String immat, Marque marque, Modele modele) {
        this.id = id;
        this.immat = immat;
        this.marque = marque;
        this.modele = modele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImmat() {
        return immat;
    }

    public void setImmat(String immat) {
        this.immat = immat;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", immat='" + immat + '\'' +
                ", marque=" + marque +
                ", modele=" + modele +
                '}';
    }
}
