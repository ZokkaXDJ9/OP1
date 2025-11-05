package vorlesung;

/*
Gegeben sei der folgende Pseudocode:

Programm
{
    Eingabe: alter

    falls (alter > 17)
    {
        Ausgabe: "In Deutschland gelten Sie als volljährig."
    }
    sonst
    {
        Ausgabe: "In Deutschland gelten Sie nicht als volljährig."
    }
}
*/

import java.util.Scanner; // Wir müssen den Scanner zur Eingabe importieren. Vergleichbar mit "include" in C.

public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Wir erzeugen ein Objekt der Klasse Scanner und weisen das Objekt der Variable "scanner" zu.

        System.out.println("Bitte Alter eingeben: ");
        String eingabe = scanner.nextLine(); // nextLine() ist eine Funktion des Scanners "scanner" (Des Objekts, nicht der Klasse!). nextLine() gibt uns den eingegebenen Text zurück.

        int alter = Integer.parseInt(eingabe); // Das eingegebene Alter in einen Integer konvertieren, damit wir es mit einer Zahl vergleichen können.

        if (alter > 17) {
            System.out.println("In Deutschland gelten Sie als volljährig.");
        }
        else{
            System.out.println("In Deutschland gelten Sie noch nicht als volljährig.");
        }
        // Der Umstieg von C auf Java ist nicht schwer. Schleifen etc sind genau gleich!
    }
}
