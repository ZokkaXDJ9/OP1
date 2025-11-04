package aufgaben;

/* Level 3
Erstellen Sie eine Funktion, die die Fakultät einer übergebenen Zahl berechnet und das Ergebnis zurückgibt.

Fakultät = mathematische Funktion, die eine natürliche Zahl n auf n! = 1 * 2 * … * n abbildet
https://de.wikipedia.org/wiki/Fakult%C3%A4t_(Mathematik)

Beispiel: 5! = 1 * 2 * 3 * 4 * 5 = 120
*/

public class Lösung_5
{
    public static void main(String[] args)
    {
        // Wir rufen die Methode 'fakultät' auf, übergeben ihr den Wert '6' und weisen die Rückgabe der Methode der Variable 'ergebnis' zu.
        long ergebnis = fakultät(8); // Was an eine Methode übergeben wird, wird 'Argument' genannt.

        System.out.println(ergebnis);
    }

    // Rückgabetyp - Bezeichner - Parameterliste
    // static = Klassen-Methode = wird über den Klassenbezeichner aufgerufen.
    // ohne static = Instanz-Methode = wird über eine Objekt-Instanz aufgerufen.
    public static long fakultät(int zahl) // Parameter = Was in die Methode hineingegeben werden soll.
    {
        long fakultät = 1;
        for (int i = 2; i <= zahl; i++)
            fakultät = fakultät * i;

        return fakultät; // Return = Was aus der Methode zurück zum Aufrufer gegeben wird.
    }
}
