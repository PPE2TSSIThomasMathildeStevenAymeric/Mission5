package com.stjo.mission_5;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    //region button
    Button saveButton;
    //endregion

    //region String
    String s1=null;
    String s2=null;
    String s3=null;
    String s4=null;
    String s5=null;
    String s6=null;
    String s7=null;
    String s8=null;
    String s9=null;
    String s10=null;
    String s11=null;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region RadioGroup
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.radiogroup4);
        RadioGroup rg5 = (RadioGroup) findViewById(R.id.radiogroup5);
        RadioGroup rg6 = (RadioGroup) findViewById(R.id.radiogroup6);
        RadioGroup rg7 = (RadioGroup) findViewById(R.id.radiogroup7);
        RadioGroup rg8 = (RadioGroup) findViewById(R.id.radiogroup8);
        RadioGroup rg9 = (RadioGroup) findViewById(R.id.radiogroup9);
        RadioGroup rg10 = (RadioGroup) findViewById(R.id.radiogroup10);
        RadioGroup rg11 = (RadioGroup) findViewById(R.id.radiogroup11);
        //endregion

        //region EditText
        final EditText et1 = (EditText) findViewById(R.id.editText);
        final EditText et2 = (EditText) findViewById(R.id.editText2);

        //endregion

        //region onChangeRadioButtoninRadioGroup
        rg1.clearCheck();
        rg1.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s1 = rb.getText().toString();
            }

        });

        rg2.clearCheck();
        rg2.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s2 = rb.getText().toString();
            }

        });

        rg3.clearCheck();
        rg3.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s3 = rb.getText().toString();
            }

        });

        rg4.clearCheck();
        rg4.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s4 = rb.getText().toString();
            }

        });

        rg5.clearCheck();
        rg5.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s5 = rb.getText().toString();
            }

        });

        rg6.clearCheck();
        rg6.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s6 = rb.getText().toString();
            }

        });

        rg7.clearCheck();
        rg7.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s7 = rb.getText().toString();
            }

        });

        rg8.clearCheck();
        rg8.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s8 = rb.getText().toString();
            }

        });

        rg9.clearCheck();
        rg9.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s9 = rb.getText().toString();
            }

        });

        rg10.clearCheck();
        rg10.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s10 = rb.getText().toString();
            }

        });

        rg11.clearCheck();
        rg11.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                s11 = rb.getText().toString();
            }

        });
        //endregion

        saveButton = (Button) findViewById(R.id.saveExternalStorage);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(s1 != null && s2 != null && s3 != null && s4 != null && s5 != null && s6 != null && s7 != null && s8 != null && s9 != null && s10 != null && s11 != null) {
                    //region Joueur
                    Joueur j1 = new Joueur(et1.getText().toString(), et2.getText().toString());
                    j1.getCrit_spo().addCrit(s7, s8, s9, s10, s11);
                    j1.getCrit_gen().addCrit(Integer.parseInt(s1), Integer.parseInt(s2), Integer.parseInt(s3), Integer.parseInt(s4), Integer.parseInt(s5), Integer.parseInt(s6));
                    j1.calculerLesMoyennes();
                    final String a = j1.getCrit_spo().getMoyenne();
                    final double b = j1.getCrit_gen().getMoyenne();
                    //endregion

                    //region Save(donnees)
                    String donnees = "{\n" +
                            "  \"Joueur\": {\n" +
                            "    \"Nom\": \""+j1.getNom()+"\",\n" +
                            "    \"Prénom\": \""+j1.getPrenom()+"\"\n" +
                            "  },\n" +
                            "  \"Critères Généraux\": [\n" +
                            "    \""+j1.getCrit_gen().ctri[0]+"\",\n" +
                            "    \""+j1.getCrit_gen().ctri[1]+"\",\n" +
                            "    \""+j1.getCrit_gen().ctri[2]+"\",\n" +
                            "    \""+j1.getCrit_gen().ctri[3]+"\",\n" +
                            "    \""+j1.getCrit_gen().ctri[4]+"\",\n" +
                            "    \""+j1.getCrit_gen().ctri[5]+"\"\n" +
                            "  ],\n" +
                            "  \"Critères Sportifs\": [\n" +
                            "    \""+j1.getCrit_spo().ctri[0]+"\",\n" +
                            "    \""+j1.getCrit_spo().ctri[1]+"\",\n" +
                            "    \""+j1.getCrit_spo().ctri[2]+"\",\n" +
                            "    \""+j1.getCrit_spo().ctri[3]+"\",\n" +
                            "    \""+j1.getCrit_spo().ctri[4]+"\"\n" +
                            "  ],\n" +
                            "  \"Moyenne\": {\n" +
                            "    \"Generaux\": \""+j1.getCrit_gen().getMoyenne()+"\",\n" +
                            "    \"Sportifs\": \""+j1.getCrit_spo().getMoyenne()+"\"\n" +
                            "  }\n"+
                            "};\n" ;
                    SaveData(donnees);
                    //endregion

                    //region Bundle
                    //Pour envoyer l'objet correspondant au joueur, on va créer un bundle
                    Bundle bun = new Bundle();
                    //qui contient le nom
                    bun.putString("nom",j1.getNom());
                    //le prénom
                    bun.putString("prenom",j1.getPrenom());
                    //les critères sportifs
                    bun.putStringArray("sportif",j1.getCrit_spo().getCtri());
                    //et les critères généraux
                    bun.putIntArray("generaux",j1.getCrit_gen().getCtri());
                    //endregion

                    //region Intent
                    //Puis, on déclare une nouvelle intent, avec l'activity de destination
                    Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                    //On ajoute le bundle a l'intent
                    intent.putExtras(bun);
                    //Et on lance la nouvelle activity
                    startActivity(intent);
                    //endregion

                }else{
                    rgManquant();
                }

            }
        });

    }

    private void rgManquant(){
        Toast.makeText(this,"Un des critères n'est pas rempli", Toast.LENGTH_LONG).show();
    }

    private void SaveData(String data) {

        String d = data;

        //region Dossier/fichier
        String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root + "/Mission_5");
        if (!myDir.exists()) {
            Toast.makeText(this,"dossier créé", Toast.LENGTH_LONG).show();
            myDir.mkdirs();
        }

        String fname = "data.json";
        File file = new File (myDir, fname);
        //endregion

        try {
            //region data
            FileOutputStream out = new FileOutputStream(file, true);
            out.write(d.getBytes());
            out.flush();
            out.close();
            Toast.makeText(this,"Données enregistrées", Toast.LENGTH_LONG).show();
            //endregion
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
