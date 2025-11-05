// Die erste Zeile Programmcode muss immer die Package-Deklaration sein.
package vorlesung; // Alle Klassen in Java gehören zu einem Package. Damit lassen sich Klassen gruppieren / in Kategorien einteilen.
// Pakete stellen die Ordnerstruktur im Dateisystem dar.

// Unser erstes Java Programm - Hallo Welt!

// Jedes noch so kleine Java Programm besteht aus einer Klasse, die eine main-Methode enthält.
public class Einführung // ← erste Klasse des Programms.- Sie beinhaltet die main-Methode. Die Klasse kann beliebig benannt werden.
{
    public static void main(String[] args) // Die Main Methode. Sie muss immer "public static void main(String[] args)" heißen.
    {
        System.out.println("Hallo Welt!");
        // Konsolenausgabe mit println() - Methode, hier wird "Hallo Welt!" ausgegeben.
        // "System" ist eine vordefinierte Klasse in Java.
        // Die Klasse System beinhaltet die Variable "out", welche ein Objekt der Klasse "PrintStream" ist.
        // Ein Objekt ist ein konkreter Gegenstand, eine Instanz einer Klasse.
        // Das Objekt "out" verfügt über die Methode (Funktion) "println()".

        // Beispiel für Klassen und Objekte:
        // Auto ist eine Klasse. Jedes Auto hat verschiedene Eigenschaften. Farbe, Kennzeichen, PS, etc. Jedes Auto kann fahren.
        // Mein Auto ist ein Objekt der Klasse Auto. Für die Eigenschaften sind konkrete Werte zugewiesen.
        // Das Fahrverhalten meines Autos kann sich von dem eines anderen Autos unterscheiden, abhängig von den Eigenschaften.

        // Anderes Beispiel:
        // "Burger" ist eine Klasse. Jedes Burger-Objekt hat Eigenschaften wie Größe, Belag, Preis, etc.
        // Ich bereite mir nun einen Burger zu. Dabei entsteht die konkrete Instanz der Klasse, ein Objekt. Die Zutaten, die Größe und das Gewicht meines Burgers sind jetzt bekannt.
        // Diese Informationen können sich aber von anderen Burgern unterscheiden.

        // Beispiel Datenbanken:
        // Die Tabelle "Person" ist die Klasse. Jeder Eintrag in der Tabelle ist ein Objekt der Klasse Person.

        // Auf diesem Konzept der Klassen und Objekte basiert die gesamte objektorientierte Programmierung.
    }
}

// Die Main Methode ist der Einstiegspunkt für jedes Java Programm. Ohne diese Methode kann kein Java Programm ausgeführt werden.
// Wenn die Anwendung gestartet wird, ist die main-Methode die erste Methode, die aufgerufen wird.
// Jedes Programm besitzt nur einen Einstiegspunkt. Hier beginnt und endet die Programmsteuerung.

// Im Gegensatz zu C wird Java nicht in Maschinencode übersetzt, sondern in Bytecode, einen Zwischencode.
// Der Just-In-Time-Compiler (JIT-Compiler) der JVM übersetzt den Bytecode zur Laufzeit in Maschinencode.
// Dadurch ist Java plattformunabhängig, da die JVM für verschiedene Betriebssysteme verfügbar ist.
// Zur Anzeige des Bytecodes:
// https://www.jetbrains.com/help/idea/decompiler.html

// Unterschied JIT und Interpreter:
// https://stackoverflow.com/questions/3718024/jit-vs-interpreters