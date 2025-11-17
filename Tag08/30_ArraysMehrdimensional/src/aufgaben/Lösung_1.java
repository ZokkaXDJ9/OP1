package aufgaben;

/* Level 1
Schreiben Sie bitte ein Java-Programm, in dem
a) ein 2-dimensionales Array (Dimensionen 2,3) namens "lexikon" eingeführt wird
b) in [0][x] (für alle x=0;1 oder 2) ein Begriff initialisiert wird
c) in [1][x] jeweils die Erläuterung des Begriffes abgespeichert wird
d) in einer Endlosschleife vom User pro Durchlauf ein Begriff abgefragt wird
e) die passende Erläuterung ausgegeben wird, oder eine Fehlermeldung, falls der Begriff nicht vorhanden

Beispiel:
lexikon[0][0]="Auto" / lexikon[1][0]="Motorisiertes Straßen-Fahrzeug mit 4 Rädern"
lexikon[0][1]="OOP" / lexikon[1][1]="Abkürzung für 'Objektorientierte Programmierung'"
lexikon[0][2]="Süßstoff" / lexikon[1][2]="Kalorienarmer Zuckerersatz"

Hinweis:
- die rechte Dimension (3) zählt die Anzahl der abgespeicherten Begriffs-Erläuterung-Paare
- die linke Dimension (2) zählt also die "Textarten" (Begriff oder Erläuterung)
*/

import java.util.Scanner;

public class Lösung_1 {

    public static void main(String[] args) {

        String[][] Lexikon = new String[2][3];

        Lexikon[0][0] = "Auto";
        Lexikon[0][1] = "OOP";
        Lexikon[0][2] = "Süßstoff";

        Lexikon[1][0] = "Motorisiertes Straßen-Fahrzeug mit 4 Rädern";
        Lexikon[1][1] = "Abkürzung für 'Objektorientierte Programmierung'";
        Lexikon[1][2] = "Kalorienarmer Zuckerersatz";

        Scanner scanner = new Scanner(System.in);
        do {
            boolean gefunden = false;
            System.out.print("Bitte Begriff eingeben (EXIT zum Beenden): ");
            String s = scanner.next();

            if (s.equalsIgnoreCase("EXIT"))
                break;

            for (int i = 0; i < Lexikon[0].length; i++) {
                if (Lexikon[0][i].equalsIgnoreCase(s)) {
                    System.out.printf("%s%s%n", "Erläuterung: ", Lexikon[1][i]);
                    gefunden = true;
                    break;
                }
            }
            if (!gefunden) {
                System.out.printf("Der Begriff %s wurde nicht gefunden!%n", s);
            }
        } while (true);
    }

}











