package aufgaben;

/* Level 1
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * string "titel", int "dauerSekunden", string "interpret"
 * passenden Getter und Setter für die Attribute
 * und der Methode "spielen", die auf der Konsole alle Informationen über den Song ausgibt (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
 *
 * Über einen Konstruktor sollen die Attribute initialisiert werden.
 *
 * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
 */

public class Lösung_0
{
    public static void main(String[] args)
    {
        Song song = new Song("Spiders", 324, "Ashbury Heights");

        song.spielen();
    }
}

class Song
{
    private String titel;
    private int dauerSekunden;
    private String interpret;

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public int getDauerSekunden()
    {
        return dauerSekunden;
    }

    public void setDauerSekunden(int dauerSekunden)
    {
        this.dauerSekunden = dauerSekunden;
    }

    public String getInterpret()
    {
        return interpret;
    }

    public void setInterpret(String interpret)
    {
        this.interpret = interpret;
    }

    public String getDauer()
    {
        return String.format("%02d:%02d", dauerSekunden / 60, dauerSekunden % 60);
    }

    public void spielen()
    {
        System.out.printf("Titel: %s - Interpret: %s - Dauer: %s%n", titel, interpret, getDauer());
    }

    public Song(String titel, int dauerSekunden, String interpret)
    {
        this.titel = titel;
        this.dauerSekunden = dauerSekunden;
        this.interpret = interpret;
    }
}





