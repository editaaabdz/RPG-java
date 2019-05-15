import Personnage.Guerrier;
import Personnage.Magicien;

import java.util.Scanner;


//////////////////////////////////////////
//////////// METHODE SCANNER /////////////
//////////////////////////////////////////

class Test
{
    private Guerrier edita;

    public static void main(String [] args)
    {
        //for(int i=0; i<10; i=i+1){
        String create = "";

do {
    String characterClass = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print("Etes-vous un Guerrier ou un Magicien ?" + "\n");
    characterClass = scanner.nextLine();

    if (characterClass.equals("guerrier")) {

        System.out.print("\n" + "Vous avez choisi : " + characterClass + "\n");

        System.out.print("\n" + "Quel est le nom de votre Guerrier ?" + "\n");
        String name = scanner.nextLine();
        System.out.print("\n" + "Le nom de votre Guerrier est :" + name + "\n");

        System.out.print("\n" + "Choisissez une image " + "\n");
        String img = scanner.nextLine();
        System.out.print("\n" + "image" + img + "\n");

        System.out.print("\n" + "Combien de levelLife avez-vous ? (entre 5 et 10) " + "\n");
        int levelLife = scanner.nextInt();
        System.out.print("\n" + "Vous avez choisi" + levelLife + " de points de level" + "\n");

        System.out.print("\n" + "Combien de point de pouvoir avez-vous ? (entre 5 et 10)" + "\n");
        int power = scanner.nextInt();
        System.out.print("\n" + "Vous avez choisi " + power + " de pouvoir" + "\n");

        System.out.print("\n" + "Choisissez une arme" + "\n");
        String arme = scanner.nextLine();
        System.out.print("\n" + "Vous avez choisi l'arme :" + arme + "\n");

// Lecture clavier, fait fair eune action selon ce que utilisateur écrit //
        Scanner lectClavier = new Scanner(System.in);
        System.out.print("\n" + "Arrêter le programme ?" + "\n");
        String rep = lectClavier.nextLine();
        if (rep.equals("oui"))
            System.exit(0);


//////////////////////////////////////////
///////INSTANCE NEW PERSO GUERRIER////////
//////////////////////////////////////////

        Guerrier edita = new Guerrier(name, img, levelLife, power);


    } else if (characterClass.equals("magicien")) {
        characterClass = scanner.nextLine();
        System.out.print("\n" + "Vous avez choisi : " + characterClass + "\n");

        System.out.print("\n" + "Quel est le nom de votre Guerrier ?" + "\n");
        String name = scanner.nextLine();
        System.out.print("\n" + "Le nom de votre Guerrier est :" + name + "\n");

        String img = scanner.nextLine();
        System.out.print("\n" + "Choisissez une image" + img + "\n");
        System.out.print("\n" + "image" + img + "\n");

        int levelLife = scanner.nextInt();
        System.out.print("\n" + "Combien de levelLife avez-vous ? (entre 5 et 10)" + "\n");
        System.out.print("\n" + "Vous avez choisi" + levelLife + "de points de level" + "\n");

        int power = scanner.nextInt();
        System.out.print("\n" + "Vous avez choisi" + power + "de pouvoir" + "\n");

        String sort = scanner.nextLine();
        System.out.print("\n" + "Vous avez choisi l'arme :" + sort + "\n");

        Scanner lectClavier = new Scanner(System.in);
        System.out.print("\n" + "Arrêter le programme ?" + "\n");
        String rep = lectClavier.nextLine();

        if (rep.equals("oui")) {
            System.exit(0);


//////////////////////////////////////////
///////INSTANCE NEW PERSO MAGICIEN////////
//////////////////////////////////////////

            Magicien idriss = new Magicien(name, img, levelLife, power);


        }} else  {
            System.out.print("Choix de personnage invalide");
        }

        System.out.print("Voulez vous créer un autre personnage ou quitter ?");
        create = scanner.nextLine();

    } while (create.equals("CREATE"));
}}



//////////////////////////////////////////
///////INSTANCE NEW PERSO MAGICIEN////////
//////////////////////////////////////////

//        Magicien idriss = new Magicien();
//        idriss.setname("idriss");
//        idriss.setlifeLevel(15);
//        idriss.setpower(15);
//
//        System.out.println(idriss.getlevelLife());
//        Magicien newM = new Magicien(name, img, levelLife, power);
//        newM.getlevelLife();
//        }
//        }}

