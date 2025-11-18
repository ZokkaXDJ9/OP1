package aufgaben.lösung_6;

import java.util.ArrayList;
import java.util.List;

public class Person
{
    private static List<Person> personenListe = new ArrayList<>();
    private List<Person>freundeListe = new ArrayList<>();

    private String vorname;
    private String nachname;

    public Person (String vorname, String nachname)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        personenListe.add(this);
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void addFreund(Person persom)
    {
        freundeListe.add(persom);
    }

    public void removeFreund(Person person)
    {
        freundeListe.remove(person);
    }

    public void ausgabeFreundeListe()
    {

        int zaehler = 1;
        if(freundeListe.isEmpty())
        {
            System.out.println("Die Person "+this.vorname+" "+this.nachname+" hat keine Freunde!\n");
        }
        else
        {
            System.out.println("Freundeliste von "+this.vorname+" "+this.nachname+":");
            for (Person p : freundeListe)
            {
                System.out.println(zaehler+". "+p.vorname+" "+p.nachname);
                zaehler++;
            }
        }
    }

    public static void ausgabePersonenListe()
    {
        int zaehler = 1;
        if(personenListe.isEmpty())
        {
            System.out.println("Es gibt noch keine Personen in der Personenliste!\n");
        }
        else
        {
            System.out.println("Liste aller Personen: ");
            for (Person p : personenListe)
            {
                System.out.println(zaehler+". "+p.vorname+" "+p.nachname);
                zaehler++;
            }
        }
    }

}
