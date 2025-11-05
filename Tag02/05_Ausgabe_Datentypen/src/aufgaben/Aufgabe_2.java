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
public class Aufgabe_2 {
    static int g = 5;

    static void hallo()
    {
        for(int i = 0; i < g; i++)
        {
            System.out.println("Hallo");
        }
    }

    static void main(String[] args) {
        int l = 4;

        hallo();

        for(int j = 0; j < l; j++) {
            System.out.println("Welt");
        }

        StringBuilder build = new StringBuilder();
        build.append("Wert von g: ");
        build.append(g);
        build.append("\n");
        build.append("Wert von l: ");
        build.append(l);
        String s = build.toString();
        System.out.println(s);
    }
}
