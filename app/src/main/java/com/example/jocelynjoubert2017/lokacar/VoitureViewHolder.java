package com.example.jocelynjoubert2017.lokacar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class VoitureViewHolder extends RecyclerView.ViewHolder {

    // Vue intitulé voiture :
    public TextView textViewImmat = null;
    public TextView textViewModele = null;
    public TextView textViewAgence = null;
    public TextView textViewDispo = null;
    public TextView textViewName = null;


    /**
     * Constructeur.
     *
     */
    public VoitureViewHolder(View itemView)
    {
        super(itemView);
        textViewImmat = itemView.findViewById(R.id.voiture_immat);
        textViewModele = itemView.findViewById(R.id.voiture_modele);
        textViewAgence = itemView.findViewById(R.id.voiture_agence);
        textViewDispo = itemView.findViewById(R.id.voiture_dispo);
        textViewName = itemView.findViewById(R.id.voiture_name);
    }


}
