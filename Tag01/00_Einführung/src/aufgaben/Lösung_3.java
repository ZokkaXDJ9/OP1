package aufgaben;

/* Level 1
Schreiben Sie ein Programm, das 6 unterschiedliche ganze Zahlen zwischen 0 und 99 abspeichert. (Diese Zahlen dürfen von Ihnen beliebig gewählt werden).
Um die folgende Ausgabe besser beschreiben zu können, nehmen wir an, dass z.B. die folgenden Zahlen gewählt wurden: (3 / 11 / 15 / 17 / 33 / 42) dann soll entsprechend dieser Auswahl der folgende 6-zeilige Text ausgegeben werden
1.Zahl: 3
2.Zahl: 11
3.Zahl: 15
4.Zahl: 17
5.Zahl: 33
6.Zahl: 42
Das Programm endet anschließend.

 */

import java.util.Random;

public class Lösung_3
{
    public static void main(String[] args)
    {
        int i1 = 3, i2 = 11, i3 = 15, i4 = 17, i5 = 33, i6 = 42;
        System.out.println("1.Zahl: " + i1);
        System.out.println("2.Zahl: " + i2);
        System.out.println("3.Zahl: " + i3);
        System.out.println("4.Zahl: " + i4);
        System.out.println("5.Zahl: " + i5);
        System.out.println("6.Zahl: " + i6);

        System.out.println();

        // oder...
        //int[] zahlen = {3,11,15,17,33,42};

        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++)
            arr[i] = random.nextInt(100);

        for (int i = 0; i < 6; i++)
            System.out.println((i + 1) + ".Zahl: " + arr[i]);

    }
}