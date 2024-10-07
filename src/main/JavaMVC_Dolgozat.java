package main;

import modell.Auto;
import nezet.FelugroNezet;
import vezerlo.FelugroVezerlo;


public class JavaMVC_Dolgozat {


    public static void main(String[] args) {
        //Feladatleírás: Vannak autóink amiknek rendszáma van, Auto osztály és rendszám, szin adattag, az autót át lehet festeni, és lehet bele extrákat kérni.
        //Nézet: Felugró ablakos
        
        FelugroNezet nezet = new FelugroNezet();
        Auto modell = new Auto(nezet.rendszamKeres(), nezet.szinKeres(), nezet.extrakKerese()); // felugro ablakban megcsinálni a kérdezést
        FelugroVezerlo vezerlo = new FelugroVezerlo(modell, nezet);
    }
    
}
