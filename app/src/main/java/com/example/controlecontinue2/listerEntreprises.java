package com.example.controlecontinue2;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class listerEntreprises extends AppCompatActivity {
ListView ls;
ArrayList<Entreprise> listE ;
MyDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_entreprises);
        ls=findViewById(R.id.lst);
      listE= MyDatabase.getAllEntreprise(db.getReadableDatabase());
        ArrayList<HashMap<String, Object>> list_items = new ArrayList<>();
        for (Entreprise E : listE) {
            HashMap<String, Object> it = new HashMap<>();
            it.put("Raison Social", E.getRaison_Sociale());
            it.put("Capital", E.getCapitale());
            list_items.add(it);
        }
        String[] from = {"Raison Social","Capital"};
        int[] to = {R.id.r, R.id.c,};

        SimpleAdapter ad = new SimpleAdapter(this, list_items, R.layout.layout, from, to);
        ls.setAdapter(ad);
    }
}