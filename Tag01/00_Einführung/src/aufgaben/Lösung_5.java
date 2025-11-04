package aufgaben;

/* Level 2
Zu Beginn des Programmes wird der Variable kapital der Wert 100, der Variable jahr der Wert 1 und der Variable prozent der Wert 3 zugewiesen.
Es folgt die Ausgabe:
	Startkapital beträgt kapital Euro

Anschließend wird das Kapital um den angegebenen Prozentsatz erhöht und folgendes ausgegeben:
	Kapital nach jahr Jahr(en): kapital

Im Anschluss wird erneut das Kapital um den abgespeicherten Prozentsatz erhöht, die Variable jahr um 1 erhöht und daraufhin ausgegeben:
	Kapital nach jahr Jahr(en): kapital

Dies wird fortgesetzt bis zum 5. Jahr, dann endet das Programm.

 */

import java.text.NumberFormat;

public class Lösung_5
{
    public static void main(String[] args)
    {
        double kapital = 100;
        int jahr = 1;
        int prozent = 3;

        // Mit NumberFormat können Zahlen automatisch als Währung formatiert werden:
        /*NumberFormat format = NumberFormat.getCurrencyInstance();
        String kapitalString = format.format(kapital);
        System.out.println("Startkapital beträgt " + kapitalString);*/

        System.out.println("Startkapital beträgt " + kapital + " Euro.");

        for (; jahr < 6; jahr++)
        {
            kapital = kapital + (kapital * prozent / 100);
            //kapitalString = format.format(kapital);
            //System.out.printf("Kapital nach %d Jahr(en): %s\n", jahr, kapitalString);

            System.out.printf("Kapital nach %d Jahr(en): %.2f\n", jahr, kapital);
        }

    }
}
