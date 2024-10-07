package vezerlo;

import modell.Auto;
import nezet.FelugroNezet;


public class FelugroVezerlo {
    private Auto modell;
    private FelugroNezet nezet;
    public FelugroVezerlo(Auto modell, FelugroNezet nezet){
        this.modell = modell;
        this.nezet = nezet;
        start();
    }

    private void start() {
        nezet.bemutato(modell.getRendszam(), modell.getSzin(), modell.getExtrak());
        modell.extrakHozzaAd(nezet.extrakKerese());
        modell.setSzin(nezet.atfestes());
        nezet.bemutato(modell.getRendszam(), modell.getSzin(), modell.getExtrak());
    }
}
