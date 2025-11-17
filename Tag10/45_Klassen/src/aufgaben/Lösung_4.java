package aufgaben;

/* Level 2
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - die Klasse 'Schachfeld' definiert wird,
   + die Klasse besitzt zwei private Methoden (linie() und reihe()) und eine public Methode (getZufallsfeld())
     - keine der Methoden hat Übergabewerte
     - linie() liefert als Rückgabewert einen Buchstaben zwischen A und H (als String)
     - reihe() liefert als Rückgabewert eine Ziffer zwischen 1 und 8 (als String)
     - getZufallsfeld() liefert als Rückgabewert die Konkatenation der Rückgabewerte aus linie() und reihe()
 - im Main ein Objekt "feld" vom Typ Schachfeld instanziiert wird
   + zur Kontrolle wird der Rückgabewert feld.getZufallsfeld() auf der Konsole ausgegeben
*/

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

public class Lösung_4
{
    public static void main(String[] args)
    {
        Schachfeld feld = new Schachfeld();

        int[][][] felder = new int[8][8][1];
        TreeMap<String, Integer> felderMap = new TreeMap<>();

        for (int i = 0; i < 100; i++)
        {
            String zufallsFeld = feld.getZufallsfeld();
            System.out.println("Das Zufallsfeld lautet: " + zufallsFeld);

            // Aus Spaß wollen wir jetzt noch wissen, wie oft welches Feld ermittelt wurde.
            // Das ist nicht Teil der Übungsaufgabe.
            // Mit Array
            int buchstabe = zufallsFeld.codePointAt(0) - 65;
            int zahl = zufallsFeld.codePointAt(1) - 49;
            //System.out.println(buchstabe + " " + zahl);
            felder[buchstabe][zahl][0]++;

            // Mit TreeMap
            if (!felderMap.containsKey(zufallsFeld))
                felderMap.put(zufallsFeld, 1);
            else
                felderMap.put(zufallsFeld, felderMap.get(zufallsFeld) + 1);
        }

        // Mit Array
        for (int i = 0; i < felder.length; i++)
        {
            for (int j = 0; j < felder[i].length; j++)
                System.out.printf("%c%c %d%n", i + 65, j + 49, felder[i][j][0]);
        }

        // Mit TreeMap
        System.out.println();
        for (String k : felderMap.keySet())
            System.out.printf("%s %d%n", k, felderMap.get(k));

    }
}

class Schachfeld
{
    private final Random random = new Random();

    private String linie()
    {
        int min = 65; // A
        int max = 72; // H
        char c = (char) (random.nextInt(max - min + 1) + min); // Zufallswert zwischen 65 und inklusive 72

        return String.valueOf(c);
    }

    private String reihe()
    {
        int min = 49; // 1
        int max = 56; // 8
        char c = (char) (random.nextInt(max - min + 1) + min); // Zufallswert zwischen 49 und inklusive 56

        return String.valueOf(c);
    }

    public String getZufallsfeld()
    {
        return linie() + reihe();
    }
}




