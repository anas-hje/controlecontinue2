package com.example.controlecontinue2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class EditerEnreprise extends AppCompatActivity {
    EditText RS,ADR,CP;
    Button Modifier,Supprimer;
    MyDatabase db;
    Spinner sp;
    Entreprise e;
    ArrayList<Entreprise> ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editer_enreprise);
        RS=findViewById(R.id.txtraisonM);
        ADR=findViewById(R.id.txtadresseM);
        CP=findViewById(R.id.txtcapitalM);
        sp=findViewById(R.id.spp);
        db=new MyDatabase(this);
        ar = MyDatabase.getAllEntreprise(db.getReadableDatabase());
        ArrayList<Integer> items = new ArrayList<>();

        for(Entreprise e :ar){
            items.add(e.getID());
        }


        ArrayAdapter<String> ad = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,items);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                e=ar.get(i);
                RS.setText(String.valueOf(e.getRaison_Sociale()));
                ADR.setText(String.valueOf(e.getAdresse()));
                CP.setText(String.valueOf(e.getCapitale()));
                Toast.makeText(EditerEnreprise.this, String.valueOf(e.getRaison_Sociale()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void modifier(View view) {
        if(MyDatabase.UpdateEntreprise(db.getWritableDatabase(),e)!=-1){
            Toast.makeText(getApplicationContext(),"Update Reussie",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Update Echoue",Toast.LENGTH_LONG).show();
        }
    }

    public void supprimer(View view) {
        if(MyDatabase.DeleteEntreprise(db.getWritableDatabase(),e.getID())!=-1){
            Toast.makeText(getApplicationContext(),"Delete Reussie",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Delete Echoue",Toast.LENGTH_LONG).show();
        }
    }
}