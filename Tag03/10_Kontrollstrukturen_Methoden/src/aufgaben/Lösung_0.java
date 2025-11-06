package aufgaben;

/* Level 2
 * If-Anweisung und Funktionen
 * Sie bauen einen Roboter. In diesen ist eine Batterie eingebaut.
 * Erzeugen Sie eine Integer-Variable "batterieLaufzeit" mit dem Wert 5.
 * Anschließend implementieren Sie eine Methode "istBatterieLaufzeitNiedrig"
 * Diese Methode soll true zurückgeben, wenn die Laufzeit kleiner 2 ist, sonst false.
 *
 * Erstellen Sie eine String-Variable "aufgabe" und weisen Sie ihr "Ich reiche Butter." zu.
 * Implementieren Sie eine Methode "führeAufgabeAus", die auf dem Bildschirm die Variable "aufgabe" ausgibt,
 * wenn "istBatterieLaufzeitNiedrig" false liefert und dann die Batterie Laufzeit um 1 reduziert,
 * sonst soll "Ich muss aufgeladen werden" in der Konsole erscheinen.
 *
 * Lassen Sie in der Main den Roboter fünfmal die Aufgabe ausführen.
 */

public class Lösung_0
{
    static int batterieLaufzeit = 5;
    static String aufgabe = "Ich reiche Butter.";

    static boolean istBatterieLaufzeitNiedrig()
    {
        if (batterieLaufzeit < 2)
            return true;
        else
            return false;
    }

    static void führeAufgabeAus()
    {
        boolean niedrig = istBatterieLaufzeitNiedrig();
        if (!niedrig)
        {
            System.out.println(aufgabe);
            batterieLaufzeit--;
        }
        else
            System.out.println("Ich muss aufgeladen werden");
    }


    public static void main(String[] args) {

        System.out.println("Beispiel 1: ");
        for (int i = 0; i < 5; i++)
            führeAufgabeAus(); // Weil static ohne Objekt verwendbar

        System.out.println("\nBeispiel 2 mit Klasse Roboter greift schon spätere Themen auf: ");
        Roboter roboter = new Roboter(); // Instanziierung eines Objektes
        for (int i = 0; i < 5; i++)
        {
            roboter.führeAufgabeAus(); // Aufruf durch Verweis auf das Objekt "roboter"
        }


    }
}

// Beispiel mit einer Klasse.
class Roboter {

    private int batterieLaufzeit = 5;
    private String aufgabe = "Ich reiche Butter.";

    public boolean istBatterieLaufzeitNiedrig()
    {
        if (batterieLaufzeit < 2)
            return true;
        else
            return false;
    }

    public void führeAufgabeAus()
    {
        if (!istBatterieLaufzeitNiedrig())
        {
            System.out.println(aufgabe);
            batterieLaufzeit--;
        }
        else
            System.out.println("Ich muss aufgeladen werden");
    }
}