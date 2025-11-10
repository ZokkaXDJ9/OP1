/* Level 2
 * Schreiben Sie eine Funktion, die die Stromkosten im Jahr für einen Computer berechnet.
 * Es soll der Verbrauch des Computers (in Watt),
 * die durchschnittliche Zeit, die der Computer am Tag läuft in Stunden
 * und die Stromkosten pro kWh als Argumente an die Funktion übergeben werden.
 * Wer die Werte seines Computers, oder die Stromkosten pro kWh seines Anbieters nicht kennt,
 * sollte mit folgenden Werten arbeiten:
 * Verbrauch eines Laptops: 70
 * Stromkosten kWh: 25 Cent
 * Erstellen Sie einen PAP, ein Struktogramm, oder Pseudocode und anschließend ein Java-Programm.
 */

package aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Lösung_5
{

	public static double BerechneStromkostenJahr(int verbrauchWatt, int zeitTagDurchschnitt, double stromkostenKWHCent)
    {
        double verbrauchKW = verbrauchWatt / 1000.0;
        double verbrauchKWTag = verbrauchKW * zeitTagDurchschnitt;
        double verbrauchKWJahr = verbrauchKWTag * 365;
        double stromkostenKWHEuro = stromkostenKWHCent / 100;
        double stromkostenJahr = stromkostenKWHEuro * verbrauchKWJahr;

        return stromkostenJahr;
    }

	public static void main(String[] args) 
	{
		 int verbrauchWatt;
         int zeitTagDurchschnitt;
         double stromkostenKWHCent;
         DecimalFormat f = new DecimalFormat("#0.00");
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Bitte Verbrauch in Watt eingeben: ");
         verbrauchWatt = Integer.parseInt(sc.nextLine());
         
         System.out.print("Bitte Zeit eingeben, die das das Gerät durchschnittlich am Tag verwendet wird: ");
         zeitTagDurchschnitt = Integer.parseInt(sc.nextLine());

         System.out.print("Bitte Stromkosten in Cent pro kw/h eingeben: ");
         stromkostenKWHCent =Double.parseDouble(sc.nextLine());
		
		System.out.println("\u20ac" + " <--- So wird das Euro-Zeichen dargestellt");
		
		System.out.println("Stromkosten im Jahr: " +f.format(BerechneStromkostenJahr(verbrauchWatt, zeitTagDurchschnitt, stromkostenKWHCent))+" \u20ac"); // Ausgabe mit Währung
	}

}