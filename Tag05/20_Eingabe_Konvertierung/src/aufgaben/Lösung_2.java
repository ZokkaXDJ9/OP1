/* Level 1
    Schreiben Sie bitte ein Programm, in dem  ...
    - in einer Schleife pro Durchlauf so lange 2 Double-Zahlen vom User abgefragt werden, bis deren Differenz (auf 2 Nachkommastellen gerundet) 0 beträgt
    - pro Durchlauf wird jeweils die aktuelle Differenz ausgegeben

    HINWEIS:
    Je nach Reihenfolge der Differenzbildung (bzw. Eingabe der Zahlen) kann die Differenz positiv, oder negativ sein ...
    ... sorgen Sie bitte bei der Ausgabe dafür, dass die Differenz stets als ein Wert größer gleich 0 ausgegeben wird.
    Zum Runden oder zum Bilden des positiven Betrags eines Wertes gibt es passende Methoden in der Math-Klasse
*/

package aufgaben;

import java.util.Scanner;

public class Lösung_2
{
    public static void main(String[] args)
    {
        double a, b, differenz;

        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Geben Sie bitte eine erste Zahl ein: ");
            a = Double.parseDouble(scanner.nextLine());
            System.out.println("Geben Sie bitte eine zweite Zahl ein: ");
            b = Double.parseDouble(scanner.nextLine());

            differenz = Math.abs(Math.round((a - b) * 100)) / 100.0;

            System.out.println("Differenz (auf zwei Nachkommastellen gerundet): " + differenz + "\n");
        }
        while (differenz != 0);
    }
}
