package vorlesung;

public class Methoden
{
    // Optionale Modifier + void oder Datentyp der Rückgabe + Name der Methode + (Parameterliste) + { }
    static int addieren(int a, int b)
    {
        return a + b;
    }

    int multiplizieren(int a, int b) // nicht statisch = die Methode kann nur über eine Objektreferenz aufgerufen werden.
    {
        return a * b;
    }

    void verarbeiteZahl(int zahl)
    {
        System.out.println("Verarbeite Zahl: " + zahl); // Wir nehmen an, hier passiert etwas Komplexes.

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
        System.out.println("Ich gebe \"" + s + "\" aus.");
    }

    static void main(String[] args)
    {
        int ergebnis = addieren(12, 15); // In derselben Klasse kann ich andere statische Funktionen einfach so aufrufen.
        System.out.println("Ergebnis der Addition: " + ergebnis);
        Methoden objektReferenz = new Methoden(); // Wir erzeugen ein Objekt der Klasse. Den Vorgang nennen wir Instanziierung. Das Ergebnis ist eine Objektreferenz.
        ergebnis = objektReferenz.multiplizieren(4, 5); // Da 'multiplizieren' nicht statisch ist, können wir nur über einen Objekt-Verweis darauf zugreifen.
        System.out.println(ergebnis);

        Kunde k1 = new Kunde();
        k1.nameÄndern("Max Mustermann");
        System.out.println("Kundenname: " + k1.name);

        Kunde k2 = new Kunde();
        k2.nameÄndern("Erika Musterfrau");
        System.out.println("Kundenname: " + k2.name);

        objektReferenz.verarbeiteZahl(5);
        objektReferenz.verarbeiteZahl(-3);

        objektReferenz.ausgabe();
        objektReferenz.ausgabe(42);
        objektReferenz.ausgabe(10, 32);
        objektReferenz.ausgabe("Hallo Welt");
    }
}

class Kunde {
    static Kunde[] alleKunden = new Kunde[100];
    String name;
    // Static vs nicht-static:
    // Static = bleibt für alle Objekte der Klasse gleich
    // Nicht-static = individuell pro Objekt der Klasse

    void nameÄndern(String neuerName) {
        name = neuerName;
    }
}