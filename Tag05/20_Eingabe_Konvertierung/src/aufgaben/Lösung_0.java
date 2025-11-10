/* Level 1
Schreiben Sie bitte ein Java-Programm, das 
a) einen Integer-Wert so lange abfragt, bis er mindestens die Größe 10 hat
b) bei jeder zu kleinen Eingabe eine Fehlermeldung ausgibt
c) bei einer Eingabe von mindestens 10 mit einer Erfolgsmeldung das Programm beendet


Bemerkungen:
1) Auch while und do-while Schleifen unterscheiden sich in Java nicht von denen in ANSI C
2) Fehleingaben im Sinne von Buchstaben, Zeichen, oder Kommazahlen werden vom Programm NICHT abgefangen 
*/

package aufgaben;

import java.util.Scanner;

public class Lösung_0
{
    public static void main(String[] args)
    {
        int eingabe;

        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
            eingabe = Integer.parseInt(sc.nextLine());
            if (eingabe < 10)
                System.out.println("Eingabe leider zu klein!\n");
        } while (eingabe < 10);

        System.out.println("Eingabe groß genug");

    }
}

