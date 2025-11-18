package vorlesung;


public class Konstruktoren
{
    static void main(String[] args)
    {
        System.out.println("Klasse Auto");
        Auto auto1 = new Auto(); // <-- Konstruktor-Aufruf

        auto1.setAnzahlTüren(4);
        System.out.println("Anzahl Türen: " + auto1.getAnzahlTüren());

        Computer c1 = new Computer(512); // <-- Konstruktor-Aufruf
        System.out.println("Speicherplatz: " + c1.getSpeicherplatz() + " GB");
        System.out.println("Besitzer: " + c1.getBesitzer());
    }
}
