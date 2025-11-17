package aufgaben;

/* Level 2
    AUFGABENSTELLUNG ("große Straße" beim Kniffel-Spiel)

        - Führen Sie bitte zunächst im Main ein Integer-Array der Länge 5 ein
        - Schreiben Sie anschließend bitte die beiden folgenden Methoden:
            a) Funktionsname: FülleWürfelArray
               Übergabewerte: 1 Integer-Array 'arr'
                              2 Integer 'min' und 'max'
               Funktion:      Die Methode füllt das Array arr mit Zufallszahlen zwischen (beiderseits einschließlich) min und max
                              (HINWEIS: Länge des Arrays = arr.Length)
               Rückgabewert:  Keiner

            b) Funktionsname: AusgabeWürfelArray
               Übergabewerte: 1 Integer-Array 'arr'
               Funktion:      Ausgabe aller Arrayfeld-Werte (also für alle Indices zwischen 0 und arr.Length) auf der Konsole
               Rückgabewert:  Keiner

       Verwenden Sie bitte die beiden obigen Methoden in folgendem Java-Programm - für dieses Programm soll gelten:
            - Das Programm startet eine Schleife, pro Durchlauf ...
                + wird ein Array der Länge 5 mit Zufalls-Würfelzahlen gefüllt
                + wird das gefüllte Array (numerisch) sortiert
                + wird überprüft, ob es sich um eine "große Straße" handelt (1,2,3,4,5) oder (2,3,4,5,6)
            - Die Schleife endet, falls eine "große Straße" gewürfelt wurde
            - Das Programm endet mit der Ausgabe der Anzahl der Schleifen-Durchläufe, die nötig waren, um die "große Straße" zu erreichen
*/

import java.util.Arrays;
import java.util.Random;

public class Lösung_3
{
    static Random random = new Random();
    static void fülleWürfelArray(int[] arr, int min, int max)
    {
        for (int i = 0; i < arr.length; i++)
            //arr[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            arr[i] = random.nextInt(max - min + 1) + min;
    }

    static void ausgabeWürfelArray(int[] arr)
    {
        for (int zahl : arr)
            System.out.println(zahl + " ");
    }

    // Es handelt sich um eine Zahlenfolge, wenn die Differenz zur nächsten Zahl genau 1 beträgt.
    static boolean prüfeGroßeStraße(int[] zahlen)
    {
        for (int i = 0; i < zahlen.length - 1; i++)
        {
            // Sobald die Differenz nicht genau 1 ist, ist es keine Zahlenfolge und es kann false zurückgegeben werden
            if (zahlen[i + 1] - zahlen[i] != 1)
                return false;
        }
        return true;
    }


    public static void main(String[] args)
    {

        int versuche = 1;
        System.out.println("\nErste Variante:");
        do // Variante 1, Einfach
        {
            int[] zahlen = new int[5];
            fülleWürfelArray(zahlen, 1, 6);
            Arrays.sort(zahlen);

            // Die möglichen Zahlenfolgen als komplexe Bedingung
            if ((zahlen[0] == 1 && zahlen[1] == 2 && zahlen[2] == 3 && zahlen[3] == 4 && zahlen[4] == 5)
                    || (zahlen[0] == 2 && zahlen[1] == 3 && zahlen[2] == 4 && zahlen[3] == 5 && zahlen[4] == 6))
            {
                ausgabeWürfelArray(zahlen);
                System.out.println(" - Große Straße! Versuche: " + versuche);

                break;
            }
            versuche++;
        } while (true);

        versuche = 1;

        System.out.println("\nZweite Variante:");
        do //Variante 2
        {
            int[] zahlen = new int[5];
            fülleWürfelArray(zahlen, 1, 6);
            Arrays.sort(zahlen);

            // In PrüfeGroßeStraße wird die Differenz zu jeder nächsten Zahl errechnet.
            // Ist die Differenz ungleich 1, handelt es sich nicht um eine Zahlenfolge.
            if (prüfeGroßeStraße(zahlen))
            {
                ausgabeWürfelArray(zahlen);
                System.out.println(" - Große Straße! Versuche: " + versuche);

                break;
            }
            versuche++;
        } while (true);

        // Noch eine Variante: Array in String umwandeln und mit "12345" oder "23456" vergleichen

    }

}








