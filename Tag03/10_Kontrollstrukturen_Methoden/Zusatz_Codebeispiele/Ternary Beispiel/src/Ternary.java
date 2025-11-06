import java.util.Random;

/*
 * Der ?-Operator
 * Auch Conditional Operator oder Ternary Conditional Operator genannt
 * Wertet einen booleschen Ausdruck aus und gibt das Ergebnis zurück.
 * Syntax: condition ? consequent : alternative
 */
public class Ternary {

	public static void main(String[] args) {
		char c = '+';
        int a;

        if (c == '+')
            a = 1 + 1;
        else
            a = 1 - 1;

       System.out.println("If-Else: " +  a);

        // Obige If-Anweisung mit Ternary-Operator
        a = c == '+' ? 1 + 1 : 1 - 1;

        System.out.println("Ternary: " + a);

        // Weiteres Beispiel
        Random r = new Random();
        int zufall = r.nextInt(1001) - 500;
        

        String ergebnis1, ergebnis2;
        if (zufall > 0)
            ergebnis1 = "nicht negativ";
        else
        {
            if (zufall < 0)
                ergebnis1 = "negativ";
            else
                ergebnis1 = "genau 0";
        }
        System.out.println(zufall);

        //Obige If-Anweisung mit Ternary-Operator
        ergebnis2 = (zufall > 0) ? "nicht negativ" : (zufall < 0) ? "negativ" : "genau 0";

        System.out.println(ergebnis1 + " " + ergebnis2);

	}

}
