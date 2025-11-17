package vorlesung;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/* Die Säulen der Objektorientierung in Java sind:
 * 1. Kapselung (Encapsulation)
 * 2. Vererbung (Inheritance)
 * 3. Polymorphie (Polymorphism)
 * 4. Abstraktion (Abstraction)
 *
 * Kapselung (Encapsulation):
 * Kapselung bezieht sich auf das Konzept, Daten (Attribute) und Methoden, die auf diese Daten zugreifen, in einer Klasse zu bündeln.
 * Dadurch wird der Zugriff auf die Daten kontrolliert und geschützt. Dies fördert die Modularität und Wartbarkeit des Codes.
 * In Java wird dies durch Zugriffsmodifikatoren wie private, protected und public erreicht.
 *
 * Vererbung (Inheritance):
 * Vererbung ermöglicht es einer Klasse (Unterklasse), Eigenschaften und Methoden einer anderen Klasse (Oberklasse) zu erben.
 * Dies fördert die Wiederverwendbarkeit von Code und ermöglicht die Erstellung von Hierarchien.
 * In Java wird Vererbung durch das Schlüsselwort "extends" implementiert.
 *
 * Polymorphie (Polymorphism):
 * Polymorphie ermöglicht es, dass eine Methode oder ein Objekt in verschiedenen Formen auftreten kann.
 * Dies bedeutet, dass eine Methode in einer Unterklasse eine andere Implementierung haben kann als in der Oberklasse.
 * In Java wird Polymorphie durch Methodenüberschreibung (method overriding) und Methodenüberladung (method overloading) erreicht.
 *
 * Abstraktion (Abstraction):
 * Abstraktion bezieht sich auf das Konzept, komplexe Systeme zu vereinfachen, indem nur die wesentlichen Merkmale hervorgehoben werden.
 * In Java wird Abstraktion durch abstrakte Klassen und Schnittstellen (Interfaces) implementiert.
 * Abstrakte Klassen können nicht instanziiert werden und können abstrakte Methoden enthalten, die von Unterklassen implementiert werden müssen.
 * Schnittstellen definieren einen Vertrag, den implementierende Klassen erfüllen müssen.
 */


/* Wenn eine Klasse keine Sichtbarkeitsmodifikatoren (public, private, protected) hat, ist sie "package-private" und nur innerhalb desselben Pakets zugänglich.
 * Tabelle der Sichtbarkeitsmodifikatoren:
 * Modifikator     | Sichtbarkeit
 * -------------------------------------------------------
 * public         | Überall zugänglich
 * protected      | Innerhalb desselben Pakets und in Unterklassen
 * package-private| Nur innerhalb desselben Pakets (kein Modifikator angegeben)
 * private        | Nur innerhalb der eigenen Klasse
 */



class Person {
    // Der Begriff "Member" umfasst sowohl Attribute (Variablen) als auch Methoden (Funktionen) einer Klasse.
    // Statisches Attribut, das für alle Instanzen der Klasse gleich ist.
    // Es gehört zur Klasse selbst und nicht zu einer bestimmten Instanz (objektübergreifend).
    public static ArrayList <Person> personen = new ArrayList<>(); // public: überall zugänglich, static: gehört zur Klasse, ArrayList<Person>: Liste von Person-Objekten

    // Instanzattribute, die für jede Instanz (Objekt) der Klasse unterschiedlich sein können.
    // Abkapselung: Die Attribute sind private und können nur über Getter- und Setter-Methoden von außen zugegriffen werden. (Geheimnisprinzip)
    private int id;
    private String name;
    private LocalDate geburtsdatum; // LocalDate ist eine Klasse aus dem Paket java.time zur Darstellung von Datumsangaben ohne Zeitangabe.

