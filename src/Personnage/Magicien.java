package Personnage;

public class Magicien {
    private String name;
    private String img;
    private int lifeLevel;
    private int power;
    private String sort;


//////////////////////////////////////////
///// CONSTRUCTEUR PAR DEFAUT (vide) /////
//////////////////////////////////////////

    public Magicien() {

    }


//////////////////////////////////////////
///////////// CONSTRUCTEUR ///////////////
//////////////////////////////////////////

    public Magicien(String name, String img, int lifeLevel, int power) {
        this.name = name;
        this.img = img;
        this.lifeLevel = lifeLevel;
        this.power = power;
    }


//////////////////////////////////////////
///////ON INITIALISE LES GETTERS /////////
//////////////////////////////////////////

    public String getname() {
        return name;
    }

    public String getimg(){
        return img;
    }

    public int getlifeLevel() {
        return lifeLevel;
    }

    public int getpower() {
        return power;
    }

    public String getsort() {
        return sort;
    }


//////////////////////////////////////////
///////ON INITIALISE LES SETTERS /////////
//////////////////////////////////////////

    public void setname(String paramName) { this.name = paramName; }

    public void setlifeLevel(int paramlifeLevel) { this.lifeLevel = paramlifeLevel; }

    public void setpower(int parampower) { this.power = parampower; }

    public void setimg(String paramimg) { this.img = paramimg; }

    public void setarme(String paramsort) { this.sort = paramsort; }


//////////////////////////////////////////
/////////// METHODE TO STRING ////////////
//////////////////////////////////////////

// elle "stringuise" toutes les valeurs pour pouvoir les afficher

    public String toString() {

        return " Name:" + this.name +
                " lifeLevel:" + this.lifeLevel +
                " power:" + this.power +
                " sort:" + this.sort;
    }
}



