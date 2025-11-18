package vorlesung;

public class Computer
{
    private int speicherplatz;
    private String besitzer;

    public int getSpeicherplatz()
    {
        return speicherplatz;
    }
    public void setSpeicherplatz(int speicherplatz)
    {
        this.speicherplatz = speicherplatz;
    }
    public String getBesitzer()
    {
        return besitzer;
    }
    public void setBesitzer(String besitzer)
    {
        this.besitzer = besitzer;
    }

    public Computer() {
        this.speicherplatz = 256; // Standardwert
        this.besitzer = "Unbekannt"; // Standardwert
    }

    // Methodenüberladung! Gleicher Name, aber andere Parameter!
    // 2. Eigener Konstruktor mit Parametern Speicherplatz und Besitzer
    public Computer(int speicherplatz, String besitzer) {
        this.speicherplatz = speicherplatz;
        this.besitzer = besitzer;
    }
}
