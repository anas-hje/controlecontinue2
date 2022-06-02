package com.example.controlecontinue2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ajouterEntreprise extends AppCompatActivity {
   EditText RS,ADR,CP;
   Button Enregistrer,annuller;
   MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db=new MyDatabase(this);
        setContentView(R.layout.activity_ajouter_entreprise);
        RS=findViewById(R.id.txtraison);
        ADR=findViewById(R.id.txtadresse);
        CP=findViewById(R.id.txtcapital);
        Enregistrer=findViewById(R.id.enregistrer);
        annuller=findViewById(R.id.annuler);
    }

    public void retourner(View view) {
        finish();
    }

    public void Enregistrer(View view) {
        if (RS.getText().toString().isEmpty()|| ADR.getText().toString().isEmpty()||CP.getText().toString().isEmpty()){
            Toast.makeText(this, "Tu  doit remplire toutes les champs pour enregistrer vos information", Toast.LENGTH_LONG).show();
        }else {
            Entreprise E = new Entreprise();
            E.setID(1);
            E.setRaison_Sociale(RS.getText().toString());
            E.setAdresse(ADR.getText().toString());
            E.setCapitale(Double.parseDouble(CP.getText().toString()));


            if (MyDatabase.AddEntreprise(db.getWritableDatabase(), E) == -1)
                Toast.makeText(this, "Insertion Echoue", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Insertion reussie", Toast.LENGTH_SHORT).show();
        }
    }


    public void modifier(View view) {
    }
}