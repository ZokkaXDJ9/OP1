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
public class Lösung_7v2
{
	static double mebibyteProScan(String format, int dpi, int farbtiefeBit, int komprimierungProzent)
	{
		// Die DPI müssen multipliziert werden
		int dpiFläche = dpi * dpi;

		// Die Fläche in CM muss in INCH umgerechnet werden
		double inchFläche = 0;

		// Abhängig vom gewählten Format...
		if (format.equals("DINA4"))
		{
			inchFläche = (29.7 / 2.54) * (21 / 2.54);
		}
		else if (format.equals("IHK")) // Angelehnt an die IHK AP1 Herbst 2022 Prüfung, Aufgabe 2
		{
			inchFläche = (50.8 / 2.54) * (30.48 / 2.54);
		}

		// Um die Bits zu bekommen, multiplizieren wir die dpi mit den inch und der Farbtiefe.
		double bits = dpiFläche * inchFläche * farbtiefeBit;
		// Laut Aufgabenstellung soll auch noch komprimiert werden
		double bitsKomprimiert = bits * (komprimierungProzent / 100.0);
		// Die Rückgabe wollen wir in Mebibyte
		double mib = bitsKomprimiert / 8 / 1024 / 1024;
		// und geben dann die Mebibyte zurück.
		return mib;
	}

	static double tebibyteProTag(double mib, int anzahlScans)
	{
		double tib = mib * anzahlScans / 1024 / 1024;
		return tib;
	}

	public static void main(String[] args)
	{
		double mib = mebibyteProScan("DINA4", 300, 24, 50);
		System.out.println(mib);

		double tib = tebibyteProTag(mib, 3000);
		System.out.println(tib);

		// Auf volle TiB aufrunden und ohne Kommastelle ausgeben (wie in der IHK Aufgabe):
		System.out.printf("%.0f\n", Math.ceil(tib));

		System.out.println("Speicherverbrauch pro Jahr in TiB: " + (tib * 250));
	}
}
