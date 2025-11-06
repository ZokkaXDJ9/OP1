package aufgaben;

/* Level 2
Die WBS Training AG plant, ihren Posteingang vollständig auf einen digitalen Workflow umzustellen. Ihre Aufgabe besteht darin, ein Programm zu entwickeln, das die notwendige Speicherkapazität berechnet, um das gesamte Datenvolumen eines Jahres aufnehmen zu können.
Die folgenden Parameter sind gegeben:
Der tägliche Posteingang beträgt 3000 Seiten (einseitig) im DIN A4-Format (29,7 cm x 21 cm).
Es gibt 250 Arbeitstage pro Jahr.
Die Auflösung beträgt 300 dpi x 300 dpi (beachten Sie, dass 1 Inch gleich 2,54 cm ist).
Die Farbtiefe beträgt 24 Bit.
Die Daten werden auf 50% ihrer ursprünglichen Größe komprimiert.
Das Programm sollte die Gesamtspeichermenge in Tebibyte (TiB) pro Jahr berechnen und das Ergebnis auf volle TiB aufrunden. Das Endergebnis sollte dann ausgegeben werden.

Formel für eine Seite
Ergebnis=(Pixel(höhe)*Pixel(breite)*Farbtiefe*Komprimierung)/8
 */

public class Lösung_7
{
    public static void main(String[] args)
    {
        double höhe = 29.7, breite = 21;
        double komprimierung = 0.5;
        int anzahl = 3000;
        int farbtiefe = 24;
        int tage = 250;

        höhe = umwandlungInch(höhe);
        breite = umwandlungInch(breite);

        System.out.printf("%.4f inch\n", höhe);
        System.out.printf("%.4f inch\n", breite);
        höhe = umwandlungPixel(höhe);
        breite = umwandlungPixel(breite);
        System.out.printf("%.0f Pixel\n", höhe);
        System.out.printf("%.0f Pixel\n", breite);

        double erg = berechneDatenvolumen(höhe, breite, farbtiefe, anzahl, tage, komprimierung);
        System.out.printf("Ergebnis = %.2f", erg);
        System.out.printf(" = %.0f TiB\n" ,erg);

    }

    private static double umwandlungInch(double zahl)
    {
        return zahl / 2.54;
    }

    private static double umwandlungPixel(double zahl)
    {
        return zahl * 300;
    }

    private static double berechneDatenvolumen(double pixelH, double pixelB, int farbtiefe, int anzahl, int tage, double komprimierung)
    {
        double erg = pixelH * pixelB * farbtiefe * anzahl * tage * komprimierung / 8; // In Byte

        erg = erg / 1024; // Umrechnung in KiB
        erg = erg / 1024; // Umrechnung in MiB
        erg = erg / 1024; // Umrechnung in GiB
        erg = erg / 1024; // Umrechnung in TiB

        return erg;
    }
}


