package template;

public class Konstruktoren
{
    public static void main(String[] args)
    {
        System.out.println("Klasse Auto:");
        // Instanziieren eines Objektes vom Typ Auto mithilfe des Standard-Konstruktors "Auto()".
        Auto auto = new Auto(); // <- das ist der Konstruktor.
        auto.setAnzahlTüren(4);
        System.out.println("Anzahl der Türen des Autos 'auto': " + auto.getAnzahlTüren());


        // Instanziieren eines Objektes vom Typ Computer mithilfe eines von mehreren Konstruktoren (mit unterschiedlichen Parameterlisten)
        // Hinweis: Wir erleben hier einen Einblick in die Polymorphie (hier: mehrere gleichname Methoden, die sich durch ihre Parameterlisten und Funktionalitäten unterscheiden)
        System.out.println();
        System.out.println("Klasse Computer:");

        // Instanziieren eines Objektes vom Typ Computer mithilfe des eigenen Konstruktors:
        // Nur 1 Integer-Übergabewert
        Computer c1 = new Computer(1000);
        // Es gibt nur einen Konstruktor mit genau einem int als Parameter -> Compiler weiß, welcher Konstruktor aufgerufen werden muss.
        // Hinweis: Dieser Konstruktor belegt nur den Wert für 'speicherplatz', aber nicht für 'besitzer'. Dieser müsste nun nachträglich mit dem Setter belegt werden.
        c1.setBesitzer("Thomas");
        System.out.println("Kontrollausgabe von c1: " + c1.getSpeicherplatz() + " - " + c1.getBesitzer());

        // Aufruf des Konstruktors mit 1 Integer und 1 String in genau dieser Reihenfolge:
        Computer c3 = new Computer(1000, "Nadira");
        System.out.println("Kontrollausgabe von c3: " + c3.getSpeicherplatz() + " - " + c3.getBesitzer());

        // 1 String und 1 Integer in genau dieser Reihenfolge:
        Computer c4 = new Computer("Takoda", 2000);
        System.out.println("Kontrollausgabe von c4: " + c4.getSpeicherplatz() + " - " + c4.getBesitzer());

        // ACHTUNG: Mit dem ersten selbst eingeführten Konstruktor wird der Standard-Konstruktor nicht mehr zur Verfügung gestellt:
        //Computer c5 = new Computer(); // Fehlermeldung: Einen Konstruktor mit 0 Parametern für Computer gibt es nicht (mehr).
        // Möchte ich trotzdem einen parameterlosen Konstruktor, muss ich ihn nun selbst erstellen.

        System.out.println();
        System.out.println("Klasse Kurs:");
        // Objekt vom Typ Kurs erzeugen und der Liste hinzufügen:
        Kurs k = new Kurs(); // 'new Kurs()' ruft den parameterlosen Konstruktor auf!
        // Das Objekt wird im Konstruktor der Liste hinzugefügt.

        // Objekt vom Typ Kurs erzeugen, die Bezeichnung festlegen und den Kurs der Liste hinzufügen:
        new Kurs("Neuer Kurs");

        System.out.println("Ausgabe aller Kurs-Objekte in der Liste:");
        for (Kurs kurs : Kurs.kursListe)
            System.out.println(kurs.getKursbezeichnung());

        // Den Kurs aus der Liste abfragen und ausgeben:
        Kurs k2 = Kurs.kursListe.get(1);
        System.out.println(k2.getKursbezeichnung());

    }
}
