package com.example.jocelynjoubert2017.lokacar;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String bienvenue = getIntent().getStringExtra("bienvenue");

        TextView labelBievenue = findViewById(R.id.bienvenue_label);
        labelBievenue.setText(bienvenue);
    }

    public void clicVoitures (View view) {

        Intent intent = new Intent (this, ListeVoituresActivity.class);
        startActivity(intent);
    }

    public void clicClients (View view) {

        Intent intent = new Intent (this, ListeClientsActivity.class);
        startActivity(intent);
    }

    public void clicChiffreAffaire (View view) {

        Intent intent = new Intent (this, ChiffreAffaireActivity.class);
        startActivity(intent);
    }

    public void clicParams (View view) {

        Intent intent = new Intent (this, ParametresActivity.class);
        startActivity(intent);
    }

}
