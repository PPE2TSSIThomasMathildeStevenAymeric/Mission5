package com.stjo.mission_5;

public class Joueur {
    private String nom, prenom;

    private Critères_Généraux crit_gen = new Critères_Généraux();
    private Critères_Sportifs crit_spo = new Critères_Sportifs();

    public Joueur(String pNom, String pPrenom){
        this.nom = pNom;
        this.prenom = pPrenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Critères_Généraux getCrit_gen() {
        return crit_gen;
    }

    public Critères_Sportifs getCrit_spo() {
        return crit_spo;
    }

    public void setCrit_gen(Critères_Généraux crit_gen) {
        this.crit_gen = crit_gen;
    }

    public void setCrit_spo(Critères_Sportifs crit_spo) {
        this.crit_spo = crit_spo;
    }

    public void calculerLesMoyennes(){
        this.crit_spo.calculerMoyenne();
        this.crit_gen.calculerMoyenne();
    }


}
