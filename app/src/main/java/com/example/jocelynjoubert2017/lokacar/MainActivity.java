package com.example.jocelynjoubert2017.lokacar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.jocelynjoubert2017.lokacar.entities.Agence;

import static com.example.jocelynjoubert2017.lokacar.dal.AppDataBase.getDataBase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                getDataBase(MainActivity.this).agenceDAO().insert(new Agence("NantesCentre", "Boulevard Honoré", "44100", "Nantes", "0240357488"));

            }
        }).start();
    }

    public void boutonConnexion (View view) {

        EditText email = findViewById(R.id.email_editText);
        EditText password = findViewById(R.id.motDePasse_editText);

        String bienvenue = "Bonjour " + email.getText().toString() + " !";

        Intent intent = new Intent (this, MenuActivity.class);
        intent.putExtra("bienvenue", bienvenue );
        startActivity(intent);
    }
}
