package aufgaben;

/* Level 1
 * Schreiben Sie ein Programm das Ihnen zu jedem Monat im Jahr, den Sie mit der String-Variable "monat" einführen, die Tage des Monats ausgibt.
 * Nutzen Sie für die Monats-Auswahl ein Switch-Case. Bei falscher Monatsangabe soll eine Fehlermeldung auf der Konsole erscheinen.
 * Für den Monat Februar sind 28 Tage anzugeben.
 * Ausgabe auf der Konsole soll wie folgt lauten: "Der "+monat+" hat "+tage+" Tage."
 */


public class Lösung_3
{
    public static void main(String[] args) {

        String monat = "SePtEmBeR".toLowerCase();

        int tage = 0;

        switch (monat) {
            case "januar":
            case "märz":
            case "mai":
            case "juli":
            case "august":
            case "oktober":
            case "dezember":
                tage = 31;
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                tage = 30;
                break;
            case "februar":
                tage = 28; // oder 29 Schaltjahr
                break;
            default:
                System.out.println("Ungültiger Monatsname");
                tage = 0;
                break;
        }

        if(tage != 0)
        {
            System.out.println("Der " + String.valueOf(monat.charAt(0)).toUpperCase() + monat.substring(1) + " hat " + tage + " Tage.");
        }

    }

}
