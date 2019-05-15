package Attaque;

public class Armes {
    private String nameArme;
    private int powerArme;


//////////////////////////////////////////
/////////////CONSTRUCTEUR/////////////////
//////////////////////////////////////////

    public Armes(){}
    public Armes(String nameArme, int powerArme){
        this.nameArme = nameArme;
        this.powerArme = powerArme;
    }


//////////////////////////////////////////
///////ON INITIALISE LES GETTERS /////////
//////////////////////////////////////////

    public String getnameArme(){
        return nameArme;
    }
    public int getpowerArme(){
        return powerArme;
    }


//////////////////////////////////////////
///////ON INITIALISE LES SETTERS /////////
//////////////////////////////////////////

    public void setnameArme(String paramNameArme){
        this.nameArme = paramNameArme;
    }
    public void setpowerArme(int paramPowerArme){
        this.powerArme = paramPowerArme;
    }


}

