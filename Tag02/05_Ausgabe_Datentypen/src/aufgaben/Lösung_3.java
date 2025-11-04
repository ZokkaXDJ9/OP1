package aufgaben;

/* Level 2
Schreiben Sie bitte ein Java-Programm, das
a) eine Integer-Variable i einführt (deren Wert sie selbst bestimmen können)
b) eine Float-Variable f einführt (deren Wert sie selbst bestimmen können)
c) eine Char-Variable c einführt (deren Wert sie selbst bestimmen können)
d) einen String s einführt, der durch eine for-Schleife wie folgt initialisiert werden soll:
	- die Schleife soll i-mal durchlaufen werden
	- bei jedem Durchlauf soll s um c und f verlängert werden
e) eine for-Schleife startet, die 3-mal durchlaufen wird und pro Durchlauf s (mit Umbruch) ausgibt


Beispiel
i=5, f=1.1, c=x, dann ergibt sich die folgende Ausgabe:
x1.1x1.1x1.1x1.1x1.1
x1.1x1.1x1.1x1.1x1.1
x1.1x1.1x1.1x1.1x1.1
*/

public class Lösung_3
{
    public static void main(String[] args) {

        int i = 5;
        float f = 1.1f;
        char c = 'x';

        // Die Klasse StringBuilder erlaubt es uns, wie der Name sagt, Strings zu bauen.
        // Dies wird gegenüber der Konkatenation von Strings (mit dem + Operator) bevorzugt,
        // da bei vielen Verkettungen von Strings der StringBuilder performanter ist.
        StringBuilder s = new StringBuilder();

        for(int counter = 0 ; counter < i; counter++)
            s.append(c).append(f); // mit der append()-Methode können wir nun Strings verketten (so als würden wir sie mit dem + Operator verknüpfen)

        for(int counter = 0; counter < 3; counter++)
            System.out.println(s);
    }
}
