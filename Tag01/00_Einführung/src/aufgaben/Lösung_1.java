package aufgaben;

/* Level 1
Zu Beginn des Programmes wird der Variable a der Wert 1 zugewiesen. Direkt im Anschluss wird dieser Wert ausgegeben. Daraufhin wird der Wert von a um 1 erhöht und erneut ausgegeben. Erneut wird a um 1 erhöht und sein Wert anschließend ausgegeben … dies wiederholt sich bis a den Wert 5 hat. Dann endet das Programm.
 */

public class Lösung_1
{
    public static void main(String[] args)
    {
        int a = 1;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
        // usw...

        // oder:
        for (int b = 1; b < 6; b++)
        {
            System.out.println(b);
        }
    }
}
