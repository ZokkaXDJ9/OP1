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

package aufgaben;

import java.util.Scanner;

public class Lösung_6
{
    public static void main(String[] args)
    {
        int summe = 0;

        System.out.print("Bitte die Artikelnummer ohne Prüfziffer eingeben und mit Return bestätigen: ");

        int artikelnummer = Integer.parseInt(new Scanner(System.in).nextLine());

        int temp = artikelnummer;

        while(temp > 0)
        {
            int zahl = temp % 10;
            temp = temp / 10;

            if (zahl % 2 == 1)
            {
                zahl *= 3;
            }
            summe += zahl;
        }

        String artikelnummerString = artikelnummer + "-" + summe % 10;

        System.out.println();
        System.out.println(artikelnummerString);

    }
}

