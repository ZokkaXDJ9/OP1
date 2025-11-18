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

    public Computer(int speicherplatz) {
        this.speicherplatz = speicherplatz;
        this.besitzer = "unbekannt";
    }
}
