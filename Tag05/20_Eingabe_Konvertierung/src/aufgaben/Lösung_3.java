/* Level 1
    AUFGABE 3A
    Schreiben Sie bitte die folgende Funktion (und testen Sie diese im Main)
    Name: inputINT
    Übergabewert: 1 String als User-Information-Text (z.B."Geben Sie bitte eine ganze Zahl ein: ")
    Funktion: Fragt vom User eine ganze Zahl ab (OHNE Überprüfung der Korrektheit der User-Eingabe)
    Rückgabewert: User-Eingabe

    AUFGABE 3B
    Schreiben Sie bitte ein Java-Programm, in dem (unter Verwendung der Funktion aus Teilaufgabe A) ...
    - eine Schleife solange durchlaufen wird, bis der User die Eingabe 42 tätigt
    - bei jeder falschen Eingabe eine Fehlermeldung auf der Konsole erscheint
    - bei der ersten korrekten Eingabe die Schleife beendet und eine Erfolgsmeldung ausgegeben wird
*/

package aufgaben;

import java.util.Scanner;
public class Lösung_3
{
	static Scanner sc = new Scanner(System.in);
	public static String inputINT(String text) {

		System.out.print(text);
		return sc.nextLine();
	}

	public static void main(String[] args) {
		// Variante 1
		while (true) {
			String userEingabe = inputINT("Geben Sie bitte eine ganze Zahl ein: ");
			try {
				int userInput = Integer.parseInt(userEingabe);
				if (userInput == 42) {
					System.out.println("Treffer! Sie lagen richtig");
					break;
				} else {
					System.out.println("Leider nicht die 42!");
				}
			} catch (NumberFormatException ex) {
				System.out.println("Leider keine Zahl!");
			}
		}

		// Variante 2
		boolean richtig = false;
		while (!richtig) {
			String input = inputINT("Geben Sie bitte eine ganze Zahl ein: ");
			if (input.equals("42")) {
				richtig = true;
			} else {
				System.out.println("Leider falsch!");
			}
		}
		System.out.println("Treffer! Sie lagen richtig");

		// Variante 3
		int value = 0;
		do {
			String input_V2 = inputINT("Geben Sie bitte eine ganze Zahl ein: ");
			try {
				value = Integer.parseInt(input_V2);
			} catch (NumberFormatException ex) {
				System.out.println("Fehler");
			}
		} while (value != 42);
		System.out.println("Treffer! Sie lagen richtig");
	}
}