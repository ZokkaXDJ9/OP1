package aufgaben;

/* Level 2
    Schreiben Sie bitte ein Java-Programm, in dem ...
    - in einer Schleife 6 Lottozahlen abgefragt werden
        + Die Abfrage einer Zahl wird wiederholt, wenn ...
              a) Das Eingabeformat keiner ganzen Zahl entspricht
              b) Die eingegebene Zahl bereits zuvor ausgewählt wurde
              c) Die eingegebene Zahl nicht zwischen 1 und 49 liegt
        + Falls weder a), b) noch c) zutrifft, wird die eingegebene Zahl in das Integer-Array 'tipp' abgespeichert
    - nach der Schleife das Array tipp sortiert wird
    - anschließend das Array auf der Konsole ausgegeben wird
*/

import java.util.Arrays;
import java.util.Scanner;

public class Lösung_2
{
    public static int ParsenINTEGER(String value, int defaultVal) // zur Kontrolle und Parsen in Integer Zahlen
    {
        try // Try-Catch abfangen von Fehlern (Exceptions) dazu kommt später mehr
        {
            return Integer.parseInt(value); // gebe den geparsten Wert zurück
        }
        catch (NumberFormatException e) // wenn parsen nicht geklappt dann fange den Fehler ab der kommt und gebe den defaultWert zurück
        {
            return defaultVal;
        }
    }


    public static void main(String[] args)
    {
        int[] tipp = new int[6];

        String eingabeText;
        int eingabeZahl;

        boolean vorhanden;
        boolean formatIstOk;
        boolean istKeineLottozahl;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
        {
            do
            {
                System.out.print("Geben Sie bitte die " + (i + 1) + ". Zahl Ihres Lottotipps ein: ");
                eingabeText = sc.nextLine();

                eingabeZahl = ParsenINTEGER(eingabeText, 0);

                formatIstOk = eingabeZahl != 0;

                vorhanden = false;
                istKeineLottozahl = false;

                if (formatIstOk) // nur wenn Format Ok, wird mit eingabeZahl gearbeitet:
                {
                    for (int j = 0; j < i; j++)
                    {
                        if (tipp[j] == eingabeZahl)
                        {
                            vorhanden = true;
                            break;
                        }
                    }
                    if (!vorhanden) // nur, wenn keine Zahl doppelt
                    {
                        if (eingabeZahl < 1 || eingabeZahl > 49)
                            istKeineLottozahl = true;
                    }
                }
            }
            while (!formatIstOk || vorhanden || istKeineLottozahl);

            tipp[i] = eingabeZahl;
        }

        // Kontrollausgabe:
        Arrays.sort(tipp);
        System.out.println("\nDer eingegebene Lottotipp lautet in numerisch sortierter Reihenfolge:");
        for (int i = 0; i < 6; i++)
            System.out.print(tipp[i] + " ");

        // Mit foreach
        //for (int x : tipp)
        //	System.out.print(x + " ");

        System.out.println(Arrays.toString(tipp));

    }
}








