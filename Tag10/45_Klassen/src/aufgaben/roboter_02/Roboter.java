package aufgaben.roboter_02;

public class Roboter
{
    private int batterieLaufzeit;


    public void ladeRoboter()
    {
        batterieLaufzeit = 100;
        System.out.println(Farbcodes.GREEN.getfCode());
        System.out.println("----------------------");
        System.out.println("Roboter wurde geladen");
        System.out.println("----------------------");
        System.out.println(Farbcodes.RESET.getfCode());
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

        if (batterieLaufzeit >= aufgabe.getKostenBatterie()) {
            System.out.print(Farbcodes.PURPLE.getfCode()+"Der Roboter " + aufgabe.getName());
            this.batterieLaufzeit = this.batterieLaufzeit - aufgabe.getKostenBatterie();
            System.out.println(" / BatterieLaufzeit beträgt jetzt " + batterieLaufzeit + " %"+Farbcodes.RESET.getfCode());
            if (istBatterieLaufzeitNiedrig())
            {
                System.out.println(Farbcodes.RED.getfCode()+"Akkuzustand unter 10% Kritisch !!! Bitte aufladen."+Farbcodes.RESET.getfCode());
            }
        } else
        {
            System.out.print(Farbcodes.YELLOW.getfCode()+"Kann Aufgabe nicht mehr ausführen!!!");
            System.out.print(" BatterieLaufzeit nur noch " + batterieLaufzeit + " %");
            System.out.println(" / Roboter bei Bedarf laden!"+Farbcodes.RESET.getfCode());
        }
    }
}
