package com.example.controlecontinue2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ajouterEntreprise extends AppCompatActivity {
   EditText RS,ADR,CP;
   Button Enregistrer,annuller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_entreprise);
        RS=findViewById(R.id.txtraison);
        ADR=findViewById(R.id.txtadresse);
        CP=findViewById(R.id.txtcapital);
        Enregistrer=findViewById(R.id.enregistrer);
        annuller=findViewById(R.id.annuler);
    }
}