package aufgaben;

/*  Level 1

    Schreiben Sie eine statische Funktion, die die Quersumme einer Zahl berechnet.
    Übergabewert (Parameter): int zahl
    Rückgabewert: die berechnete Quersumme.
    Ist die übergebene Zahl negativ, soll eine IllegalArgumentException ausgelöst werden.
    Im Main rufen Sie die Methode innerhalb einer passenden Try-Catch-Anweisung auf.
    Der Catch-Teil soll dabei eine passende Fehlermeldung ausgeben.
    Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
 */

public class Lösung_1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(quersumme(1259));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Berechnet die Quersumme einer positiven Zahl
     * @param zahl Wert größer 0
     * @return Quersumme
     * @throws IllegalArgumentException Wenn zahl negativ
     */
    static int quersumme(int zahl) throws IllegalArgumentException
    {
        if (zahl < 0)
            throw new IllegalArgumentException("Zahl darf nicht negativ sein!");

        if (zahl == 0)
            return 0;

        return zahl % 10 + quersumme(zahl / 10); // Rekursion
    }
}
