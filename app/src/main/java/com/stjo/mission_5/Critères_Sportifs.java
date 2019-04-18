package com.stjo.mission_5;

public class Critères_Sportifs {

    private String moyenne;
    public String[] ctri = new String[5];

    public Critères_Sportifs(){

    }

    public String getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(String moyenne) {
        this.moyenne = moyenne;
    }

    public String[] getCtri() {
        return ctri;
    }

    public void setCtri(String[] ctri) {
        this.ctri = ctri;
    }

    public void addCrit(String crit1,String crit2,String crit3,String crit4,String crit5){
        this.ctri[0] = crit1;
        this.ctri[1] = crit2;
        this.ctri[2] = crit3;
        this.ctri[3] = crit4;
        this.ctri[4] = crit5;
    }

    public void calculerMoyenne(){
        double moy = 0;
        for (String crit:this.ctri) {
            switch (crit){
                case "A":
                    moy += 5;
                    break;
                case "B":
                    moy +=4;
                    break;
                case "C":
                    moy +=3;
                    break;
                case "D":
                    moy +=2;
                    break;
                case "E":
                    moy +=1;
                    break;
            }
        }

        int i = Integer.parseInt(String.valueOf(Math.round(moy / 5)));
        String moyenne = null;

        switch (i){
            case 1:
                moyenne = "E";
                break;
            case 2:
                moyenne = "D";
                break;
            case 3:
                moyenne = "C";
                break;
            case 4:
                moyenne = "B";
                break;
            case 5:
                moyenne = "A";
                break;
        }
        this.moyenne = moyenne;
    }
}
