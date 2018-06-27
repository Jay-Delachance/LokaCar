package com.example.jocelynjoubert2017.lokacar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jocelynjoubert2017.lokacar.entities.Vehicule;

import java.util.List;

public class ListeVoituresAdapter extends RecyclerView.Adapter<VoitureViewHolder> {

    // Liste d'objets métier :
    private List<Vehicule> listeVoitures = null;

    /**
     * Constructeur.
     */
    public ListeVoituresAdapter(List<Vehicule> listeVoitures)
    {
        this.listeVoitures = listeVoitures;
    }

    @Override
    public VoitureViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View viewVoiture = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_voiture, parent, false);
        return new VoitureViewHolder(viewVoiture);
    }

    @Override
    public void onBindViewHolder(VoitureViewHolder holder, int position)
    {
        holder.textViewImmat.setText(listeVoitures.get(position).getImmat());
        holder.textViewModele.setText(String.valueOf(listeVoitures.get(position).getModeleId()));
        holder.textViewAgence.setText(String.valueOf(listeVoitures.get(position).getAgenceId()));
        holder.textViewDispo.setText(listeVoitures.get(position).getDispo());
    }

    @Override
    public int getItemCount()
    {
        return listeVoitures.size();
    }

    /**
     * Ajout d'une voiture à la liste.
     */
    public void ajouterVoiture(Vehicule vehicule)
    {
        listeVoitures.add(0, vehicule);
        notifyItemInserted(0);
    }



}
