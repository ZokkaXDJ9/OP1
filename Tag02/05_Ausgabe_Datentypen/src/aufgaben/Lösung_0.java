package aufgaben;

/* Level 1
 * Schreiben Sie ein Java-Programm das kontrolliert, ob eine Zahl gerade oder ungerade ist und dann einen String ausgibt der sagt "Die Zahl ist ungerade" oder
 * "Die Zahl ist gerade".
 * Hinweis: Zur Vergleichsberechnung bietet sich der Modulo-Operator % an.
 */

public class Lösung_0
{
    static void unterscheideZahlen(int zahlwert)
    {
        if(zahlwert % 2 == 0)
        {
            System.out.println("Die Zahl ist gerade");
        }
        else
        {
            System.out.println("Die Zahl ist ungerade");
        }
    }


    public static void main(String[] args)
    {
        int zahl = 3;
        System.out.println("Ausgabe über If-Anweisung in der Main für die Zahl 3: ");
        if(zahl % 2 == 0)
        {
            System.out.println("Die Zahl ist gerade");
        }
        else
        {
            System.out.println("Die Zahl ist ungerade");
        }

        // Ausführen des Vergleichs über eine Methode "UnterscheideZahlen" mit Übergabeparameter zahlwert
        System.out.println("\nAusgabe über Methode für die Zahl 24: ");
        unterscheideZahlen(24);
    }
}
