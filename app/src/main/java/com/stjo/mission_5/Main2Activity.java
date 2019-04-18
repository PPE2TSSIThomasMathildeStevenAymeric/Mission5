package com.stjo.mission_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //region textView
        TextView tw = (TextView) findViewById(R.id.textView15);
        TextView tw2 = (TextView) findViewById(R.id.textView18);
        TextView tw3 = (TextView) findViewById(R.id.textView21);
        //endregion

        //region Intent/bundle
        //On récupère l'intent envoyé avec l'activity
        Intent i = getIntent();
        //On récupère le bundle
        Bundle bun = i.getExtras();
        //endregion

        //region Joueur
        //On créé un joueur vide
        Joueur j1 = new Joueur("","");

        //Puis on récupère ses données depuis le bundle
        j1.setNom(bun.getString("nom"));
        j1.setPrenom(bun.getString("prenom"));
        j1.getCrit_spo().setCtri(bun.getStringArray("sportif"));
        j1.getCrit_gen().setCtri(bun.getIntArray("generaux"));
        //On recalcule les moyennes
        j1.calculerLesMoyennes();
        //endregion

        //region setTextView
        tw.setText(j1.getNom()+" "+j1.getPrenom()+":");
        tw2.setText(String.valueOf(j1.getCrit_gen().getMoyenne()));
        tw3.setText(j1.getCrit_spo().getMoyenne());
        //endregion

    }
}
