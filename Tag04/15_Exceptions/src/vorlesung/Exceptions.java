package vorlesung;

public class Exceptions {
    static void main(String[] args) {
        // Erste Fehler-Provokation

        // int c = 1 / 0; // Division durch Null -> Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println("Ergebnis: " + c);

        int zahl = 1;
        int teiler = 0;

        // Um den Fehler abzufangen, verwenden wir try-catch Blöcke
        try
        {
            System.out.println("Versuche Division durchzuführen...");
            int ergebnis = zahl / teiler;
            System.out.println("Ergebnis: " + ergebnis);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Fehler: " + ex.getMessage());
        }
        System.out.println("Programm läuft weiter...");
    }
}
