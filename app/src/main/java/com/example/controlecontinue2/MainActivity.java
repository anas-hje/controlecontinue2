package com.example.controlecontinue2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afficherfrmajouter(View view) {
        Intent i =new Intent(MainActivity.this,ajouterEntreprise.class);
        startActivity(i);
    }

    public void aficherfrmEditer(View view) {
        Intent i =new Intent(MainActivity.this,EditerEnreprise.class);
        startActivity(i);
    }

    public void afficherfrmlister(View view) {
        Intent i =new Intent(MainActivity.this,listerEntreprises.class);
        startActivity(i);
    }
}