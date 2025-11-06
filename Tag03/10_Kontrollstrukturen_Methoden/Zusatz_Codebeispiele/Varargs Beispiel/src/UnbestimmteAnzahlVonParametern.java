/*
 *  In der main Methode wird das Resultat der Methode durchschnitt ausgegeben. 
 *  Dabei werden der Methode durchschnitt einige Werte übergeben. 
 *  Damit wir in Zukunft einfach weitere Werte hinzufügen können und die 
 *  Parameteranzahl unserer durchschnitt Methode nicht verändern müssen, fügen wir einfach drei Punkte nach dem int ein.

Die Methode durchschnitt addiert alle Werte, die ihr übergeben werden und gibt den Durchschnitt zurück. */
public class UnbestimmteAnzahlVonParametern
{
	public static int durchschnitt(int... werte)  // varargs (Variable Arguments)
	{
		int gesamt = 0;

		for (int x : werte) {
			gesamt += x;
		}

		return gesamt / werte.length;
	}

	// Auch die Main Methode lässt sich so schreiben → intern wird ein Array übergeben
	public static void main(String... args)
	{
		System.out.println(durchschnitt(1, 3, 5, 6));

	}

}
