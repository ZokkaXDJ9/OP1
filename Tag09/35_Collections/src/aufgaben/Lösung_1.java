package aufgaben;

/* Level 1
 Schreiben Sie bitte ein Java Programm, in dem ...
 - innerhalb einer ersten Schleife pro Durchlauf ganze Zahlen abgefragt werden:
   + falls der User inkorrekte Eingaben tätigt (Text, Kommazahlen, zu große Zahlen ...) wird die Eingabe ignoriert
   + falls die Eingabe eine positive ganze Zahl ist, wird sie in eine Integer-Liste eingetragen
   + falls die Eingabe eine negative Ganzzahl oder 0 ist, endet diese erste Schleife
 - eine foreach-Schleife startet, die alle Elemente aus der Liste ausgibt
 - eine weitere Schleife startet, in der pro Durchlauf eine ganze Zahl abgefragt wird:
   + falls der User keine ganze Zahl eingibt, kommt es zum nächsten Schleifendurchlauf (Wiederholen der Abfrage)
   + falls der User eine ganze Zahl x eingibt, endet die Schleife
 - aus der Liste alle Elemente gelöscht werden, deren Wert x ist (siehe vorangegangene User-Eingabe)
 - zur Kontrolle die (verkürzte) Liste ausgegeben wird

 Zur Erläuterung ein Beispiel:
 Angenommen der User gibt der Reihe nach 1 2 2 3 a b c und -1 ein, dann ergibt die erste Ausgabe: 1 2 2 3
 (denn a b und c werden ignoriert und -1 beendete die Eingabe-Schleife)
 Nehmen wir ferner an, der User gibt anschließend der Reihe nach a b 2 ein, so werden alle 2en aus der Liste gelöscht
 (denn a und b wurden ignoriert und die erste zulässige Eingabe als Löschwert genutzt)
 => die abschließende Ausgabe lautet dann also: 1 3

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Lösung_1
{
    public static void main(String[] args)
    {

        int eingabe = 0;
        String s;
        boolean parseOk = false;
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("Geben Sie bitte eine ganze Zahl ein: ");

                try
                {
                    s = sc.nextLine();
                    eingabe = Integer.parseInt(s);
                    parseOk = true;
                }
                catch (Exception ex)
                {
                    parseOk = false;
                }
            } while (!parseOk);

            if (eingabe > 0)
            {
                System.out.println("add");
                zahlen.add(eingabe);
            }
        } while (eingabe > 0);

        System.out.println("finish");

        int zuLöschen = 0;
        do
        {
            System.out.println("Ausgabe aller Elemente der Liste 'zahlen': ");
            for (int zahl : zahlen)
                System.out.print(zahl + " ");
            System.out.println("\n\nGeben Sie bitte einen Zahlenwert ein, der gelöscht werden soll: ");
            s = sc.nextLine();
            try
            {
                zuLöschen = Integer.parseInt(s);
            }
            catch (Exception ex)
            {
                zuLöschen = -1;
            }
        } while (!zahlen.contains(zuLöschen));

        while (zahlen.remove((Integer) zuLöschen))
            // remove() löscht das Element, wenn es vorhanden ist und gibt dann true zurück. Sobald false zurückgegeben wird, endet die Schleife.
        {
            System.out.print("löschen...");
        }

        System.out.printf("Ausgabe aller Elemente der Liste 'zahlen' (nach Löschung von %s):%n", zuLöschen);

        for (int zahl : zahlen)
            System.out.print(zahl + " ");

    }
}

