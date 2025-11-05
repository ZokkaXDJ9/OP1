package aufgaben;
import java.util.Scanner;
/* Level 1
 * Schreiben Sie ein Java-Programm das kontrolliert, ob eine Zahl gerade oder ungerade ist und dann einen String ausgibt der sagt "Die Zahl ist ungerade" oder "Die Zahl ist gerade".
 * Hinweis: Zur Vergleichsberechnung bietet sich der Modulo-Operator % an.
 */
public class Aufgabe_0 {
    public static void main(String[] args) {
        int übergebeneZahl = 0;

        // Scanner initialisieren
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein, die überprüft werden soll:");

        // Zahl einlesen
        übergebeneZahl = scanner.nextInt();

        // Logik zur Überprüfung
        if (übergebeneZahl % 2 == 0)
        {
            System.out.println("Die Zahl ist gerade.");
        }
        else
        {
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}
