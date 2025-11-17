package aufgaben;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;

/* Level 2

Sie sollen ein Programm schreiben, das die Temperaturen einer Woche aufzeichnet und analysiert. Jede Temperatur wird als Objekt der Klasse TemperatureRecord gespeichert.

Anforderungen:

    Klasse TemperatureRecord:
        Erstellen Sie eine Klasse TemperatureRecord mit den folgenden Attributen:
            String day: Der Tag der Woche (z.B. "Montag", "Dienstag", etc.).
            double temperature: Die aufgezeichnete Temperatur für diesen Tag.
            String unit: Die Maßeinheit, z.B. Celsius, Kelvin oder Fahrenheit.
        Beim Erzeugen der Objekte werden Tag und Temperatur über die Setter festgelegt.

    Temperaturarray:
        Erstellen Sie ein eindimensionales Array TemperatureRecord[] mit einer Größe von 7, um die Temperaturen für eine Woche zu speichern.

    Initialisierung:
        Füllen Sie das Array mit Temperaturdaten für jeden Tag der Woche. Sie können dabei fiktive Werte verwenden.

    Min/Max-Suche:
        Implementieren Sie eine Methode findMinAndMaxTemperature(TemperatureRecord[] records), die die minimale und maximale Temperatur der Woche findet und die entsprechenden Tage ausgibt.

Erwartete Ausgabe (Beispiel):
Die niedrigste Temperatur war am Donnerstag mit 15.5 Grad Celsius.
Die höchste Temperatur war am Montag mit 28.3 Grad Celsius.
*/
public class Lösung_5
{
	public static void main(String[] args)
	{
		Random random = new Random();
		TemperatureRecord[] records = new TemperatureRecord[DayOfWeek.values().length];

		for (int i = 0; i < DayOfWeek.values().length; i++)
		{
			// Neues Objekt von TemperatureRecord erstellen:
			TemperatureRecord t = new TemperatureRecord();
			// Den Tag setzen:
			// Dazu verwende ich DayOfWeek (ein Enum), welches alle Tage der Woche beinhaltet.
			// Damit diese Tage auf Deutsch gespeichert werden, rufe ich getDisplayName auf und übergebe Locale.getDefault().
			// Locale.getDefault() nimmt sich die Spracheinstellung meines Betriebssystems.
			// TextStyle.FULL sagt einfach, dass wir den Tag voll ausgeschrieben und nicht abgekürzt haben wollen.
			t.setDay(DayOfWeek.values()[i].getDisplayName(TextStyle.FULL, Locale.getDefault()));
			// Die Temperatur setzen:
			// Die Temperatur erzeuge ich über Random. Dabei erzeuge ich Integer-Werte, die ich in Double caste, um nach einer Division durch 10 eine Nachkommastelle zu erhalten.
			t.setTemperature(((double)random.nextInt(150,250)) / 10);
			t.setUnit("Celsius");
			records[i] = t;
		}

		for (TemperatureRecord t : records)
		{
			// Ausgabe aller Daten mit Hilfe der Getter und printf().
			System.out.printf("%s %.1f Grad %s\n", t.getDay(), t.getTemperature(), t.getUnit());
		}

		findMinAndMaxTemperature(records);

	}

	private static void findMinAndMaxTemperature(TemperatureRecord[] records)
	{
		TemperatureRecord min = records[0];
		TemperatureRecord max = records[0];

		for (TemperatureRecord record : records)
		{
			if (record.getTemperature() < min.getTemperature())
				min = record;
			else if (record.getTemperature() > max.getTemperature())
				max = record;
		}

		System.out.printf("Die niedrigste Temperatur war am %s mit %.1f Grad %s\n", min.getDay(), min.getTemperature(), min.getUnit());
		System.out.printf("Die höchste Temperatur war am %s mit %.1f Grad %s\n", max.getDay(), max.getTemperature(), max.getUnit());

	}
}

class TemperatureRecord
{
	private String day;
	private double temperature;
	private String unit;

	public String getDay()
	{
		return day;
	}

	public double getTemperature()
	{
		return temperature;
	}

	public String getUnit()
	{
		return unit;
	}

	public void setDay(String day)
	{
		this.day = day;
	}

	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}

	public void setUnit(String unit)
	{
		this.unit = unit;
	}
}
