package aufgaben;

/* Level 1

Schreiben Sie ein Programm, bei dem eine Methode eine Division ausführt.
Erzwingen Sie bei Aufruf dieser eine 0 Division und fangen Sie den dazugehörigen Fehler ab.
 */

public class Lösung_0
{

    /**
     *
     * @param zahl1
     * @param zahl2
     * @return
     * @throws ArithmeticException Wird geworfen, wenn zahl2 == 0
     */
    public static double dividiereZahlen(int zahl1, int zahl2) throws ArithmeticException
    {
        if (zahl2 == 0)
        {
            throw new ArithmeticException("Teilen durch 0 nicht erlaubt");
        }
        else
        {
            double erg = (double) zahl1 / (double) zahl2;
            return erg;
        }
    }

    public static void main(String[] args)
    {
        int zahl1 = 12;
        int zahl2 = 0;

        try
        {
            double erg = dividiereZahlen(zahl1, zahl2);
            System.out.println(erg);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
