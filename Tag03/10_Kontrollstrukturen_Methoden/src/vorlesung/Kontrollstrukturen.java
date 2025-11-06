package vorlesung;


// Umfasst die Verzweigungen (If-Else, Switch-Case) und Schleifen (For, Foreach, While, Do-While)
public class Kontrollstrukturen {

    static void main(String[] args)
    {
        // Verzweigungen
        System.out.println("VERZWEIGUNGEN (IF)");

        // Beispiel 1:
        boolean beenden = false;
        if (beenden /* == true */) // Wenn die Bedingung true ist, wird dieser Teil ausgeführt
        {
            System.out.println("Programm wird beendet.");
            System.exit(0); // Beendet das Programm
        }
        else // Optional. Ansonsten wird dieser Teil ausgeführt
        {
            System.out.println("Programm läuft weiter.");
        }

        // Beispiel 2:
        int zahl = 10;
        if (zahl > 10)
        {
            System.out.println("Zahl ist größer als 10.");
        }
        else if (zahl < 10)
        {
            System.out.println("Zahl ist kleiner als 10.");
        }
        else
        {
            System.out.println("Zahl ist genau 10.");
        }

        // Ternary Operator (Kurzform von If-Else)
        System.out.println("TERNARY OPERATOR");

        String zustand = "gefroren";
        if (zustand.equals("gefroren")) // String-Vergleich in Java muss mit .equals() gemacht werden
            System.out.println("Eis ist da.");
        else
            System.out.println("Wasser ist da.");


        System.out.println(zustand.equals("gefroren") ? "Eis ist da." : "Wasser ist da."); // Ternary Operator
        // Syntax: Bedingung ? dann : sonst
        // Dabei muss der Gesamtausdruck einen Wert zurückgeben (z.B. String, int, boolean, etc.)

        // Mehrfachverzwiegung mit Switch-Case
        System.out.println("MEHRFACHVERZWEIGUNGEN (SWITCH-CASE)");
        int meineZahl = 1;

        switch(meineZahl) {
            case 0:
                System.out.println("Zahl ist 0");
                break;
            case 1:
                System.out.println("Zahl ist 1");
                break; // Verhindert, dass die weiteren Fälle auch ausgeführt werden
            case 2:
                System.out.println("Zahl ist 2");
                break;
            case 3:
                System.out.println("Zahl ist 3");
                break;
            default:
                System.out.println("Zahl ist weder 0, 1, 2 noch 3");
        }

        // Schleifen
        System.out.println("FOR SCHLEIFE");
        for (int i = 0; i < 5; i++) {
            System.out.println("Durchlauf Nummer: " + i);
        }
        System.out.println();

        // In For-Schleifen können auch weitere Variablen, Bedingungen und Zählschritte hinzugefügt werden
        for (int i = 0, j = 1; i < 5 || j < 10; i++, j += 2)
            System.out.println("i: " + i + ", j: " + j);

        System.out.println();
        int[] intArray = new  int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
        System.out.println("Erstes Element im Array: " + intArray[0]);
        System.out.println("FOREACH SCHLEIFE");
        // Foreach-Schleifen eignen sich gut um Arrays auszugeben oder anderweitig zu verarbeiten
        for (int zahlImArray : intArray)
            System.out.println("Zahl im Array: " + zahlImArray);
        System.out.println();

        System.out.println("WHILE SCHLEIFE");
        int i = 0;
        while(i < 10) {
            System.out.println("i ist noch kleiner als 10: " + i);
            i++;
        }

        System.out.println("DO-WHILE SCHLEIFE");
        int j = 0;
        do {
            System.out.println("j ist noch kleiner als 10: " + j);
            j++;
        } while (j < 10);

        System.out.println();
        System.out.println("SCHLEIFEN MIT BREAK UND CONTINUE");
        for (int k = 0; k < intArray.length; k++) {
            if (intArray[k] == 10) {
                System.out.println("Gefunden an Index " + k + ", überspringe den Rest der Schleife.");
                break; // Beendet die Schleife komplett
            }
        }
        System.out.println();

        int n = 0;
        while (n < 10) {
            n++;
            if (n == 5) {
                System.out.println("Überspringe  Zahl: " + n);
                continue; // Springt zum Anfang der Schleife zurück
            }
            System.out.println(n + " ");
        }
    }
}
