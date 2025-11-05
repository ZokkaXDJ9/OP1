package vorlesung;


import java.util.Arrays;

class Fahrzeug  // eine Klasse
{
    static short anzahlTüren = 4; // Static → "für sich alleine lebensfähig", ohne Objektverweis. "Klassenvariable"
    String Kennzeichen = "ABC-123"; // nicht statisch, über Objekte aufrufbar


    static void ausgabe() // Parameterlose void Methode, keine Parameter oder Rückgabe
    {
        System.out.println("Alle meine Fahrzeuge haben " + anzahlTüren + " Türen.");
    }

}



@SuppressWarnings("DuplicatedCode")
public class AusgabeDatentypen // Eine Klasse
{
    static int summe(int a, int b) // statische int-Methode mit zwei int Parametern
    {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("ALLGEMEINES");

        // Fahrzeug.kennzeichen = "Mein Kennzeichen"; -> Kann nicht auf Variable zugreifen da sie nicht statisch ist.

        Fahrzeug fahrzeug = new Fahrzeug(); // Erzeugt ein neues ("new") Objekt der Klasse Fahrzeug. Das Objekt wird in der Variable "fahrzeug" abgespeichert.

        fahrzeug.Kennzeichen = "Mein Kennzeichen"; // Man kann nun auf die nicht-statischen Instanzvariablen zugreifen

        Fahrzeug.anzahlTüren = 5; // Direkter Zugriff auf die statische Variable der Klasse "Fahrzeug"

        fahrzeug.ausgabe(); // Aufruf der statischen Methode / Funktion

        // "ergebnis" ist eine lokale Variable
        // Lokale Variablen können nicht statisch sein.
        int ergebnis = summe(5, 15); // Aufruf der Methode und Übergabe von 2 Argumenten (2, 15) -> Da "summe" in der selben Klasse wie die "main" ist, muss der Name der Klasse nicht angegeben werden.

        System.out.println("Ergebnis: " + ergebnis);

        System.out.println("AUSGABE");

        int zahl1 = 10;
        int zahl2 = 20;

        System.out.println("Der Wert der Variable zahl1 lautet: " + zahl1 + " und zahl2: " + zahl2 + " <- Ausgabe durch String-Konkatenation");

        // Ausgabe mit String.format()
        // Formatierungszeichen unter https://www.baeldung.com/string-format
        String s = String.format("Der Wert der Variable zahl1 lautet: %s und zahl2: %s <- mit String.format()", zahl1, zahl2);
        System.out.println(s);

        // Variante mit printf()
        System.out.printf("Der Wert der Variable zahl1 lautet: %s und zahl2: %s <- mit printf()%n", zahl1, zahl2); // Zeilenumbruch durch %n

        // String Konkatenation ist am einfachsten, aber nicht immer die effizienteste Methode zur Ausgabe von Variablen. String.format() und printf() sind flexibler und bieten mehr Formatierungsmöglichkeiten.
        // Effizienzvergleich: Konkatenation < String.format() < printf()

        // Ausgabe mit StringBuilder
        // Strings sind immutable (unveränderlich). Jede Änderung an einem String erzeugt einen neuen String im Speicher. Bei vielen Änderungen kann dies ineffizient sein. Stattdessen sollte man bei vielen Verkettungen den StringBuilder verwenden, der veränderlich ist und Änderungen direkt am selben Objekt vornimmt.
        StringBuilder builder = new StringBuilder(); // Ein Objekt des StringBuilders erzeugen
        builder.append("Der Wert der Variable zahl1 lautet: ");
        builder.append(zahl1);
        builder.append(" und zahl2: ").append(zahl2).append(" <- mit StringBuilder"); // "Method Chaining", mehrere Aufrufe in einer Zeile
        System.out.println(builder.toString());

        System.out.println();
        System.out.println("DATENTYPEN");

        // Primitive Datentypen
        boolean bool = true; // 1 Bit
        byte b8 = 100; // 8 Bit
        short short16 = 10000; // 16 Bit
        int int32 = 100000; // 32 Bit
        long long64 = 100000L; // 64 Bit

        float float32 = 10.99f; // 32 Bit
        double double64 = 19.99; // 64 Bit

        char character = 'A'; // 16 Bit (Unicode)

        System.out.println("Boolean: " + bool + "\nByte: " + b8 + "\nShort: " + short16 + "\nInt: " + int32 + "\nLong: " + long64 + "\nFloat: " + float32 + "\nDouble: " + double64 + "\nChar: " + character);
        System.out.println();

        float f = 1.0F; // implizite Typumwandlung von double zu float nicht möglich, da double größer ist als float
        double d = 1.0f; // implizite Typumwandlung von float zu double aber möglich!

        f = (float) 1.0; // explizite Typumwandlung von double zu float

        long l = 10_000_000_000L; // Bei Zahlen größer als ~ 2 Milliarden (int-Grenze) muss ein "L" für long angehängt werden.
        long ll = (long) 100.99; // explizite Typumwandlung von double zu long, Nachkommastellen gehen verloren

        // Wann benutzt man was in der Praxis?
        // boolean: Wahrheitswerte
        // byte: Speicheroptimierung bei Arrays
        // short: Selten verwendet, manchmal bei Speicheroptimierung
        // int: Standard für Ganzzahlen
        // long: Für sehr große Ganzzahlen
        // float: Selten, manchmal für Gleitkommazahlen mit geringerer Genauigkeit, z.B. in Grafikanwendungen
        // double: Standard für Gleitkommazahlen
        // char: Für einzelne Zeichen

        System.out.println("CASTEN");
        int integer = 1234567890;
        long integerInLong = integer; // implizites Casten von int zu long
        short integerInShort = (short) integer; // explizites Casten von int zu short, Datenverlust möglich
        System.out.println("int: " + integer + "\nlong: " + integerInLong + "\nshort (mit Datenverlust): " + integerInShort);
        System.out.println();

        System.out.println("BEISPIEL WRAPPER-KLASSEN");
        // Wrapper-Klassen sind Objekt-Entsprechungen der primitiven Datentypen.
        // Existieren zu allen primitiven Datentypen.
        int int32min = Integer.MIN_VALUE;
        int int32max = Integer.MAX_VALUE;
        System.out.println("Integer Min Wert: " + int32min + "\nInteger Max Wert: " + int32max);

        System.out.println("42 als Binary: " + Integer.toBinaryString(42)); // Gibt die Binärdarstellung der Zahl 42 aus
        System.out.println("42 als Hex: " + Integer.toHexString(42)); // Gibt die Hexadezimaldarstellung der Zahl 42 aus

        Integer I32 = 42; // Autoboxing: automatisches Umwandeln von int zu Integer (Primitiver Typ zu Objekt)
        System.out.println("I32 als Integer Objekt: " + I32);

        System.out.println("STRING");
        String s1 = "Dies ist ein String."; // String-Literal
        String s1LowerCase = s1.toLowerCase();
        System.out.println(s1LowerCase);
        System.out.println("Anzahl der Zeichen: " + s1.length()); // Länge des Strings
        System.out.println("Zeichen an Index 0: " + s1.charAt(0)); // Erstes Zeichen des Strings
        String[] splitted = s1.split(" "); // String in einzelne Wörter aufteilen (Array zurück)
        System.out.println("Aufgeteilte Wörter: " + Arrays.toString(splitted)); // Array in String umwandeln und für die Ausgabe vorbereiten
    }
}