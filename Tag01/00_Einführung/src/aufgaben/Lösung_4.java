package aufgaben;

/* Level 2
Zu Beginn des Programmes wird der Variable kantenlaengeKubus der Wert 3.75 zugewiesen.
Anschließend werden Oberfläche und Volumen des Kubus berechnet und in die Variablen oberflaeche und volumen abgespeichert.
Dann soll die folgende Ausgabe (entsprechend des dargestellten Layouts) ausgegeben werden:

*****************************************
*       Ergebnisse für Kantenlänge x    *
*****************************************

Oberfläche: oberflaeche
Volumen: volumen

(Alle Zahlenwerte auf 2 Nachkommastellen genau)
 */

import java.util.Locale;

public class Lösung_4
{
    public static void main(String[] args)
    {
        double kantenlaengeKubus = 3.75;
        double oberflaeche = 6 * (kantenlaengeKubus * kantenlaengeKubus);
        double volumen = kantenlaengeKubus * kantenlaengeKubus * kantenlaengeKubus;

        System.out.println("*****************************************");
        System.out.println("*\tErgebnisse für Kantenlänge "+ kantenlaengeKubus + "\t\t*");
        System.out.println("*****************************************");
        System.out.println();
        System.out.printf(Locale.US, "Oberfläche: %.2f\n", oberflaeche);
        System.out.printf(Locale.US, "Volumen: %.2f\n", volumen);

    }
}
