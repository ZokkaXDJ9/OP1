package aufgaben.roboter_02;



public class Main
{
    public static void main(String[] args)
    {
        Aufgaben a1 = new Aufgaben("putzt Schuhe.",15);
        Aufgaben a2 = new Aufgaben("reicht Butter.",10);
        Aufgaben a3 = new Aufgaben("geht Einkaufen.",50);
        Aufgaben a4 = new Aufgaben("holt ein Getränk.",25);

        Roboter r2d2 = new Roboter(); // Roboter r2d2 wir erzeugt
        r2d2.ladeRoboter(); // Roboter wird aufgeladen
        r2d2.führeAufgabeAus(a2); // führt Aufgabe a2 aus...
        r2d2.führeAufgabeAus(a3);
        r2d2.führeAufgabeAus(a4);

        r2d2.führeAufgabeAus(a2);
        //Anzeige: Warnung Batterielaufzeit kritisch

        //r2d2.führeAufgabeAus(a4);
        //Anzeige: Kann Aufgabe nicht mehr ausführen!!! Batterielaufzeit zu klein
        //r2d2.ladeRoboter();

    }
}
