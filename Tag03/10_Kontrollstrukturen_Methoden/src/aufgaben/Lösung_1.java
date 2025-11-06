package aufgaben;

/* Level 1
 * Führen Sie 3 Integer-Variablen ein: auswahl, zahl1 und zahl2.
 * Über auswahl soll in einem Switch-Case eine Wahl getroffen werden, welche der 4 Grundrechenarten als Methode aufgerufen wird.
 * Sollte eine falsche Auswahl getroffen werden soll eine Ausgabe auf der Konsole erscheinen die anzeigt, welche Auswahl getroffen
 * wurde und das diese nicht korrekt oder verfügbar ist.
 * Schreiben Sie für jede Rechenart eine separate Methode und übergeben Sie an sie die für die Berechnung notwendigen Parameter
 * zahl1 und zahl2.
 * In der Methode soll dann die Berechnung durchgeführt und das Ergebnis an die main zurückgegeben werden.
 * Die Ausgabe des Ergebnisses soll dann auf der Konsole erscheinen.
 *
 * Beachten: Geben Sie eine Fehlermeldung auf der Konsole aus, wenn durch 0 dividiert wird.
 */

public class Lösung_1
{
    static int addition(int zahl1,int zahl2) {
        return zahl1 + zahl2;
    }

    static int subtraktion(int zahl1,int zahl2) {
        return zahl1 - zahl2;
    }

    static int multiplikation(int zahl1,int zahl2) {
        return zahl1 * zahl2;
    }

    static float division(int zahl1,int zahl2) {
        return (float)zahl1 / (float)zahl2;
    }


    public static void main(String[] args) {

        int auswahl = 4;
        int zahl1 = 5;
        int zahl2 = 0;

        switch (auswahl) {
            case 1:
                System.out.printf("Das Ergebnis der Addition aus den Zahlen %s und %s "
                        + "lautet %s%n", zahl1, zahl2, addition(zahl1, zahl2));
                break;
            case 2:
                System.out.printf("Das Ergebnis der Subtraktion aus den Zahlen %s und %s "
                        + "lautet %s%n", zahl1, zahl2, subtraktion(zahl1, zahl2));
                break;
            case 3:
                System.out.printf("Das Ergebnis der Multiplikation aus den Zahlen %s und %s "
                        + "lautet %s%n", zahl1, zahl2, multiplikation(zahl1, zahl2));
                break;
            case 4:
                if(zahl2 == 0)
                {
                    System.out.println("Das teilen durch 0 ist nicht erlaubt!");
                }
                else
                {
                    System.out.printf("Das Ergebnis der Division aus den Zahlen %s und %s "
                            + "lautet %.2f%n", zahl1, zahl2, division(zahl1, zahl2));
                }
                break;
            default:
                System.out.printf("Auswahl: %s ist nicht verfügbar%n", auswahl);
                break;
        }

    }

}
