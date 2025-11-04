package aufgaben;

/* Level 1
Erstellen Sie eine Variable 'alter' mit dem Wert 10.
Daraufhin wird die String-Variable 'alterString' mit "jung" gefüllt und beides ausgegeben.

Danach wird 'alter' der Wert 80 zugewiesen und die 'alterString' mit "alt" gefüllt und beides ausgegeben.
 */

public class Lösung_2
{
    public static void main(String[] args)
    {
        int alter = 10;
        String alterString = "jung";
        System.out.println(alter + " " + alterString);
        System.out.printf("%d %s\n", alter, alterString);

        alter = 80;
        alterString = "alt";
        System.out.println(alter + " " + alterString);

    }
}