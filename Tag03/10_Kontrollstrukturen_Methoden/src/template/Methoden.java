package template;

/*
    In Java spielen Methoden eine zentrale Rolle. Sie bestimmen das Verhalten von Objekten und somit auch das Verhalten des gesamten Programms.
	Methoden arbeiten in Java in der Regel mit den Daten (Variablen) von Objekten. Das unterscheidet sie von Funktionen, die man in anderen Programmiersprachen vorfinden
	kann und welche vollkommen unabhängig von einem Objekt oder einer Klasse existieren.
 */

public class Methoden
{
    // Optionale Modifier + void oder Datentyp der Rückgabe + Name der Methode + (Parameterliste) + { }
    static int addieren(int a, int b) // static = die Funktion kann ohne Objektreferenz aufgerufen werden.
    {
        return a + b;
    }

    int multiplizieren(int a, int b) // nicht statisch = die Methode kann nur über eine Objektreferenz aufgerufen werden.
    {
        return a * b;
    }

    void verarbeiteZahl(int zahl)
    {
        System.out.println("Verarbeite Zahl: " + zahl);

        if (zahl < 0) {
            System.out.println("Die Zahl ist negativ. Beende die Methode.");
            return; // Jede Methode / Funktion kann durch eine Return-Anweisung beendet werden, auch wenn sie nichts zurückgibt.
        }

        // Weitere Verarbeitung, falls die Zahl nicht negativ ist
        System.out.println("Die Zahl ist positiv oder null. Weiterverarbeitung.");
    }

    // Methodenüberladung:
    // Die Methodenüberladung bedeutet, dass ich mehrere Methoden oder Funktionen mit identischem Bezeichner habe, aber unterschiedlichen Parameterlisten.
    // Das heißt, die Typen und die Anzahl der Parameter sind unterschiedlich.
    void ausgabe()
    {
        System.out.println("Ich gebe etwas aus.");
    }

    void ausgabe(int zahl)
    {
        System.out.println("Ich gebe die Zahl " + zahl + " aus.");
    }

    void ausgabe(int a, int b)
    {
        System.out.println("Ich addiere zwei Zahlen. Das Ergebnis ist " + (a + b));
    }

    void ausgabe(String s)
    {
        System.out.println("Ich gebe " + s + " aus.");
    }


    public static void main(String[] args)
    {
        int ergebnis = addieren(12, 15); // In derselben Klasse kann ich andere statische Funktionen einfach so aufrufen.
        System.out.println("Ergebnis der Addition: " + ergebnis);

        Methoden objektReferenz = new Methoden(); // Wir erzeugen ein Objekt der Klasse. Den Vorgang nennen wir Instanziierung. Das Ergebnis ist eine Objektreferenz.
        ergebnis = objektReferenz.multiplizieren(4, 5); // Da 'multiplizieren' nicht statisch ist, können wir nur über einen Objekt-Verweis darauf zugreifen.
        System.out.println(ergebnis);

        objektReferenz.verarbeiteZahl(-5);

        // Mehrere Methoden tragen denselben Namen, empfangen aber verschiedene Argumente und sind in ihrem Verhalten unterschiedlich.
        objektReferenz.ausgabe();
        objektReferenz.ausgabe(42); // Je nach Übergabe wählt der Compiler die richtige Methodenüberladung aus.
        objektReferenz.ausgabe(10, 32);
        objektReferenz.ausgabe("Hallo Welt!");
    }
}
