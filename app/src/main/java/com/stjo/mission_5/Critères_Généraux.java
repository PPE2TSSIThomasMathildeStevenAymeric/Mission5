package com.stjo.mission_5;

public class Critères_Généraux {
    private double moyenne;
    public int[] ctri = new int[6];

    public Critères_Généraux(){

    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public int[] getCtri() {
        return ctri;
    }

    public void setCtri(int[] ctri) {
        this.ctri = ctri;
    }

    public void addCrit(int crit1,int crit2,int crit3,int crit4,int crit5, int crit6){
        this.ctri[0] = crit1;
        this.ctri[1] = crit2;
        this.ctri[2] = crit3;
        this.ctri[3] = crit4;
        this.ctri[4] = crit5;
        this.ctri[5] = crit6;
    }

    public void calculerMoyenne(){
        double moy = 0;
        for (int crit:this.ctri) {
            moy += crit;
        }
        double moyenne = moy/6;

        this.moyenne = moyenne;
    }
}
