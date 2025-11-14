package collections;

// *********************************************************************************************************************************************************
//                       ---------------------------------------------Collections-Framework----------------------------------------------------
// 						 ----------------------------------------------------Mengen------------------------------------------------------------
// *********************************************************************************************************************************************************

import java.util.*;

public class Mengen {

	public static void main(String[] args) {

		// 1.2) TREESET:
		/*
		 * TreeSet ist ähnlich wie HashSet, aber geordnet.
		   Die Sortierreihenfolge ist entweder die natürliche der Elemente oder wird durch ein Comparator-Objekt vorgegeben.
		 */
		    System.out.println("\n1.2)------TreeSet:--------\n");	
		    TreeSet<String> Tiere = new TreeSet<String>();
			Tiere.add("Affe");
			Tiere.add("Schmetterling");
			Tiere.add("Wal");
			Tiere.add("Schlange");
			Tiere.add("Wolf");
			Tiere.add("Affe");
			Tiere.add("Schmetterling");
			
			System.out.println(Tiere); // Auch hier werden doppelte Elemente nicht mit aufgenommen aber hier wird die Menge nach Alphabet geordnet 
			
			
	}

}
