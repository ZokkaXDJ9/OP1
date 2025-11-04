package aufgaben;

/* Level 1
 * Schreiben Sie eine statische Methode, die die Quersumme einer Zahl berechnet.
 * Übergabewert (Parameter): int zahl
 * Rückgabewert: Die berechnete Quersumme.
 * Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
 */

/* Modulo ermittelt den Restwert einer Ganzzahl-Division.
    123 % 10 = 3, weil die 10 12-Mal in die 123 passt, aber dann 3 übrig bleiben. 12*10 = 120, 123-120 = 3. Also Rest 3.
    Durch die Division durch 10 wird die letzte Stelle abgeschnitten. 123 / 10 = 12.3, aber da es sich hier um Integer handelt, wird die .3 einfach weggeworfen und es bleibt 12 übrig.
 */

public class Lösung_1
{
    static int quersumme(int zahl)
    {
        int summe = 0;
        while(zahl > 0)
        {
            summe += zahl % 10; // Die letzte Stelle der Zahl wird ermittelt und auf Summe addiert
            zahl = zahl / 10; // Danach kann die letzte Stelle der Zahl abgeschnitten werden
        }
        return summe;
    }

    static int quersummeRekursion(int zahl)
    {
        if (zahl == 0)
            return 0;

        int sum = quersummeRekursion(zahl/10);
        return zahl % 10 + sum;
    }

    public static void main(String[] args) {

        System.out.print("Die Quersumme lautet: ");
        System.out.println(quersummeRekursion(1259));


        int eingabe = 1259;
        int ergebnis = quersumme(eingabe);
        System.out.printf("Die Quersumme für die Zahl %s lautet: %s ", eingabe, ergebnis);

    }
}
