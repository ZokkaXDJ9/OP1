package aufgaben;

/* Level 2
        VORBEMERKUNG:
        Das folgende Programm soll mit einer Liste von String-Arrays der Länge 2 arbeiten
        → Jedes Element der Liste ist also ein Array, in dem jeweils 2 Strings abgespeichert werden können.

        AUFGABENSTELLUNG:
        Schreiben Sie bitte ein Programm, in dem ...
        - zunächst eine Liste von String-Arrays der Länge 2 eingeführt wird
        - eine Endlos-Schleife startet, in der pro Durchlauf ...
          + die Konsole gelöscht wird
          + vom User ein deutsches Wort und dessen englische übersetzung abgefragt wird
          + die beiden User-Eingaben in ein String-Array der Länge 2 abgespeichert werden
          + dieses Array in der Liste abgespeichert wird
          + anschließend alle Wortpaare der Liste ausgegeben werden
          + das Programm bis zu einem Tastendruck angehalten wird
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lösung_3 {

    public static void main(String[] args)
    {
        // Liste vom Typ String-Array
        ArrayList<String[]> stringArrayListe = new ArrayList<String[]>();
        String[] wörter;
        Scanner sc = new Scanner(System.in);

        // Endlosschleife
        while (true)
        {
            // Deutsches Wort eingeben
            System.out.println("Deutsches Wort: ");
            String deutsch = sc.nextLine();

            // Englische Übersetzung eingeben
            System.out.println("Englische Übersetzung: ");
            String englisch = sc.nextLine();

            // Beide Wörter in einem String-Array speichern
            // string[] wörter = new string[] { deutsch, englisch };
            wörter = new String[2];
            wörter[0] = deutsch;
            wörter[1] = englisch;

            // String-Array zur Liste hinzufügen
            stringArrayListe.add(wörter);

            // Alle Wortpaare ausgeben
            for (String[] array : stringArrayListe) {
                System.out.println(array[0] + " - " + array[1]);
            }
        }
    }

}







