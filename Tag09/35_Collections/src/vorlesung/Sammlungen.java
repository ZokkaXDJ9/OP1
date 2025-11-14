package vorlesung;

import java.util.*;

public class Sammlungen
{
    static void main(String[] args) {
        // Sammlungen (Collections) sind Datenstrukturen, die mehrere Werte speichern können.
        // In Java gibt es verschiedene Arten von Sammlungen, wie Listen (Lists), Mengen (Sets) und Abbildungen (Maps).
        // Diese werden in der Regel über die Java Collections Framework (JCF) bereitgestellt.

        // Arraylist:
        /* Eine ArrayList ist eine dynamische Liste, die Elemente in einer bestimmten Reihenfolge speichert und den Zugriff auf Elemente über ihren Index ermöglicht.
         * Im Gegensatz zu Arrays können ArrayLists in ihrer Größe verändert werden (dynamisch wachsen und schrumpfen).
         * ArrayLists sind Teil des Java Collections Framework und bieten viele nützliche Methoden zum Hinzufügen, Entfernen und Verwalten von Elementen.
         */

        System.out.println("ARRAYLIST");
        ArrayList<String> namen = new ArrayList<>(); // Erstellen einer ArrayList für Strings. In den spitzen Klammern wird der Datentyp der Elemente angegeben.
        namen.add("Alice"); // Hinzufügen von Elementen zur Liste.
        namen.add("Bob");
        namen.add("Charlie");
        System.out.println("Namen in der Liste: " + namen);

        System.out.println("Zugriff auf Elemente:");
        String ersterName = namen.get(0); // Zugriff auf das erste Element (Index 0).
        System.out.println("Erster Name: " + ersterName);

        // Größe der Liste abfragen
        System.out.println("Größe der Liste: " + namen.size());

        // Ersetzen eines Elements
        namen.set(1, "Bobby"); // Ersetzen des Elements am Index 1
        System.out.println("Namen nach dem Ersetzen: " + namen);

        // Entfernen eines Elements
        namen.remove("Charlie"); // Entfernen des Elements "Charlie"
        System.out.println("Namen nach dem Entfernen: " + namen);

        // Iteration über die Liste
        System.out.println("Iterieren über die Liste:");
        for (String name : namen) {
            System.out.println(name);
        }

        // Weitere Sammlungen wie Sets und Maps können ähnlich verwendet werden.

        // Collections Klasse:
        /* Die Collections-Klasse in Java bietet statische Methoden zum Arbeiten mit Sammlungen.
         * Sie enthält Methoden zum Sortieren, Suchen, Mischen und mehr.
         */
        System.out.println("COLLECTIONS KLASSE");
        Collections.sort(namen); // Sortieren der Liste
        System.out.println("Sortierte Namen: " + namen);

        // Mischen der Liste
        Collections.shuffle(namen);
        System.out.println("Gemischte Namen: " + namen);

        /* Weitere nützliche Methoden der Collections-Klasse:
         * - reverse(List<?> list): Kehrt die Reihenfolge der Elemente in der Liste um.
         * - min(Collection<? extends T> coll): Gibt das kleinste Element in der Sammlung zurück.
         * - max(Collection<? extends T> coll): Gibt das größte Element in der Sammlung zurück.
         * - frequency(Collection<?> c, Object o): Zählt, wie oft ein bestimmtes Element in der Sammlung vorkommt.
         * - addAll(Collection<? super T> dest, Collection<? extends T> src): Fügt alle Elemente aus der Quellsammlung zur Zielsammlung hinzu.
         * - binarySearch(List<? extends Comparable<? super T>> list, T key): Führt eine binäre Suche in der sortierten Liste durch.
         * - swap(List<?> list, int i, int j): Vertauscht die Elemente an den angegebenen Indizes in der Liste.
         * - fill(List<? super T> list, T obj): Füllt die Liste mit dem angegebenen Objekt.
         * - ...
         */

        // Hinzufügen mehrerer Elemente
        Collections.addAll(namen, "Diana", "Eve");
        System.out.println("Namen nach addAll: " + namen);

        // Mengen (Sets) und Verzeichnisse (Maps)
        System.out.println("SETS UND MAPS");
        // Mengen: HashSet und TreeSet
        // Mengen sind Sammlungen, die keine doppelten Elemente zulassen.
        System.out.println("HASHSET");
        Set<String> autoSet = new HashSet<>();
        autoSet.add("BMW");
        autoSet.add("Audi");
        autoSet.add("Ford");
        autoSet.add("BMW"); // Doppelte Einträge werden ignoriert
        System.out.println("Auto Set: " + autoSet);
        System.out.println(autoSet.add("Hyundai")); // true
        System.out.println(autoSet.add("Hyundai")); // false weitere Hinzufügung von Hyundai wird ignoriert

        System.out.println(autoSet.size()); // Gibt die Anzahl der eindeutigen Elemente zurück (4)

        // Überprüfen, ob ein Element vorhanden ist
        System.out.println(autoSet.contains("Mazda")); // false
        System.out.println(autoSet.contains("Audi")); // true

        // Entfernen eines Elements
        autoSet.remove("Ford");
        System.out.println("Auto Set nach Entfernen: " + autoSet);

        // Unterscheid zwischen HashSet und TreeSet
        System.out.println("TREESET");
        Set<String> obstSet = new TreeSet<>();
        obstSet.add("Banane");
        obstSet.add("Apfel");
        obstSet.add("Orange");
        System.out.println("Obst Set (sortiert): " + obstSet); // Elemente sind sortiert

    }
}
