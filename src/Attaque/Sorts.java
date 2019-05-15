package Attaque;

public class Sorts {
    private String nameSort;
    private int powerSort;


//////////////////////////////////////////
/////////////CONSTRUCTEUR/////////////////
//////////////////////////////////////////

    public Sorts(){}
    public Sorts(String nameSort, int powerSort){
        this.nameSort = nameSort;
        this.powerSort = powerSort;
    }


//////////////////////////////////////////
///////ON INITIALISE LES GETTERS /////////
//////////////////////////////////////////

    public String getnameSort(){
        return nameSort;
    }
    public int getpowerSort(){
        return powerSort;
    }


//////////////////////////////////////////
///////ON INITIALISE LES SETTERS /////////
//////////////////////////////////////////

    public void setnameSort(String paramNameSort){
        this.nameSort = paramNameSort;
    }
    public void setpowerSort(int paramPowerSort){ this.powerSort = paramPowerSort; }
}
