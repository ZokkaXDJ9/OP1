package aufgaben;

/* Level 1
 * Schreiben Sie ein Programm, das Ihnen ausgibt, ob das über die Integer-Variable jahr eingeführte Jahr ein Schaltjahr ist.
 * Durch 4 ohne Rest teilbare Jahre sind normalerweise Schaltjahre.
 * Durch 100 ohne Rest teilbare Jahre sind keine Schaltjahre
 * Durch 400 ohne Rest teilbare Jahre sind doch Schaltjahre
 * Nutzen Sie zu Umsetzung die Boolesche Variable schaltjahr und lassen Sie sich das Jahr sowie ob es ein Schaltjahr ist oder nicht
 * auf der Konsole ausgeben.
 */

public class Lösung_2
{
    public static void main(String[] args) {

        int jahr = 2004;
        boolean schaltjahr = false;

        if(jahr % 400 == 0)
        {
            schaltjahr = true;
        }
        else if(jahr % 100 == 0)
        {
            schaltjahr = false;
        }
        else if(jahr % 4 == 0)
        {
            schaltjahr = true;
        }
        else
        {
            schaltjahr = false;
        }


        if(schaltjahr == true)
        {
            System.out.println(jahr + " ist ein Schaltjahr");
        }
        else
        {
            System.out.println(jahr + " ist kein Schaltjahr");
        }




        // Andere Variante:
        /*
        {
            Input: jahr

            If jahr % 4 == 0 {
                If jahr % 100 == 0 {
                    If jahr % 400 == 0 {
                        Print: Schaltjahr
                    }
                    Else {
                        Print: Kein Schaltjahr
                    }
                }
                Else {
                    Print: Schaltjahr
                }
            }
            Else {
                Print: Kein Schaltjahr
            }
        }
         */

    }

}

