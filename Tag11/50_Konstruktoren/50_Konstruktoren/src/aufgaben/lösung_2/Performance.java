package aufgaben.lösung_2;

public class Performance {
    public static final String RESET = "\u001B[0m";
    public static final String ROT = "\u001B[31m";
    public static final String GRUEN = "\u001B[32m";

    static void performanceReview(){
        int zaehlerVM = 1;
        for(Versicherungsmakler vm : Versicherungsmakler.vmListe){
            int vertraegeVM = 0;
            int vertraegeDifferenz = 0;
            System.out.println("VM " + zaehlerVM);
            System.out.println("=====");

            for(int jahre = 0; jahre < Konstanten.betrachtungsZeitraum; jahre++){
                double provSumme = 0;
                int vertragsDelta = 0;
                System.out.printf("Jahr %d\tGehalt %,.2f", (jahre + 1), vm.grundGehalt);
                System.out.println();
                System.out.println("JAN | FEB | MAR | APR | MAI | JUN | JUL | AUG | SEP | OKT | NOV | DEZ");
                for(int monate = 0; monate < Konstanten.monateProJahr; monate++){
                    int vertraege = vm.vertraegeProMonat.get(0);
                    vertraegeVM = vertraegeVM + vertraege;
                    vertraegeDifferenz += vertraege - Konstanten.vertraegeSoll;
                    if(vertraege - Konstanten.vertraegeSoll > 0) {
                        System.out.print(" " + GRUEN + vertraege + RESET + " | ");
                        provSumme += vm.grundGehalt * Konstanten.provision *
                                (vertraege - Konstanten.vertraegeSoll);
                        vertragsDelta += (vertraege - Konstanten.vertraegeSoll);
                    }else if(vertraege - Konstanten.vertraegeSoll < 0){
                        System.out.print(" " + ROT + vertraege + RESET + " | ");
                    }else{
                        System.out.print(" " + vertraege + " | ");
                    }
                    vm.vertraegeProMonat.remove(0);
                }
                System.out.printf("\b\b\nProvision aktuelles Jahr für %d Verträge: %,.2f", vertragsDelta, provSumme);
                System.out.print("\nVerträge (Jahr): " + vertraegeVM + " von "
                        + (Konstanten.vertraegeSoll * Konstanten.monateProJahr) + " | ");
                System.out.println("Differenz " + vertraegeDifferenz + "\n");
                if(vertraegeDifferenz > 0){
                    vm.grundGehalt = vm.grundGehalt * Konstanten.gehaltsErhoehung;
                }
                if(vertraegeDifferenz < 0){
                    vm.grundGehalt = vm.grundGehalt * Konstanten.gehaltsAbzug;
                }
                vertraegeVM = 0;
                vertraegeDifferenz = 0;
            }
            zaehlerVM++;
            System.out.println("\n");
        }
    }
}
