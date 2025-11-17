package aufgaben;

/* Level 1
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - eine Klasse 'Produkt' definiert wird
   + Klassenmember sind:
     - name (String, private)
        + normaler Getter und Setter
     - mindestpreis (Integer, private)
        + kein Getter, normaler Setter
     - verkaufspreis (Integer, private)
        + normaler Getter; Setter: nur FALLS value>=mindestpreis SONST verkaufspreis=mindestpreis
 - im Main alle obigen "Feature" getestet werden
*/

public class Lösung_3
{

    public static void main(String[] args)
    {
        Produkt p1 = new Produkt();
        p1.setMindestpreis(500);
        p1.setVerkaufspreis(300);
        System.out.println("Kontrollausgabe (nach zu geringer Setzung): p1.Verkaufspreis hat nun den Wert " + p1.getVerkaufspreis());
        p1.setVerkaufspreis(800);
        System.out.println("Kontrollausgabe (nach ausreichender Setzung): p1.Verkaufspreis hat nun den Wert " + p1.getVerkaufspreis());

        p1.setName("Schnickschnack");
        System.out.println("Kontrollausgabe p1.Name: " + p1.getName());
    }
}

class Produkt
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private double mindestpreis;

    // Es ist keine Pflicht, zu privaten Attributen Getter und Setter zur Verfügung zu stellen.
    // In diesem Beispiel wollen wir für Mindestpreis nur einen Setter, aber keinen Getter.
    public void setMindestpreis(double mindestpreis)
    {
        this.mindestpreis = mindestpreis;
    }

    private double verkaufspreis;

    public double getVerkaufspreis()
    {
        return verkaufspreis;
    }

    public void setVerkaufspreis(double verkaufspreis)
    {
        if (verkaufspreis >= mindestpreis)
            this.verkaufspreis = verkaufspreis;
        else
            this.verkaufspreis = mindestpreis;
    }


}


