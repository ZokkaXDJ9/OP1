package aufgaben;

/* Level 2
Erstellen Sie die Funktion 'void fibonacci(int n)'.
 * Diese Funktion ermittelt die ersten n Zahlen der Fibonacci-Zahlenfolge und gibt jeden Wert auf der Konsole aus.
 * "Die Fibonacci-Folge ist die unendliche Folge natürlicher Zahlen, die mit zweimal der Zahl 1 beginnt, und bei der jede Zahl die Summe der beiden ihr vorangehenden Zahlen ist."
 * https://de.wikipedia.org/wiki/Fibonacci-Folge
 * Beispiel: 1, 1, 2, 3, 5, 8, 13, 21, 34...
 */

public class Lösung_6
{
    public static void main(String[] args)
    {
        fibonacci(10);
    }

    public static void fibonacci(int n)
    {
        int a = 1;
        int b = 1;

        for (int i = 0; i < n; i++)
        {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
