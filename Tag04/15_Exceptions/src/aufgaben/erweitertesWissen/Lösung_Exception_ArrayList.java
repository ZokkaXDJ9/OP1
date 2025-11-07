package aufgaben.erweitertesWissen;

/*
    Schreiben Sie bitte zunächst die folgenden Methoden:
    a) Funktionsname: schreibe
       Übergabewerte: Integerliste l
       Funktion:      Konsolenausgabe aller Elemente von l
       Rückgabewert:  Keiner
    b) Funktionsname: tryRemoveAt
       Übergabewerte: Integer-Liste l, Integer i
       Funktion:      Versucht in l das Element mit Index i zu löschen
                      FALLS dieser Index existiert, wird das Element gelöscht und eine boolesche Variable b auf 'true' gesetzt
                      SONST wird kein Element gelöscht und b auf 'false' gesetzt
       Rückgabewert:  b
    c) Funktionsname: tryRemoveFromXtoY
       Übergabewerte: Integer-Liste l, Integer x, Integer y
       Funktion:      - FALLS x>y werden die Werte von x und y getauscht
                        SONST bleiben x und y unverändert
                      - Versucht in l alle Elemente mit Index x bis y (beiderseits einschließlich) zu löschen
                        FALLS alle diese Indices existieren, werden die entsprechenden Elemente gelöscht und eine boolesche Variable b auf 'true' gesetzt
                        SONST wird kein Element gelöscht und b auf 'false' gesetzt
       Rückgabewert:  b

    Testen Sie obige Funktionen bitte mithilfe des folgenden Programms:
    - Es wird eine Integerliste eingeführt und mit den Werten von 0 bis 9 gefüllt
    - Es startet eine Schleife, in der pro Durchlauf ...
      + der bisherige Inhalt der Integerliste auf der Konsole ausgegeben wird
      + vom User eine ganze Zahl x abgefragt wird
      + die Schleife wiederholt wird  FALLS die Usereingabe keine ganze Zahl ODER das Element an der Stelle x nicht gelöscht werden kann
      + Dann über tryRemoveAt die Zahl an Stelle x löschen
    - Nach der Schleife der neue Inhalt der Integerliste auf der Konsole ausgegeben wird
    - anschließend eine neue Integerliste2 eingeführt wird, die ebenfalls mit den Werten von 0 bis 9 gefüllt wird
    - der aktuelle Inhalt von Integerliste2 auf der Konsole ausgegeben wird
    - daraufhin eine Schleife startet, in der pro Durchlauf ...
      + zwei ganze Zahlen abgefragt werden
      + die Schleife wiederholt wird, FALLS nicht beide Eingaben ganze Zahlen sind, oder nicht beide Zahlen zulässige Indices in Integerliste2 (Mit Hilfe von tryRemoveFromXtoY)
    - Nach der Schleife wird der neue Inhalt der Integerliste2 auf der Konsole ausgegeben und das programm endet

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lösung_Exception_ArrayList
{
    static void schreibe(List<Integer> l)
    {
        for (int e : l)
        {
            System.out.print(e + " ");
        }
    }

    static boolean tryRemoveAt(List<Integer> l, int index)
    {
        try
        {
            l.remove(index);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    static boolean tryRemoveFromXtoY(List<Integer> l, int x, int y)
    {
        if (x > y)
        {
            int hilfsvariable = x;
            x = y;
            y = hilfsvariable;
        }

        if (x >= l.size()|| y >= l.size() || x < 0 || y < 0)
            return false;

        for (int i = x; i <= y; i++)
        {
            tryRemoveAt(l, x);
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int eingabezahl = 0;
        List<Integer> integerListe = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> integerListe2 = new ArrayList<Integer>(integerListe);

        boolean parseOk = false;

        do
        {
            System.out.println("\nOriginalzustand der Liste:");
            schreibe(integerListe);
            System.out.print("\nGeben Sie bitte eine ganze Zahl ein: ");

            try
            {
                eingabezahl = Integer.parseInt(scanner.nextLine());
                parseOk = true;
            }
            catch (NumberFormatException e)
            {
                parseOk = false;
            }
        }
        while (!parseOk || !tryRemoveAt(integerListe, eingabezahl));


        System.out.println("Listeninhalt nach Löschung des " + eingabezahl + ". Elements:");
        schreibe(integerListe);

        int x = 0, y = 0;

        do
        {
            System.out.println("\nOriginalzustand der Liste:");
            schreibe(integerListe2);
            System.out.println("\nGeben Sie bitte zwei ganze Zahlen ein: ");

            try
            {
                System.out.print("Zahl 1: ");
                x = Integer.parseInt(scanner.nextLine());
                System.out.print("Zahl 2: ");
                y = Integer.parseInt(scanner.nextLine());
                parseOk = true;
            }
            catch (NumberFormatException e)
            {
                parseOk = false;
            }

        }
        while (!parseOk || !tryRemoveFromXtoY(integerListe2, x, y));

        System.out.println("Listeninhalt nach Löschung aller Elemente von " + x + " bis " + y + ":");
        schreibe(integerListe2);

    }
}
