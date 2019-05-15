package Personnage;

public class Guerrier {
    private String name;
    private String img;
    private int lifeLevel;
    private int power;
    private String arme;


//////////////////////////////////////////
/////////////CONSTRUCTEUR/////////////////
//////////////////////////////////////////

    public Guerrier(){}
    public Guerrier(String name, String img, int lifeLevel, int power){
        this.name = name;
        this.img = img;
        this.lifeLevel = lifeLevel;
        this.power = power;
    }


//////////////////////////////////////////
///////ON INITIALISE LES GETTERS /////////
//////////////////////////////////////////

public String getname(){
        return name;
}
public String getimg(){
        return img;
    }
public int getlifeLevel(){
        return lifeLevel;
    }
public int getpower(){
        return power;
    }
public String getsort(){
        return arme;
    }


//////////////////////////////////////////
///////ON INITIALISE LES SETTERS /////////
//////////////////////////////////////////

public void setname(String paramName){
        this.name = paramName;
    }
public void setlifeLevel(int paramlifeLevel){
        this.lifeLevel = paramlifeLevel;
    }
public void setpower(int paramPower){
        this.power = paramPower;
    }
public void setimg(String paramImg){
        this.img = paramImg;
    }
public void setarme(String paramArme){
        this.arme = paramArme;
    }


//////////////////////////////////////////
/////////// METHODE TO STRING ////////////
//////////////////////////////////////////

// elle "stringuise" toutes les valeurs pour pouvoir les afficher

    public String toString() {

        return " Name:" + this.name +
                " lifeLevel:" + this.lifeLevel +
                " power:" + this.power +
                " arme:" + this.arme;
    }
}