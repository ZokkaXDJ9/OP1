package collections;
// *********************************************************************************************************************************************************
//                       ---------------------------------------------Collections-Framework----------------------------------------------------
// 						 -------------------------------------------------Verzeichnisse--------------------------------------------------------
// *********************************************************************************************************************************************************

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Verzeichnisse {

	public static void main(String[] args) {

		// ***********************************************************************************************************************
		// 1.1) HASHTABLE VS HASHMAP:
		// Unterschiede: 	- HashMap nicht synchronisiert
		//					- HashMap erlaubt einen Null-Schlüssel und mehrere Null-Werte, während Hashtable keinen Null-Schlüssel oder -Wert zulässt
		//HashMap wird im Allgemeinen gegenüber HashTable bevorzugt, wenn keine Thread-Synchronisierung erforderlich ist
		System.out.println("\n1.1)------HashTable VS HashMap--------\n");
		System.out.println("\n------HashTable--------\n");
		Hashtable<String, Integer> Zahlen
			= new Hashtable<String, Integer>();
		Zahlen.put("Eins", 1);
		Zahlen.put("Zwei", 2);
		Zahlen.put("Drei", 3);

		System.out.println(Zahlen.size());
		System.out.println(Zahlen.get("Drei")); // Gibt die Zahl aus die in Verbindung mit dem Schlüssel "Drei" gespeichert wurde
		System.out.println(Zahlen.containsKey("Eins")); // Abruf, ob ein Schlüssel mit "Eins" existiert gibt bool zurück true oder false
		System.out.println(Zahlen.containsValue(2)); // Abruf, ob ein Wert mit 2 existiert gibt bool zurück true oder false

		// Wichtige Methoden Hashtable :
		/*
		 * 	put()
			get()
			contains()
			containsKey()
 			elements()
			keys()
		 */


		// 1.2) TREEMAP:
		System.out.println("\n1.2)------TreeMap--------\n");	
		//TreeMap ist ähnlich wie HashMap, aber die Reihenfolge der Elemente ist sortiert.
		
		// Wichtige Methoden TreeMap :
		/*
		 * 	size()
			get()
			put()
			containsKey()
			containsValue()
			values()
		 */
		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("2", "Punkt zwei");
		tm.put("1", "Punkt eins");
		tm.put("3", "Punkt drei");

		for (String elem : tm.keySet())
			System.out.println(elem + " - " + tm.get(elem));
	}
}
