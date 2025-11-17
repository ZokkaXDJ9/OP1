package aufgaben;

/* Level 2
    Schreiben Sie bitte zunächst die beiden folgenden Methoden:
    a) Funktionsname: fülleLottoArray
       Übergabewerte: 1 Integer-Array
       Funktion:      Füllt in das Array mit 6 Lottozahlen (Zahlen zwischen 1 und 49, KEINE Zahl darf mehrfach auftreten)
       Rückgabewert:  Keiner

    b) Funktionsname: zähleTreffer
       Übergabewerte: 2 Integer-Array a und b
       Funktion:      Zählt die Anzahl der "Treffer" (= Anzahl der Zahlen, die in a und b gemeinsam auftreten)
       Rückgabewert:  Anzahl der Treffer

    Verwenden Sie obige Funktionen bitte in folgendem Java-Programm, in dem ...
    - zunächst ein Lottotipp ausgelost wird (Random oder vom Benutzer eingeben lassen)
		und in einem Array 'tipp' abgespeichert wird
    - anschließend eine do-while-Schleife startet, die pro Durchlauf ...
      + eine Lotto-Auslosung (6 Zahlen, also ohne Zusatzzahl) in ein Array 'auslosung' abspeichert
      + Lottotipp und (aktuelle) Auslosung auf der Konsole ausgibt
      + aktuelle Anzahl der Treffer (wie viele Richtige wurden erzielt?) ermittelt und auf der Konsole ausgibt
	  + die Auslosung in einem 2-dimensionalen Array abspeichert
    - die Schleife endet, wenn (mindestens) 3 Treffer erreicht wurden, oder 10 Durchläufe / Auslosungen stattfanden.
    - nach der Schleife zur Kontrolle die Auslosungen des 2-dimensionalen Arrays auf der Konsole ausgegeben werden
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Lösung_2 {
    static Random zufGenerator = new Random();

    static void fülleLottoArray(int[] arr) {

        for (int i = 0; i < 6;) {
            int zahl = zufGenerator.nextInt(49) + 1;
            // int random = (int)(Math.random() * 49 + 1);

            boolean vorhanden = false;
            for (int j = 0; j < i; j++)
            {
                if (arr[j] == zahl)
                {
                    vorhanden = true;
                    break;
                }
            }

            if (!vorhanden)
            {
                arr[i] = zahl;
                i++;
            }
        }
        Arrays.sort(arr);
    }

    static int zähleTreffer(int[] arr, int[] brr) {
        int treffer = 0;
        for (int a : arr)
            for (int b : brr)
                if (a == b)
                    treffer++;
        return treffer;
    }

    public static void main(String[] args) throws IOException {

        int[] tipp = new int[6]; // Lottozahlen des Benutzers
        int[] auslosung = new int[6]; // Aktuelle Lottoziehung
        int[][] zweiDim = new int[10][6]; // Zweidimensionales Array für die Historie
        int treffer; // Anzahl Durchläufe
        int zähler = 0; // Übereinstimmungen im Array

        int max = 10;

        // Fülle das Lotto Array mit den Zahlen des Benutzers (Zufällig)
        fülleLottoArray(tipp);

        do
        {
            // Ausgabe der Zahlen des Benutzers
            System.out.println("Lottotipp:   ");
            for (int zahl : tipp)
                System.out.print(zahl + " ");

            // Lottoziehung
            fülleLottoArray(auslosung);

            // Wenn noch Platz im 2-Dim Array ist...
            if (zähler < max)
                // Kopiere die Lottoziehung in das 2-Dim Array
                for (int i = 0; i < 6; i++)
                    zweiDim[zähler][i] = auslosung[i];

            // Ausgabe der Lottoziehung
            System.out.println("\nAuslosung:   ");
            for (int zahl : auslosung)
                System.out.print(zahl + " ");

            // Treffer zählen
            treffer = zähleTreffer(tipp, auslosung);
            System.out.println("\nTrefferzahl: " + treffer);
            System.out.println();

            zähler++;
        }
        while (treffer < 3 && zähler < max);

        // Ausgabe des 2-Dim Array
        System.out.println("Kontrollausgabe des Arrays 'zweiDim':");
        for (int i = 0; i < zähler; i++)
        {
            for (int j = 0; j < 6; j++)
                System.out.print(zweiDim[i][j] + " ");
            System.out.println();
        }

    }

}









