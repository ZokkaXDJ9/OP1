/*
 * In Java wird alles als Wert übergeben. Im Falle eines Arrays (das nichts anderes als ein Objekt ist) wird die Array-Referenz als Wert übergeben → passed by value
 * (genau wie eine Objektreferenz als Wert übergeben wird).

Wenn Sie ein Array an eine andere Methode übergeben, wird der Verweis auf dieses Array kopiert.

    Jede Änderung des Array-Inhalts durch diese Referenz wirkt sich auf das ursprüngliche Array aus.
    Wird der Verweis jedoch so geändert, dass er auf ein neues Array verweist, ändert sich der bestehende Verweis in der ursprünglichen Methode nicht.


*/
public class ArrayCallByReferenz {

	public static void main(String[] args) {
		int[] arr = new int[2];
	    arr[0] = 4;
	    arr[1] = 5;

	    changeContent(arr);

	    System.out.println(arr[0]);  // 10.. 
	  
	    changeRef(arr);

	    System.out.println(arr[0]);  // 10.. 
	                                 // Change the reference doesn't reflect change here...
	}

	public static void changeContent(int[] arr) {

		// Wenn wir den Inhalt von arr ändern,
		arr[0] = 10; // ändert den Inhalt des Arrays in main()
	}

	public static void changeRef(int[] arr) {
		// Wenn wir die Referenz ändern,
		arr = new int[2]; // ändert das Array in main() nicht
		arr[0] = 15;
	}
}
