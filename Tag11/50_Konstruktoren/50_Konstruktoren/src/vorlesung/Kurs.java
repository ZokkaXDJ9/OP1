package vorlesung;

import java.util.LinkedList;

public class Kurs
{
    public static final LinkedList <Kurs> kursliste = new LinkedList<>();

    private String kursbezeichnung;

    public String getKursbezeichnung()
    {
        return kursbezeichnung;
    }
    public void setKursbezeichnung(String kursbezeichnung)
    {
        this.kursbezeichnung = kursbezeichnung;
    }

    public Kurs() {
        // Aufruf des anderen Konstruktors mit Standardwert
        this("Keine Bezeichnung");

        // this.kursbezeichnung = "Keine Bezeichnung";
        // kursliste.add(this);
    }

    public Kurs(String kursbezeichnung) {
        this.kursbezeichnung = kursbezeichnung;
        kursliste.add(this);
    }
}
