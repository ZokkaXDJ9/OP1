package aufgaben.roboter_01;

public class Roboter
{
    private int batterieLaufzeit;

    public int leseLaufzeit()
    {
        return this.batterieLaufzeit;
    }


    public void ladeRoboter()
    {
        batterieLaufzeit = 100;
        System.out.println("----------------------");
        System.out.println("Roboter wurde geladen");
        System.out.println("----------------------");
    }

    public boolean istBatterieLaufzeitNiedrig()
    {

        if(batterieLaufzeit < 10)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public void führeAufgabeAus(Aufgaben aufgabe)
    {

        if(batterieLaufzeit >= aufgabe.getKostenBatterie())
        {
            System.out.print("Der Roboter "+aufgabe.getName());
            this.batterieLaufzeit = this.batterieLaufzeit - aufgabe.getKostenBatterie();
            System.out.println(" / BatterieLaufzeit beträgt jetzt "+ batterieLaufzeit+" %");
            if(istBatterieLaufzeitNiedrig())
            {
                System.out.println("Akkuzustand unter 10% Kritisch !!! Bitte aufladen.");
            }
        }
        else
        {
            System.out.print("Kann Aufgabe nicht mehr ausführen!!!");
            System.out.print(" BatterieLaufzeit nur noch "+ batterieLaufzeit+" %");
            System.out.println(" / Roboter bei Bedarf laden!");
        }

    }
}
