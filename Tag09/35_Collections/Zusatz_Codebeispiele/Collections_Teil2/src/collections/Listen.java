package collections;
// *********************************************************************************************************************************************************
//                       ---------------------------------------------Collections-Framework----------------------------------------------------
// 						 ----------------------------------------------------Listen------------------------------------------------------------
// *********************************************************************************************************************************************************


import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Listen {

	public static void main(String[] args)
	{

		// 1.2) LINKEDLIST:
		/*
		 * LinkedList realisiert eine doppelt verkettete lineare Liste.
		   Einfüge- und Löschoperationen sind performanter als bei ArrayList. Der wahlfreie Zugriff ist langsamer.
		   LinkedList ist besonders für große Listen oder bei häufigen Änderungen vorzuziehen.
		   Funktion: Der LinkedList speichert seine Artikel in "Containern". Die Liste hat einen Link zum ersten Container und jeder Container hat einen Link
		   zum nächsten Container in der Liste. Um der Liste ein Element hinzuzufügen, wird das Element in einen neuen Container platziert und dieser Container
		   wird mit einem der anderen Container in der Liste verknüpft.
		 */

		/*
		 * Die LinkedListKlasse verfügt über dieselben Methoden wie die ArrayListKlasse, da beide die ListSchnittstelle implementieren . Das bedeutet,
		 * dass Sie auf die gleiche Weise Einträge hinzufügen, Einträge ändern, Eintrage entfernen und die Liste löschen können.
		 */

		System.out.println("\n");
		System.out.println("1.2)------LinkedList--------\n");
		LinkedList<String> Tiere = new LinkedList<String>();
		Tiere.add("Affe");
		Tiere.add("Wal");
		Tiere.add("Schlange");
		Tiere.add("Wolf");
		Tiere.add("Schmetterling");

		System.out.println(Tiere);

		System.out.println(Tiere.get(0));

		System.out.println(Tiere.size());

		Tiere.set(2, "Nashorn");
		System.out.println(Tiere);

		Tiere.remove(3);
		System.out.println(Tiere);

		Boolean InDerListe = Tiere.contains("Wal");
		System.out.println(InDerListe);


		// ***********************************************************************************************************************
		// 1.3) Vector:
		/*
		 * Sowohl Vector als auch ArrayList verwenden intern Array als Datenstruktur. Sie sind dynamisch in der Größe veränderbar. 
		 * Der Unterschied besteht darin, wie sie intern in der Größe geändert werden. Standardmäßig verdoppelt Vector die Größe seines Arrays,
		 * wenn seine Größe erhöht wird. Aber ArrayList vergrößert sich um die Hälfte seiner Größe, wenn seine Größe erhöht wird.
		 * 
		 * Hauptunterschied gemäß Java-API besteht darin, dass die Methoden von Vector synchronisiert werden und die Methoden von ArrayList nicht synchronisiert werden.
		 * 
		 * Merkmale und Verwendung:
		 * höherer Leistungsanspruch durch synchronisierte Methoden 
		 * Leistungseinbuße gegenüber ArrayList
		 * Wenn Bedarf an Thread-sicherem Betrieb besteht, ist Vector zu verwenden
		 */
		System.out.println("\n");	
		System.out.println("1.3)------VECTOR--------\n");
		Vector<Integer> zahlen = new Vector<Integer>();
		zahlen.add(11);
		zahlen.add(22);
		zahlen.add(25);
		zahlen.add(44);
		zahlen.add(45);
		zahlen.add(55);
		System.out.println(zahlen);
		System.out.println(zahlen.get(0));
		System.out.println(zahlen.size());
		zahlen.set(2, 33);
		System.out.println(zahlen);
		zahlen.remove(4);
		System.out.println(zahlen);

		// Was ist ein Iterator?
		// Ein Iterator erlaubt sequentiellen Zugriff auf die Elemente einer Sammlung.
		// Ein Iterator-Objekt wird mittels der Methode .iterator() erzeugt.
		for (Iterator<Integer> it = zahlen.iterator(); it.hasNext(); )  // dessen Methode .hasNext() liefert true, solange der Iterator nicht das Ender der Collection erreicht hat
		{
			String s = String.valueOf(it.next()); //.next() greift man auf das jeweils nächste Element zu
			if (s.equals("Ford")) // Vergleichen der Strings mit equals("zu vergleichender Wert")
				it.remove();     // Löschen, wenn vorhanden / gefunden
			System.out.print(s + " ");
		}
		// Der Aufruf des Iterators ist prinzipiell genau das, was bei einer foreach-Schleife geschieht.
		
		// ***********************************************************************************************************************
		// 1.4) Stack:
		/*
		 * Ein Stack ist eine Datenstruktur, die nach dem LIFO-Prinzip (last-in-first-out) arbeitet. Die Elemente werden am vorderen Ende 
		 * der Liste eingefügt und von dort auch wieder entnommen. Das heißt, die zuletzt eingefügten Elemente werden zuerst entnommen und die zuerst 
		 * eingefügten zuletzt.
		 * 
		 * In Java ist ein Stack eine Ableitung eines Vektors, der um neue Zugriffsfunktionen erweitert wurde, um das typische Verhalten eines Stacks zu
		 * implementieren. Obwohl dies eine ökonomische Vorgehensweise ist, bedeutet es, daß ein Stack alle Methoden eines Vektors erbt und damit auch wie 
		 * ein Vektor verwendet werden kann. Wir wollen diese Tatsache hier ignorieren und uns mit den spezifischen Eigenschaften eines Stacks beschäftigen.
		 * 
		 * Einige wichtige Methoden eines Stack
		 * 		push() Anhängen von Elementen
				pop()  Abrufen des obersten Elements, Element wird danach vom Stack entfernt
				peek() Abrufen des obersten Elements, Element wird danach nicht vom Stack entfernt
				empty() Abfrage ob Stack leer ist, gibt einen boolean zurück also true oder false
		 */
		System.out.println("\n");	
		System.out.println("1.4)------Stack--------\n");
		Stack<String> Elemente = new Stack<String>();


		Elemente.push("Erstes Element");
		Elemente.push("Zweites Element");
		Elemente.push("Drittes Element");
		Elemente.push("Viertes Element");
		Elemente.push("Fünftes Element");

		Collections.shuffle(Elemente);
		System.out.println(Elemente);
		while (true) 
		{
	       try 
	       {
	    	   System.out.println(Elemente.pop());
	       } catch (EmptyStackException e) 
	       {
			  break;
	       }
		}
		
		System.out.println(Elemente.empty());


		// ***********************************************************************************************************************
		// 1.5) Queue (Warteschlange):
		Queue<String> queue = new LinkedList<>();
		// Queue funktioniert nach einem FIFO (First-in-First-Out) Prinzip.
		queue.add("Hallo");
		queue.add("Welt"); // Neue Elemente werden hinten angefügt
		System.out.println(queue.poll()); // Und mit 'poll()' werden Elemente vorne abgefragt und aus der Queue entfernt.




	}

}
