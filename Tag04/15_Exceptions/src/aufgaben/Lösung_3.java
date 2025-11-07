package aufgaben;

/* Level 3
    Schauen Sie sich, um diese Aufgabe zu lösen, das Thema DatumsFormat aus den Codebeispielen an.
    Alternativ recherchieren Sie online.

    Führen Sie bitte zunächst die folgende Methode ein:
    Methodenname: tryStringToDate
    Übergabewerte: String s
    Funktion: - Versucht s in LocalDate zu konvertieren
              - Fängt bei DateTimeParseException die Fehlermeldung ab

    Rückgabewert: das LocalDate Objekt, FALLS Konvertierung klappte, sonst null

    Testen Sie diese Funktion.

    Hinweis: "LocalDate" ist ein Datentyp wie Integer oder String und kann als solches auch für Variablen verwendet werden. Und wie bei Integer gibt es für LocalDate auch Funktionen, die aufgerufen werden können.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Lösung_3
{
    static LocalDate tryStringToDate(String s)
    {
        LocalDate d;
        try
        {
            DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            d = LocalDate.parse(s,fm);
        }
        catch (DateTimeParseException e)
        {
            return null;
        }

        return d;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String datumText;
        LocalDate datum;

        System.out.print("Geben Sie bitte ein Datum im -> dd.MM.yyyy <- ein: ");
        datumText = scanner.nextLine();

        datum = tryStringToDate(datumText);

        if (datum != null)
        {
            System.out.print("Konvertierung klappte (\"offiziell\"), Inhalt von datum: ");
            System.out.printf("%02d.%02d.%d", datum.getDayOfMonth(), datum.getMonthValue(), datum.getYear());
        }
        else
            System.out.print("Konvertierung klappte nicht");
    }
}
