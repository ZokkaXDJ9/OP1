package aufgaben;

/* Level 1
Schreiben Sie bitte ein Java-Programm, das
a) in einer Endlosschleife den User zu Beginn jeden Durchlaufs fragt, ob er eine  ...
	(1) Übersetzung, oder
	(2) Monatsnummer wünscht
	(3) Programm Beenden

b) bei Eingabe von (1) einen deutschen Monatsnamen abfragt und die englische Übersetzung ausgibt
c) bei Eingabe von (2) einen deutschen Monatsnamen abfragt und die Monatsnummer ausgibt (Januar=1, ...)
d) bei Fehleingaben (Auswahl ungleich 1 und 2 / nicht-existenter deutscher Monatsname) eine entsprechende Fehlermeldung ausgibt

Bemerkung:
Versuchen Sie die Aufgabe bitte zunächst durch zwei 1-dimensionale String-Arrays zu lösen, ohne CultureInfo.
*/

import java.util.Scanner;

public class Lösung_1 {

    public static void main(String[] args) {
        char auswahl;
        int zahl;
        Scanner sc = new Scanner(System.in);

        String[] monatDeutsch = new String[]
                { "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli",
                        "August", "September", "Oktober", "November", "Dezember" };

        String[] monatEnglisch = new String[]
                { "January", "February", "March", "April", "May", "June", "July",
                        "August", "September", "October", "November", "December" };

        while (true)
        {
            System.out.println("(1) Übersetzung \n(2) Monatsnummer \n(0) Beenden");
            System.out.print("Bitte treffen Sie Ihre Auswahl: ");

            auswahl = sc.nextLine().charAt(0);
            System.out.println();

            if (auswahl == '1' || auswahl == '2')
            {
                String monat;
                boolean gefunden = false;
                System.out.print("Bitte deutschen Monatsnamen eingeben: ");
                monat = sc.nextLine();

                for (int i = 0; i < monatDeutsch.length; i++)
                {
                    if (monatDeutsch[i].equalsIgnoreCase(monat))
                    {
                        if (auswahl == '1')
                            System.out.printf("Der Monat %s heißt auf Englisch %s%n", monat, monatEnglisch[i]);
                        if (auswahl == '2')
                            System.out.printf("Der Monat %s ist der %s. Monat im Jahr.%n", monat, i+1);

                        gefunden = true;
                        break;
                    }
                }
                if (!gefunden)
                {
                    System.out.printf("Der Monat %s wurde nicht gefunden!%n", monat);
                }

            }
            else if (auswahl == '0')
                break;
            else
            {
                System.out.println("Falsche Eingabe!");
            }
            System.out.println();

        }

    }

}









