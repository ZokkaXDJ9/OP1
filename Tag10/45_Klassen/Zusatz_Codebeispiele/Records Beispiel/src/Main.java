public class Main
{
    public static void main(String[] args)
    {
        Artikel a = new Artikel(100, "Apfel", 0.99);
        System.out.println(a); // toString()
        System.out.println(a.bezeichnung()); // Getter

    }
}


// Records werden verwendet, wenn unveränderliche Daten gespeichert werden sollen.
// Attribute in Records sind private und - ganz wichtig: final!
record Artikel(int nummer, String bezeichnung, double preis)
{
    // Konstruktor, Getter, toString(), equals() und hashCode() sind automatisch vorhanden.
    // Getter sind allerdings leider nicht mit "get" benannt.
}