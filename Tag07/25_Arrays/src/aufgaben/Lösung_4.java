package aufgaben;

/* Level 3
Übungsaufgabe zu Strings, Arrays und Konvertierung
==================================================
1.  Der User soll einen Text über die Tastatur eingeben
2.  Der Text wird nach der Eingabe codiert
    Die Codierung soll den Text als BinärCode erzeugen
    Verwendet dafür eine eigene Methode
    In dieser Methode wird jedes Zeichen des Textes in den
    entsprechenden Binärcode umgewandelt und in einen String geschrieben
2a. BONUS-AUFGABE: Normiert den Binärcode für jedes Zeichen auf 8bit Länge
    Aus "1001011" wird dann "01001011" usw...
3.  Gebt den codierten Text in der Console aus

Zur Lösung dieser Aufgabe muss nicht viel SELBST programmiert werden.
Sie lässt sich mit den Board-Mitteln einfach lösen.

Ihr braucht nur:
- StringBuilder
    - StringBuilder.append()
- String
    - String.format()
    - String.replaceAll() (für die BONUS-AUFGABE)
- Integer
    - Integer.toBinaryString()

Beispiel: "Hallo Welt!" wird zu
01001000 01100001 01101100 01101100 01101111
00100000 01010111 01100101 01101100 01110100
00100001
 */

import java.util.Scanner;

public class Lösung_4
{

    static String codieren(String klarText) {
        StringBuilder s = new StringBuilder();
        char[] einzelZeichen = klarText.toCharArray();

        for(char c : einzelZeichen){
            s.append(String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0")).append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie einen Text ein: ");
        String eingabe = sc.nextLine();
        System.out.println("\n==========================================================\n");
        System.out.println("Der codierte Text");
        System.out.println("-----------------\n");
        String ausgabe = codieren(eingabe);
        System.out.println(ausgabe);
    }
}