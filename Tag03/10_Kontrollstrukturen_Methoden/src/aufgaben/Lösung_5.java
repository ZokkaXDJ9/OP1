package aufgaben;

import java.util.Scanner;

/* Level 2
    Collatz-Problem https://de.wikipedia.org/wiki/Collatz-Problem
    Schreiben Sie folgendes Programm:
    Ein User gibt eine positive Ganzzahl ein.
    Ist die Zahl gerade, wird sie durch 2 geteilt. Ist sie ungerade, wird sie mit 3 multipliziert und anschließend mit 1 addiert.
    Der Vorgang wiederholt sich mit dem Ergebnis, bis dieses genau 1 beträgt.
    Das Collatz-Problem besagt, dass dieser Vorgang immer zur 1 führt, egal welche positive Ganzzahl am Anfang gewählt wurde.
    Beispiel: Wird die 3 eingegeben, braucht der Algorithmus 7 Durchläufe, um zur 1 zu gelangen.
    1: 3*3+1 = 10
    2: 10/2 = 5
    3: 5*3+1 = 16
    4: 16/2 = 8
    5: 8/2 = 4
    6: 4/2 = 2
    7: 2/2 = 1
*/
public class Lösung_5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine positive Ganzzahl ein: ");

        // zahl = Eingabe
        int zahl = Integer.parseInt(scanner.nextLine());
        int anzahl = 0;
        do
        {
            if (zahl % 2 == 0)
                zahl = zahl / 2;
            else
                zahl = (zahl * 3) + 1;
            anzahl++;
            System.out.println("aktuelle Zahl: " + zahl);
        } while (zahl != 1);


        System.out.println("Anzahl Durchläufe: " + anzahl);

    }
}
