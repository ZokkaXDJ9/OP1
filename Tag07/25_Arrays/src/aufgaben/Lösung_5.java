package aufgaben;

import java.util.Arrays;
import java.util.Random;
/* Level 2

Stellen Sie sich vor, Sie arbeiten für ein Einzelhandelsunternehmen und sollen die Verkaufszahlen eines bestimmten Produkts über einen Zeitraum von 30 Tagen analysieren. Ihr Ziel ist es, die minimalen, maximalen und durchschnittlichen Verkaufszahlen zu ermitteln.

Anforderungen:

    Verkaufsdatenarray:
        Erstellen Sie ein eindimensionales Array int[] sales, das die Verkaufszahlen für 30 Tage speichert.
        Dabei steht der Index des Arrays für den Tag, beginnend bei Index 0 für Tag 1 des Monats.
        Füllen Sie das Array mit zufälligen Verkaufszahlen zwischen 0 und 100, um die täglichen Verkäufe zu simulieren.

    Analyse:
        Implementieren Sie eine Methode analyzeSales(int[] sales), die die folgenden Informationen berechnet und ausgibt:
            Die minimale Verkaufszahl und der entsprechende Tag.
            Die maximale Verkaufszahl und der entsprechende Tag.
            Die durchschnittliche Verkaufszahl über die 30 Tage.

Erwartete Ausgabe (Beispiel):
    Minimaler Verkauf: 3 Einheiten am Tag 5
    Maximaler Verkauf: 95 Einheiten am Tag 12
    Durchschnittlicher Verkauf: 48.7 Einheiten
*/
public class Lösung_5
{
	private static final Random random = new Random();
	public static void main(String[] args)
	{
		int[] sales = new int[30];
		for (int i = 0; i < sales.length; i++)
		{
			sales[i] = random.nextInt(100);
		}

		System.out.println(Arrays.toString(sales));

		analyzeSales(sales);
	}

	private static void analyzeSales(int[] sales)
	{
		int min = sales[0];
		int minIndex = 0;
		int max = sales[0];
		int maxIndex = 0;
		int summe = sales[0];
		double avg;

		for (int i = 1; i < sales.length; i++)
		{
			summe += sales[i];
			if (sales[i] < min)
			{
				min = sales[i];
				minIndex = i;
			}
			else if (sales[i] > max)
			{
				max = sales[i];
				maxIndex = i;
			}
		}

		avg = (double)summe / (double)sales.length;

		System.out.printf("Minimaler Verkauf: %d Einheiten an Tag %d\n", min, minIndex+1 );
		System.out.printf("Maximaler Verkauf: %d Einheiten an Tag %d\n", max, maxIndex+1);
		System.out.printf("Durchschnittlicher Verkauf: %f", avg);

	}
}
