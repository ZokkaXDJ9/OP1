/* Level 2
Erstellen Sie ein Programm, welches zählt, wie viele Großbuchstaben in einer Zeichenkette vorkommen.
For-Schleifen und If-Else funktionieren hier exakt wie Sie auch schon aus C bekannt sind.
Die Länge einer Zeichenkette kann mit .length() geprüft werden.
Ob ein Zeichen ein Großbuchstabe ist, erfahren Sie über Character.isUpperCase().
 */

package aufgaben;

public class Lösung_4
{
    public static void main(String[] args)
    {
        String s = "Hallo Welt";
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
}
