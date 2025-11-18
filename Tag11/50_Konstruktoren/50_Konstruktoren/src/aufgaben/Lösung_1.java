package aufgaben;

/* Level 1
Zeichnen Sie bitte eine UML-Notation für die folgende Klasse:
- Name: Fußballfeld
- Member:
  3 private Felder:
    breite (Integer)
    länge (Integer)
    dfbTauglich (Boolean)
  1 public Methode:
    Name: zeigeAlle
    Übergabewerte: Keine
    Funktion: Gibt die Werte der drei Felder auf der Konsole aus
    Rückgabewert: Keiner
  1 Konstruktor:
    Name: Fußballfeld
    Übergabewerte: Länge und Breite des Fußballfeldes
    Funktion: - initialisiert die Felder "breite" und "länge" mit den Übergabewerten
              - setzt dfbTauglich auf True, falls 45<=breite<=55 UND 90<=länge<=110, sonst dfbTauglich=False
    Rückgabewert: Keiner

Schreiben Sie bitte in Programm, in dem ...
- die Klasse 'Fußballfeld' implementiert wird
- im Main die Funktionalität der Klasse getestet wird
*/


public class Lösung_1 {

    public static void main(String[] args) {

        Fußballfeld f1 = new Fußballfeld(20, 40);
        f1.zeigeAlle();
        System.out.println();
        Fußballfeld f2 = new Fußballfeld(50, 100);
        f2.zeigeAlle();
    }
}

class Fußballfeld
{
    public Fußballfeld(int b, int l)
    {
        breite = b;
        länge = l;
        if (breite >= 45 && breite <= 55 && länge >= 90 && länge <= 110)
            dfbTauglich = true;
        else
            dfbTauglich = false;
    }

    private int breite;
    private int länge;
    private boolean dfbTauglich;

    public void zeigeAlle()
    {
        System.out.printf("Breite: %d\nLänge: %d\nDFB-tauglich: %s%n", breite, länge, dfbTauglich);
    }
}

