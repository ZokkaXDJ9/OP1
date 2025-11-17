package aufgaben.roboter_02;

public class Aufgaben
{
    private String name;
    private int kostenBatterie;

    public Aufgaben(String name, int kostenBatterie)
    {
        this.name = name;
        this.kostenBatterie = kostenBatterie;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getKostenBatterie()
    {
        return this.kostenBatterie;
    }

    public void setKostenBatterie(int kostenBatterie) {
        this.kostenBatterie = kostenBatterie;
    }
}
