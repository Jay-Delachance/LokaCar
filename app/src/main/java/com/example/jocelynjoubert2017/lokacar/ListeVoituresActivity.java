package com.example.jocelynjoubert2017.lokacar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import com.example.jocelynjoubert2017.lokacar.dal.AppDataBase;
import com.example.jocelynjoubert2017.lokacar.dal.dao.VehiculeDAO;
import com.example.jocelynjoubert2017.lokacar.entities.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class ListeVoituresActivity extends AppCompatActivity implements RecyclerView.OnItemTouchListener {
    public VehiculeDAO vehiculeDAO;
    // Vues :
    private RecyclerView recyclerView = null;
    private EditText editTextVoiture = null;
    private AppDataBase appDataBase;
    private List<Vehicule> listeVoitures = new ArrayList<>();

    // Adapter :
    private ListeVoituresAdapter listeVoituresAdapter = null;

    // Gesture detector :
    private GestureDetector gestureDetector = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_voitures);

        // vues :
        recyclerView = findViewById(R.id.liste_voitures);
        editTextVoiture = findViewById(R.id.saisie_voiture);

        // à ajouter pour de meilleures performances :
        recyclerView.setHasFixedSize(true);

        // layout manager, décrivant comment les items sont disposés :
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // contenu d'exemple :
        //final List<Vehicule> listeVoitures = appDataBase.vehiculeDAO().getAll();

        appDataBase = AppDataBase.getDataBase(this);

        // adapter :


        // listener :
        recyclerView.addOnItemTouchListener(this);
        gestureDetector = new GestureDetector(this,
                new GestureDetector.SimpleOnGestureListener()
                {
                    @Override
                    public boolean onSingleTapUp(MotionEvent event)
                    {
                        return true;
                    }
                });

        lauchThread();
    }

    /**
     * Permet de lancer la requete dans un thread
     */
    private void lauchThread(){
        listeVoitures.clear();
        Log.i("tz", "liste : " + listeVoitures);

                Thread thread = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        listeVoitures = appDataBase.vehiculeDAO().getAll();
                        //Modele modele = appDataBase.modeleDAO().selectById(1);

                        listeVoituresAdapter = new ListeVoituresAdapter(listeVoitures);
                        recyclerView.setLayoutManager(new LinearLayoutManager(ListeVoituresActivity.this));
                        recyclerView.setAdapter(listeVoituresAdapter);

                        Log.i("tz", "liste : " + listeVoitures);
                    }

                });

                if (!thread.isAlive()) {
                    thread.start();
                }
            }






    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent motionEvent)
    {
        if (gestureDetector.onTouchEvent(motionEvent))
        {
            // récupération de l'item cliqué :
            View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());

            // position dans la liste d'objets métier (position à partir de zéro !) :
            if (child != null)
            {
                int position = recyclerView.getChildAdapterPosition(child);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {}

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {}

    /**
     * Listener clic bouton valider.
     * @param view Bouton valider
     */
    public void onClickBoutonValider(View view)
    {
        // ajout du mémo :
        listeVoituresAdapter.ajouterVoiture(new Vehicule(editTextVoiture.getText().toString()));

        // animation de repositionnement de la liste (sinon on ne voit pas l'item ajouté) :
        recyclerView.smoothScrollToPosition(0);

        // on efface le contenu de la zone de saisie :
        editTextVoiture.setText("");
    }
}