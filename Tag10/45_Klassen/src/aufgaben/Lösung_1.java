package aufgaben;

/* Level 1
(- und + hier in der Aufgabenstellung dienen nur zur Auflistung der einzelnen Punkte und haben nichts mit den Zugriffsmodifizierern im UML-Diagramm zu tun)
 Schreiben Sie bitte ein Programm, in dem ...
 - eine Klasse Firma definiert wird
   + die Member der Klasse sind:
     - String: name
     - Double-Liste: konten
     - Methode: getSumme
       + Funktion: berechnet den Gesamtbetrag aller Listenelemente
       + Rückgabewert: Gesamtbetrag
     - Getter und Setter für die Attribute.

 - In der Main erstellen Sie zwei Firmen und geben die Werte testweise aus.

 Erstellen Sie zu der Klasse ein UML Klassendiagramm.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lösung_1 {

    public static void main(String[] args) {
        Firma f1 = new Firma();
        f1.setName("Meine Firma 1");
        f1.setKonten(new ArrayList<>(Arrays.asList(1999.95, 0.05, 1234.10)));

        Firma f2 = new Firma();
        f2.setName("Meine andere Firma");
        f2.setKonten(new ArrayList<>(Arrays.asList(11.35, 987.65, 1.0)));

        List<Firma> firmenliste = new ArrayList<Firma>();
        firmenliste.add(f1);
        firmenliste.add(f2);

        for (Firma element : firmenliste)
        {
            System.out.println(element.getName()+ " : " + element.getSumme());
        }
    }
}

class Firma {
    private String name;
    private List<Double> konten;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getKonten() {
        return konten;
    }

    public void setKonten(List<Double> konten) {
        this.konten = konten;
    }

    public double getSumme() {
        double summe = 0;

        for (double konto : konten) {
            summe = summe + konto;
        }

        return summe;
    }
}







