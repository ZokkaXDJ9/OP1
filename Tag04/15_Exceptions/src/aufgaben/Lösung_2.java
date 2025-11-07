package aufgaben;

/* Level 1
    Schreiben Sie ein Programm, bei dem ein Array mittels Schleife befüllt wird und zu viele Elemente hinzugefügt werden.
    Fangen Sie den dabei auftretenden Fehler ab.
 */
public class Lösung_2
{

    public static int[] befülleArray(int anzahl, int laenge)
    {
        int[] array = new int[laenge];
        try
        {
            for (int i = 0; i < anzahl; i++)
            {
                array[i] = i + 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Die Länge des Arrays kann nicht alle Werte aufnehmen!");
            return null;
        }
        return array;
    }

    public static void main(String[] args)
    {
        int anzahlSchleifen = 6;
        int laengeArray = 5;

        int[] arrayAusgabe = befülleArray(anzahlSchleifen, laengeArray);

        try
        {
            for (int i = 0; i < arrayAusgabe.length; i++)
            {
                System.out.println(arrayAusgabe[i] + " ");
            }
        }
        catch (NullPointerException e)
        {
            System.err.println("Array wurde nicht erstellt. Keine Daten vorhanden!");
        }
    }
}
