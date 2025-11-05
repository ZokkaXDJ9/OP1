package vorlesung;

/*
Zu Beginn des Programmes wird der Variable a der Wert 1000 zugewiesen.

Anschließend wird in der Variable b das Ergebnis der Rechnung "a geteilt durch 10" gespeichert.

Daraufhin wird in die Variable c das Ergebnis der Rechnung "b geteilt durch 10" gefüllt.

Schließlich wird in die Variable d das Ergebnis der Rechnung "c geteilt durch 10" gespeichert.

Zum Schluss sollen die Werte der Variablen a, b, c und d in der Konsole ausgegeben werden.
*/

public class Aufgabe_1 {
    static void main(String[] args) {
        int a = 1000;
        int b = a/10;
        int c = b/10;
        int d = c/10;
        System.out.printf("%d, %d, %d, %d", a, b, c, d);
    }
}
