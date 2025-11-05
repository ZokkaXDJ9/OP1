package aufgaben;
import java.util.Scanner;
/* Level 1
 * Schreiben Sie eine statische Methode, die die Quersumme einer Zahl berechnet.
 * Übergabewert (Parameter): int zahl
 * Rückgabewert: Die berechnete Quersumme.
 * Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
 */
public class Aufgabe_1
{
    static int quersumme(int zahl)
    {
        if (zahl >= 10) {
            return zahl % 10 + quersumme(zahl / 10);
        }

        return zahl;
    }

    public static void main(String[] args)
    {
        int zahl = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein, deren Quersumme berechnet werden soll:");
        zahl = scanner.nextInt();
        int berechneteQuersumme = quersumme(zahl);
        System.out.println("Quersumme: " + berechneteQuersumme);
        scanner.close();
    }
}
