package aufgaben.roboter_01;

import aufgaben.roboter_01.*;

public class Main
{
    public static void main(String[] args)
    {
        Aufgaben a1 = new Aufgaben();
        a1.setName("putzt Schuhe");
        a1.setKostenBatterie(15);

        Aufgaben a2 = new Aufgaben();
        a2.setName("reicht Butter");
        a2.setKostenBatterie(10);

        Aufgaben a3 = new Aufgaben();
        a3.setName("geht Einkaufen");
        a3.setKostenBatterie(50);

        Aufgaben a4 = new Aufgaben();
        a4.setName("holt ein Getränk");
        a4.setKostenBatterie(25);

        Roboter r2d2 = new Roboter();
        r2d2.ladeRoboter();
        r2d2.führeAufgabeAus(a2);
        r2d2.führeAufgabeAus(a3);
        r2d2.führeAufgabeAus(a4);

        r2d2.führeAufgabeAus(a2);
        // Anzeige: Warnung Batterielaufzeit kritisch

        //r2d2.führeAufgabeAus(a4);
        //Anzeige: Kann Aufgabe nicht mehr ausführen!!! Batterielaufzeit zu klein
        //r2d2.ladeRoboter();




    }
}
