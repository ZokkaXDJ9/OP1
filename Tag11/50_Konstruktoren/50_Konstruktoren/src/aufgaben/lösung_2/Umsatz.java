package aufgaben.lösung_2;

import java.util.Random;

public class Umsatz {
    static Random zuf = new Random();
    static void umsatzMachen(){
        for(Versicherungsmakler vm : Versicherungsmakler.vmListe){
            vm.vertraegeProMonat.clear();
            for(int index = 0; index < (Konstanten.betrachtungsZeitraum * Konstanten.monateProJahr); index++){
                int v = zuf.nextInt(Konstanten.vertraegeMin,Konstanten.vertraegeMax + 1);
                vm.vertraegeProMonat.add(v);
            }
        }
    }
}
