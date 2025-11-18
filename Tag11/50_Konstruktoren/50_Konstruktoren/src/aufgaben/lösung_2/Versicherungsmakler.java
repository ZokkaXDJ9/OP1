package aufgaben.lösung_2;

import java.util.ArrayList;
import java.util.List;

public class Versicherungsmakler {
    public double grundGehalt;
    static List<Versicherungsmakler> vmListe = new ArrayList<>();
    List<Integer> vertraegeProMonat = new ArrayList<>();
    public Versicherungsmakler(double grundGehalt){
        this.grundGehalt = grundGehalt;
        vmListe.add(this);
    }
    static void maklerErzeugen(){
        for(int index = 0; index < Konstanten.anzahlMakler; index++){
            new Versicherungsmakler(Konstanten.grundGehalt);
        }
    }
}
