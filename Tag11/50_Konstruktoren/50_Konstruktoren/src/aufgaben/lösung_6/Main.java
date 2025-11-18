package aufgaben.lösung_6;
/* Level 2
Wiederholung OP1:

Entwickeln Sie ein Java-Programm, das die Unterschiede und Funktionen zwischen einer statischen und einer nicht-statischen Liste mithilfe einer Klasse Person demonstriert. Die Klasse Person sollte folgende Attribute und Methoden enthalten:
•	Eine private statische Liste vom Typ Person, in der alle erstellten Personen aufgeführt werden.
•	Eine private nicht-statische Liste vom Typ Person, in der Freunde einer Person hinzugefügt und entfernt werden können.
•	Private Attribute für den Vornamen und Nachnamen jeder Person.
•	Ein Konstruktor, der Vorname und Nachname als Parameter akzeptiert und die Person zur statischen Personenliste hinzufügt.
•	Geeignete Methoden, die einen schreibenden Zugriff auf die Attribute Vorname und Nachname ermöglichen.
•	Beide Listen sollten Methoden besitzen, die eine Ausgabe aller Personen in ihnen ermöglichen. Wenn sich keine Personen in den Listen befinden, sollte eine Benachrichtigung erscheinen. Andernfalls sollten alle Personen mit Vor- und Nachnamen ausgegeben werden.
•	Es sollten Methoden bereitgestellt werden, um Freunde zur Freundesliste hinzuzufügen oder zu entfernen.
In der Main-Methode sollten dann alle Funktionen getestet werden.

 */



public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n->Test Funktionalität der Personenliste: \n");
        Person.ausgabePersonenListe();

        Person paul = new Person("Paul","Sattler");
        Person erik = new Person ("Erik","Hannemann");
        Person anna = new Person ("Anna","Leer");
        Person jannette = new Person("Jannette", "Long");
        Person peter = new Person("Peter","Erikson");

        Person.ausgabePersonenListe();

        System.out.println("\n->Test Funktionalität der Freundesliste: \n");
        erik.ausgabeFreundeListe();

        erik.addFreund(anna);
        erik.addFreund(peter);

        erik.ausgabeFreundeListe();


    }
}
