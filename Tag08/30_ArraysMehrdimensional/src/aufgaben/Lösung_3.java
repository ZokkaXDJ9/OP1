package aufgaben;

/* Level 2
Führen Sie im Main bitte zunächst das folgende 3-Dimensionale Array ein:

      String[][][] dim3 = new String[][][] {
            {
                {"Tabelle","Datenbank","Spalte","Beschränkung"},
                {"zuweisen","setzen","erhalten","Liste"},
                {"Puffer","Projekt","Organisation","Interessengruppe"}
            },
            {
                {"table","database","column","constraint"},
                {"assign","set","get","list"},
                {"buffer","project","organization","stakeholder"}
            }
        };

 HINWEISE:
 - Die linke Dimension zählt die Sprache (0=Deutsch, 1=Englisch)
 - Die mittlere Dimension zählt das Fach (0=SQL, 1=OOP, 2=PM)
 - Die rechte Dimension zählt die Wortnummern [0 bis 3] (Für jede Sprache und jedes Fach jeweils 4 Wörter)

 Schreiben Sie bitte das folgende Programm, um den Umgang mit diesem 3-dimensionalen Array zu testen:
 - Das Programm besteht aus einer Endlos-Schleife, in der pro Durchlauf ...
   + Die Sprache abgefragt wird (Deutsch=1 / Englisch=2) - Wiederholung der Abfrage bei Fehleingabe
   + Das Fach abgefragt wird (SQL=1 / OOP=2 / PM=3) - Wiederholung der Abfrage bei Fehleingabe
   + Die Wortnummer abgefragt wird (ein Wert zwischen 1 und 4) - Wiederholung der Abfrage bei Fehleingabe
   + das gewählte Wort, des gewählten Fachs in der gewählten Sprache auf der Konsole ausgegeben wird

   Beispiel:
   Bei der Auswahl: 1 1 1 (Deutsch, SQL, 1.Wort) kommt es zur Ausgabe von dim3[0][0][0]="Tabelle"
*/

import java.util.Scanner;

public class Lösung_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][][] dim3 = new String[][][]
            {
                {
                    { "Tabelle", "Datenbank", "Spalte", "Beschränkung" },
                    { "zuweisen", "setzen", "erhalten", "Liste" },
                    { "Puffer", "Projekt", "Organisation", "Interessengruppe" } },
                {
                    { "table", "database", "column", "constraint" },
                    { "assign", "set", "get", "list" },
                    { "buffer", "project", "organization", "stakeholder" }
                }
            };

        do {
            short auswahl;
            short sprache; // Int16
            short thema;
            short wort;

            do {
                System.out.println("Start=1 / Beenden=2");
                System.out.print("Auswahl: ");
                auswahl = scanner.nextShort();
            } while (auswahl < 1 || auswahl > 2); // Wiederhole, solange sprache kleiner 1 oder größer 2

            if (auswahl == 2)
                break; // Endlos-Schleife beenden

            do {
                System.out.println("Deutsch=1 / Englisch=2");
                System.out.print("Auswahl: ");
                sprache = scanner.nextShort();
            } while (sprache < 1 || sprache > 2); // Wiederhole, solange sprache kleiner 1 oder größer 2

            do {
                System.out.println("SQL=1 / OOP=2 / PM=3");
                System.out.print("Auswahl: ");
                thema = scanner.nextShort();
            } while (thema < 1 || thema > 3); // Wiederhole, solange thema kleiner 1 oder größer 3

            do {
                System.out.println("Ein Wert zwischen 1 und 4");
                System.out.print("Auswahl: ");
                wort = scanner.nextShort();
            } while (wort < 1 || wort > 4);

            System.out.println("Ausgewählt: " + dim3[sprache - 1][thema - 1][wort - 1]);

        } while (true);
    }
}









