/* Level 2

Sie sollen ein einfaches Sitzplatzreservierungssystem für ein Kino entwerfen. Die Sitzplätze werden in einem zweidimensionalen Array dargestellt, und jeder Sitzplatz ist ein Objekt der Klasse Seat.

Anforderungen:

    Klasse Seat:
        Erstellen Sie eine Klasse Seat mit den folgenden Attributen:
            int row: Die Zeile des Sitzplatzes.
            int column: Die Spalte des Sitzplatzes.
            boolean isReserved: Gibt an, ob der Sitzplatz reserviert ist oder nicht.
        Implementieren Sie einen Konstruktor, der die Zeile und Spalte initialisiert und isReserved auf false setzt.
        Implementieren Sie eine Methode reserve(), die den Sitzplatz reserviert (d.h., isReserved auf true setzt).

    Sitzplatzmatrix:
        Erstellen Sie ein zweidimensionales Array Seat[][] mit einer Größe von 5x5, um die Sitzplätze im Kino darzustellen.

    Suchalgorithmus:
        Implementieren Sie eine Methode findAndReserveFirstAvailableSeat(), die den ersten nicht reservierten Sitzplatz im Array sucht und reserviert. Geben Sie die Position des reservierten Sitzplatzes auf der Konsole aus. Falls kein Sitzplatz verfügbar ist, geben Sie eine entsprechende Nachricht aus.

    Testen:
        Reservieren Sie einige Sitzplätze manuell, um den Suchalgorithmus zu testen.
        Rufen Sie die Methode findAndReserveFirstAvailableSeat() auf und überprüfen Sie, ob der Sitzplatz korrekt reserviert wurde.

*/

package aufgaben;

import java.util.Arrays;
import java.util.Random;

public class Lösung_7
{
	private static final Random random = new Random();

	public static void main(String[] args)
	{
		Seat[][] seats = new Seat[5][5];

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				seats[i][j] = new Seat(i, j);
				int rand = random.nextInt(10);
				if (rand > 1)
					seats[i][j].reserve();
			}
		}

		printSeats(seats);

		Seat found;
		do
		{
			found = findAndReserveFirstAvailableSeat(seats);
			if (found == null)
				System.out.println("Couldn't find empty seat");

		} while (found != null);

		//seats[0][0].reserve();

		printSeats(seats);
	}

	/***
	 * Sucht den ersten freien Sitz.
	 * @param seats
	 * @return Den gefundenen Sitz, oder Null, wenn keiner gefunden werden kann.
	 */
	private static Seat findAndReserveFirstAvailableSeat(Seat[][] seats)
	{
		for (int i = 0; i < seats.length; i++)
		{
			for (int j = 0; j < seats.length; j++)
			{
				if (!seats[i][j].isReserved())
				{
					seats[i][j].reserve();
					return seats[i][j];
				}
			}
		}
		return null;
	}

	private static void printSeats(Seat[][] seats)
	{
		for (Seat[] seat : seats)
		{
			System.out.println(Arrays.toString(seat));
		}
	}
}

class Seat
{
	private int row;
	private int column;
	private boolean isReserved;

	public Seat(int row, int column)
	{
		this.row = row;
		this.column = column;
		this.isReserved = false;
	}

	public boolean isReserved()
	{
		return isReserved;
	}

	/***
	 * Reserviert den Sitz.
	 * @throws RuntimeException Wenn versucht wird, einen Sitz zu reservieren, der bereits reserviert ist.
	 */
	public void reserve() throws RuntimeException
	{
		if (!isReserved)
		{
			isReserved = true;
			System.out.printf("Reserved Seat [%d][%d]\n", row, column);
		}
		else
			throw new RuntimeException("Already reserved");
	}

	@Override
	public String toString()
	{
		return "[" + row + "]" + "[" + column + "]" + isReserved;
	}
}
