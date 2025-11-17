import java.util.Scanner;

public class GarbageCollectionBeispiel
{
	private int id;
	private int[] array;

	public GarbageCollectionBeispiel(int id)
	{
		this.id = id;
		array = new int[200_000];
	}

	// Bis Java 8: Über den Finalizer können wir sehen, wenn ein Objekt vom Garbage Collector gelöscht wird.
	/*@Override
	public void finalize()
	{
		System.out.println("der GC war da - id: " + id);
	}*/


	public static void main(String args[])
	{
		// Wir erstellen zwei Objekte und speichern die Referenzen auf die Objekte in Variablen.
		GarbageCollectionBeispiel s1 = new GarbageCollectionBeispiel(1);
		GarbageCollectionBeispiel s2 = new GarbageCollectionBeispiel(2);
		// Über die Variablen können wir dann mit den Objekten arbeiten...
		System.out.println(s1.toString());
		System.out.println(s2.toString());

		// Nun überschreiben wir die Variablen und löschen damit die Referenzen auf die Objekte.
		s1 = null;
		s2 = null;

		System.gc(); // Garbage Collector erzwingen (normalerweise arbeitet der Garbage Collector automatisch)

		doStuff();

		// Damit der GC Zeit hat, das in der Methode erstellte Objekt zu löschen, halten wir das Programm mit einer Konsolen-Eingabe offen.
		new Scanner(System.in).nextLine();

	}

	public static void doStuff()
	{
		GarbageCollectionBeispiel s3 = new GarbageCollectionBeispiel(3);
		System.out.println(s3);
		GarbageCollectionBeispiel s4 = new GarbageCollectionBeispiel(4);
		System.out.println(s4);
		// Variablen existieren nur in ihrem Gültigkeitsbereich. Gültigkeitsbereiche sind durch { } eingeschlossen.
		// Die Variable 's3' ist nur in dieser Methode gültig. Sobald die Methode verlassen wird, wird die Variable gelöscht.
		// Durch Löschen der Variable verschwindet auch die Objekt-Referenz und damit kann der GC das Objekt aus dem Speicher löschen.
	}


}