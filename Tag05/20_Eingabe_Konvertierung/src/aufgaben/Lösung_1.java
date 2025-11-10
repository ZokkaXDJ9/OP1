/* Level 1
 * Schreiben Sie eine statische Methode, die vom Benutzer eine Zahl abfragt und die eingegebene Zahl als Integer zurückgibt.
  Wenn der Benutzer etwas eingibt, was keine ganze Zahl ist, soll eine Fehlermeldung erscheinen und die Abfrage wird wiederholt.
 * Geben Sie zum Testen die eingegebene Zahl in der Konsole aus.
 * Rückgabewert: Die eingegebene Zahl
 */

package aufgaben;

import java.util.Scanner;

public class Lösung_1
{
    static void eingabe()
    {
        Scanner sc = new Scanner(System.in);

        while (true) // Endlosschleife
        {
            System.out.print("Bitte eine Zahl eingeben: ");
            String s = sc.nextLine();

            int zahl;
            // Ich rufe die Methode ParsenInteger auf, der Rückgabewert wird der Variable 'zahl' zugewiesen und diese Variable wird dann auf != 0 geprüft.
            if ((zahl = ParsenINTEGER(s, 0)) != 0)
            {
                System.out.println("Eingegeben: " + zahl); // Konnte der Wert geparst werden, kann er direkt ausgegeben werden.
                return; // Die Methode (und damit auch die Endlosschleife) wird mit return beendet.
            }
            else
            {
                System.out.println("Ihre Eingabe war nicht korrekt");
            }
        }
    }

    public static int ParsenINTEGER(String value, int defaultVal) // zum Parsen in Integer
    {
        try // Try-Catch abfangen von Fehlern (Exceptions)
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
        eingabe();
    }
}
