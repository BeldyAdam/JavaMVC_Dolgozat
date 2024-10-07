package modell;


public class Auto {
    private String rendszam;
    private String szin;
    private String extrak;

    public Auto(String rendszam, String szin) {
        this(rendszam, szin, "");
    }

    
    
    public Auto(String rendszam, String szin, String extrak) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extrak = extrak;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public String getExtrak() {
        return extrak;
    }
    
    public void extrakHozzaAd(String extra){
        extrak +=  " | " + extra;
    }
    
    public void atFestes(String ujSzin){
        szin = ujSzin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }
    
}
