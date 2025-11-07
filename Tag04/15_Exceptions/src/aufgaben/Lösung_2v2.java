package aufgaben;

/* Level 1
    Schreiben Sie ein Programm, bei dem ein Array mittels Schleife befüllt wird und zu viele Elemente hinzugefügt werden.
    Fangen Sie den dabei auftretenden Fehler ab.
 */
public class Lösung_2v2
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
            System.err.println("Es konnten nicht alle Werte in dem erstellten Array aufgenommen werden !");
            System.err.println("Arraygröße : " + laenge + "\nAnzahlwerte: " + anzahl);

        }
        return array;
    }

    public static void main(String[] args)
    {

        int anzahlSchleifen = 6;
        int laengeArray = 5;

        int[] arrayAusgabe = befülleArray(anzahlSchleifen, laengeArray);

        for (int j : arrayAusgabe)
        {
            System.out.println(j + " ");
        }

    }
}