    // Getter und Setter Methoden für die Attribute. Diese ermöglichen den Zugriff von anderen Klassen auf die privaten Attribute.
    // Getter: Methode zum Abrufen des Werts eines Attributs.
    // Setter: Methode zum Setzen des Werts eines Attributs.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; // "this" verweist auf die aktuelle Instanz der Klasse. (self in Python)
    }

    // Bemerkungen zur Get-Methode:
    // 1) Sie sollte public sein, damit sie von außen aufgerufen werden kann.
    // 2) Der Rückgabewert (return type) sollte dem Datentyp des Attributs entsprechen.
    public String getName() {
        return name;
    }

    // Bemerkungen zur Set-Methode:
    // 1) Sie sollte public sein, damit sie von außen aufgerufen werden kann.
    // 2) Der Rückgabewert ist void, da sie keinen Wert zurückgibt.
    // 3) Sie nimmt einen Parameter entgegen, der den neuen Wert für das Attribut darstellt.
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    // Wir können auch Methoden definieren, die auf den Attributen basieren, wie z.B. eine Methode zur Berechnung des Alters.
    // Es müssen nicht immer nur Attribute als Getter/Setter definiert werden.
    public int getAlter() {
        // Berechnet das Alter der Person basierend auf dem Geburtsdatum und dem aktuellen Datum.
        return Period.between(geburtsdatum, LocalDate.now()).getYears();
    }

    public boolean isVolljaehrig() { // "is" wird oft für boolesche Methoden statt "get" verwendet.
        // Überprüft, ob die Person volljährig ist (Alter >= 18).
        return getAlter() >= 18; // Wir können hier auch andere Methoden der Klasse verwenden.
    }

    public void ausgabe(){ // Methode benötigt keine Übergabewerte, da sie mit Attributen arbeitet, die dem Objekt schon bekannt sind.
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Geburtsdatum: " + geburtsdatum);
        System.out.println("Alter: " + getAlter());
        System.out.println("Volljährig: " + (isVolljaehrig() ? "Ja" : "Nein")); // Ternärer Operator zur Ausgabe von Ja/Nein
    }

    /* Konstruktor: Wird aufgerufen, wenn ein neues Objekt der Klasse erstellt wird. (Mehr dazu später, in Tag 11, nimm es erst mal so hin.)
     * public Person(int id, String name, LocalDate geburtsdatum) {
     *   this.id = id; // Weist den Wert des Parameters id dem Attribut id der Instanz zu.
     *   this.name = name; // Weist den Wert des Parameters name dem Attribut name der Instanz zu.
     *   this.geburtsdatum = geburtsdatum; // Weist den Wert des Parameters geburtsdatum dem Attribut geburtsdatum der Instanz zu.
     *   personen.add(this); // Fügt die aktuelle Instanz (this) der statischen Liste personen hinzu.
     * }
    */
}

public class Klassen {

    public static void main(String[] args) {
        // Deklaration und Instanziierung eines Objekts der Klasse Person.
        Person p1;
        p1 = new Person(); // new erstellt ein neues Objekt der Klasse Person und ruft den Standardkonstruktor auf.
        p1.setId(1); // Setzen der Attribute über die Setter-Methoden.
        p1.setName("Alice");
        p1.setGeburtsdatum(LocalDate.of(2000, 5, 15)); // Setzen des Geburtsdatums auf den 15. Mai 2000.
        p1.ausgabe(); // Ausgabe der Informationen der Person.

        System.out.println();

        Person p2 = new Person();
        p2.setId(2);
        p2.setName("Bob");
        p2.setGeburtsdatum(LocalDate.of(2010, 8, 20));
        p2.ausgabe();

        // Beide Personen zur statischen Liste hinzufügen.
        Person.personen.add(p1); // Auf statische Member der Klasse Person zugreifen über den Klassennamen, nicht über eine Instanz.
        Person.personen.add(p2);

        System.out.println();
        System.out.println("Alle Personen in der Liste:");
        // Iteration über die statische Liste personen und Ausgabe der Informationen jeder Person.
        for (Person p : Person.personen) {
            p.ausgabe();
            System.out.println();
        }
    }
}
