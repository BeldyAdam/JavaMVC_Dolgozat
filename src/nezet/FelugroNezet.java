package nezet;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class FelugroNezet {
    
    public String rendszamKeres(){
        String szoveg = JOptionPane.showInputDialog("Mi az autód rendszáma?");
        return szoveg;
    }
    
    public String szinKeres(){
        String szoveg = JOptionPane.showInputDialog("Milyen színű az autód?");
        return szoveg;
    }
    
    public String extrakKerese(){
        String szoveg = JOptionPane.showInputDialog("Milyen extrát szeretnél kérni az autóba?");
        if(szoveg == null){
            return "";
        }else{
            return szoveg;
        }
    }
    
    public void bemutato(String rendszam, String szin, String extrak){
        JOptionPane.showMessageDialog(null, "Az autó adatai:\n" + rendszam + "\n" + szin + "\n" + extrak);
    }

    public String atfestes(){
        String szin = "";
        int atfestesValasztas = JOptionPane.showConfirmDialog(null, "Szeretnéd átfesteni az autót?");
        if(atfestesValasztas == 0){
            szin = szinKeres();
            return szin;
        }else{
            return szin;
        }
    }
        //extrak kerese es felsorolasa
    
    
}
