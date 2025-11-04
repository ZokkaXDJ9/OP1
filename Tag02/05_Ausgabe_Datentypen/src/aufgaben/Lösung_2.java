package aufgaben;

/* Level 1
Schreiben Sie bitte ein Java-Programm, das
a) eine Integer-Variable g einführt, die für alle Funktionen in der Klasse gültig ist
b) eine Integer-Variable l einführt, die nur im Main gültig ist
c) eine Methode besitzt, die im Main aufgerufen werden kann und g-mal "Hallo" auf der Konsole ausgibt
d) im Main l-mal "Welt" auf der Konsole ausgibt
e) zur Kontrolle im Main die beiden Werte g und l auf der Konsole ausgibt


Hinweis:
Das Erlernen von ANSI C war nicht sinnlos ;-) ...
... for-Schleifen sehen bei Java genauso aus wie bei C
*/

public class Lösung_2
{
    static int g = 3;

    static void G_mal_Hallo()
    {
        for(int i = 0; i < g; i++)
            System.out.println("Hallo");
    }


    public static void main(String[] args)
    {
        G_mal_Hallo();
        System.out.println();

        int l = 4;
        for(int i = 0; i < l; i++)
            System.out.println("Welt");


        System.out.printf("\nDer Wert der Variable g lautet: %s und l lautet: %s ", g , l);
    }

}
