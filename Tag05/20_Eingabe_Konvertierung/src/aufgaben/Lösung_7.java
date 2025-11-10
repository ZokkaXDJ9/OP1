package aufgaben;

/* Level 2
Ziel dieser Aufgabe ist es, ein Programm zu erstellen, das Berechnungen im Zusammenhang mit elektrischen Schaltungen durchführt.
Das Programm sollte in der Lage sein, die Stromstärke, Spannung und Leistung basierend auf eingegebenen Werten zu berechnen.

STROMBERECHNUNG -> double berechneStrom(double p, double u) :
Implementieren Sie eine Funktion, die die Leistung (in Watt) und die Spannung (in Volt) als Parameter akzeptiert und die resultierende Stromstärke (in Ampere) berechnet und zurückgibt.

SPANNUNGSBERECHNUNG -> double berechneSpannung(double p, double i) : Implementieren Sie eine Funktion, die die Leistung (in Watt) und die Stromstärke (in Ampere) als Parameter akzeptiert und die resultierende Spannung (in Volt) berechnet und zurückgibt.

LEISTUNGSBERECHNUNG -> double berechneLeistung(double u, double i) : Implementieren Sie eine Funktion, die die Spannung (in Volt) und die Stromstärke (in Ampere) als Parameter akzeptiert und die resultierende Leistung (in Watt) berechnet und zurückgibt.

BERECHNUNGSFUNKTION berechneFunktion() : Implementieren Sie eine Funktion, die ein Menü anzeigt, in dem Benutzer*innen auswählen können, welche Art von Berechnung durchgeführt werden soll. Die Funktion sollte dann die entsprechenden Werte einlesen, die entsprechende Berechnung durchführen und das Ergebnis ausgeben. Die Funktion sollte so lange laufen, bis entschieden wird, dass keine weiteren Berechnungen durchführt werden sollen.

*/

import java.util.Scanner;

public class Lösung_7
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        berechneFunktion();
    }

    private static void berechneFunktion()
    {
        int auswahl = 0;
        double zahl1, zahl2, erg;
        boolean weiter = true;

        while (weiter)
        {
            System.out.println("Was wollen Sie berechnen?");
            System.out.println("1. <- Stromstärke\n2. <- Spannung\n3. <- Leistung");
            System.out.print("Eingabe: ");

            auswahl = scanner.nextInt();

            switch (auswahl)
            {
                case 1:
                    System.out.print("Bitte geben Sie die Leistung in W als Gleitkommazahl ein: ");
                    zahl1 = scanner.nextDouble();
                    System.out.print("Bitte geben Sie die Spannung in V als Gleitkommazahl ein: ");
                    zahl2 = scanner.nextDouble();
                    erg = berechneStrom(zahl1, zahl2);
                    System.out.printf("Die Stromstärke der Leistung %.2f Watt und der Spannung %.2f Volt beträgt %.2f A (Ampere).\n\n",
                        zahl1, zahl2, erg);
                    break;
                case 2:
                    System.out.print("Bitte geben Sie die Leistung in W als Gleitkommazahl ein: ");
                    zahl1 = scanner.nextDouble();
                    System.out.print("Bitte geben Sie die Stromstärke in A als Gleitkommazahl ein: ");
                    zahl2 = scanner.nextDouble();
                    erg = berechneStrom(zahl1, zahl2);
                    System.out.printf("Die Spannung der Leistung %.2f Watt und der Stromstärke %.2f Ampere beträgt %.2f V (Volt).\n\n", zahl1, zahl2, erg);
                    break;
                case 3:
                    System.out.print("Bitte geben Sie die Spannung in V als Gleitkommazahl ein: ");
                    zahl1 = scanner.nextDouble();
                    System.out.print("Bitte geben Sie die Stromstärke in A als Gleitkommazahl ein: ");
                    zahl2 = scanner.nextDouble();
                    erg = berechneLeistung(zahl1, zahl2);
                    System.out.printf("Die Leistung der Spannung %.2f Volt und der Stromstärke %.2f Ampere beträgt %.2f W (Watt).\n\n", zahl1, zahl2, erg);
                    break;
                default:
                    System.out.println("Eingabe nicht erkannt!\n");
                    break;
            }

            while (true)
            {
                System.out.println("Wollen Sie eine weitere Berechnung durchführen?");
                System.out.println("1. <- Ja\n2. <- Nein");
                System.out.print("Eingabe: ");
                auswahl = scanner.nextInt();
                if (auswahl == 1)
                {
                    break;
                }
                else if (auswahl == 2)
                {
                    weiter = false;
                    break;
                }
                else
                    System.out.println("Eingabe nicht erkannt!\n");
            }
        }
    }

    private static double berechneStrom(double p, double u)
    {
        return p / u;
    }

    private static double berechneSpannung(double p, double i)
    {
        return p / i;
    }

    private static double berechneLeistung(double u, double i)
    {
        return u * i;
    }
}