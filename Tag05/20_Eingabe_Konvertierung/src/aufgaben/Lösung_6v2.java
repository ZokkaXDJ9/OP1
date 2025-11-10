package aufgaben;

/* Level 2
 * In ihrem Unternehmen werden neue Artikelnummern vergeben. Sie bestehen aus 5 Zahlen und einer Prüfziffer.
 * Sie sollen ein Programm entwerfen, dass 5 einstellige Zahlen einliest und daraus die Prüfziffer errechnet und sie auf der Console ausgibt. Wie Sie mit Fehleingaben umgehen, bleibt Ihnen überlassen.
 * Folgende Informationen erhalten Sie für die Berechnung der Prüfziffer:
 * - die geraden Zahlen werden addiert, die ungeraden Zahlen werden mit 3 multipliziert und anschließend addiert.
 * - die Prüfziffer ergibt sich aus der letzten Stelle der Summe.
 * Beispiel:    27493 => 2+4 = 6;
 *              7*3+9*3+3*3 = 57;
 *              6 + 57 = 63 => Prüfziffer 3
 *              Artikelnummer = 27493-3
*/

import java.util.Scanner;

public class Lösung_6v2
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] zahlen = new int[5];

        System.out.println("Bitte 5 einstellige Zahlen eingeben:");
        for (int i = 0; i < zahlen.length;)
        {
            System.out.print((i + 1) + ". Zahl: ");
            try
            {
                int eingabe = Math.abs(scanner.nextInt()); // Negative Zahlen wandeln wir einfach in positive Zahlen um.
                if (eingabe / 10 == 0) // Prüft, ob die Zahl einstellig ist (Division durch 10 bei einstelligen Zahlen ergibt 0).
                // if (eingabe >= 0 && eingabe <= 9)
                {
                    zahlen[i] = eingabe;
                    i++;
                }
                else
                    System.out.println("Fehler bei der Eingabe!");
            }
            catch (Exception ex)
            {
                System.out.println("Fehler bei der Eingabe!");
                scanner.next(); // Bei einer Fehleingabe, z.B. ein Buchstabe wird eingegeben, bleibt der Buchstabe im Eingabepuffer.
                // Durch nextLine() oder next() wird der Buchstabe verarbeitet und damit der Puffer geleert.
            }
        }

        int summe = 0;
        for (int z : zahlen)
        {
            System.out.print(z);
            if (z % 2 == 0)
                summe = summe + z;
            else
                summe = summe + (z * 3);
        }

        //System.out.println(summe);
        int prüfziffer = summe % 10;
        System.out.println("-" + prüfziffer);

    }
}


