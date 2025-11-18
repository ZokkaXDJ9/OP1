package template;

import java.util.LinkedList;

// Weiteres Beispiel zur Konstruktor-Verkettung und der Verwendung von 'this'
public class Kurs
{
    // Diese Liste soll alle erzeugten Kurse speichern.
    public static final LinkedList<Kurs> kursListe = new LinkedList<>();

    private String kursbezeichnung;

    public String getKursbezeichnung()
    {
        return kursbezeichnung;
    }

    public void setKursbezeichnung(String kursbezeichnung)
    {
        this.kursbezeichnung = kursbezeichnung;
    }

    // Zwei Konstruktoren: Einer, wenn noch keine Bezeichnung bekannt ist und einer wenn doch. Beide Konstruktoren sollen die Bezeichnung zuweisen UND das Objekt der Liste hinzufügen.
    public Kurs()
    {
        this("Keine Bezeichnung"); // Konstruktor-Verkettung mit 'this()' -> Dies ist ein Methodenaufruf, genau genommen wird hier der zweite Konstruktor aufgerufen.
        System.out.println("Aufruf des parameterlosen Konstruktors.");

        // Da der andere Konstruktor bereits eine Initialisierung der Attribute vornimmt, kann man sich das hier sparen!
        //this.kursbezeichnung = "Keine Bezeichnung";
        //kursListe.add(this);
    }

    public Kurs(String kursbezeichnung)
    {
        System.out.println("Aufruf des Konstruktors mit Parameter.");
        this.kursbezeichnung = kursbezeichnung;
        kursListe.add(this); // 'this' verweist (enthält die Adresse) auf das Objekt, welches in der Main mit 'new Kurs()' erzeugt wird.
    }
}
