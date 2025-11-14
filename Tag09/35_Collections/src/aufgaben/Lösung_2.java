package aufgaben;

/* Level 1
    Schreiben Sie bitte zunächst die 3 folgenden Methoden:
    a) Funktionsname: SchreibeListe
       Übergabewert:  1 String-Liste 'l'
       Funktion:      l wird sortiert, anschließend werden alle Strings in l auf der Konsole ausgegeben
       Rückgabewert:  Keiner
    b) Funktionsname: HatLeerzeichen
       Übergabewert:  1 String 's'
       Funktion:      Füllt die boolesche Variable 'b' mit 'true', FALLS s (mindestens) ein Leerzeichen besitzt, SONST 'false'
       Rückgabewert:  b
    c) Funktionsname: SchonVorhanden
       Übergabewert:  1 String-Liste 'l' und ein String 's'
       Funktion:      Füllt die boolesche Variable 'b' mit 'true', FALLS s in l vorkommt, SONST 'false'
       Rückgabewert:  b

    Testen Sie die obigen Methoden bitte mithilfe des folgenden Programms:
    - Zunächst wird eine Liste vom Typ String eingeführt
    - Das Programm startet eine Endlos-Schleife, in der pro Durchlauf ...
      + vom User ein Wort abgefragt wird
        - falls in der Eingabe ein Leerzeichen vorkommt: entsprechende Fehlermeldung:
        - falls in der Eingabe KEIN Leerzeichen vorkommt, ABER die Eingabe bereits in der Liste vorkommt: entsprechende Fehlermeldung
        - falls WEDER ein Leerzeichen vorkommt, NOCH die Eingabe bereits vorkommt, so wird die Eingabe in die Liste mit aufgenommen
      + alle Elemente der Liste werden auf der Konsole ausgegeben
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lösung_2 {

    static void schreibeListe(List<String> wortListe) {
        Collections.sort(wortListe);
        for (String s : wortListe)
            System.out.print(s + " ");
        System.out.println();
    }

    static boolean hatLeerzeichen(String s) {
        boolean ergebnis = false;
        for (String s1 : s.split("")) {
            if (s1.equals(" ")) {
                ergebnis = true;
                break;
            }
        }
        return ergebnis;
    }

    static boolean schonVorhanden(List<String> l, String s) {
        for (String element : l)
            if (element.equals(s))
                return true;
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String wort;
        ArrayList<String> wortListe = new ArrayList<String>();

        while (true)
        {

            System.out.println("Geben Sie bitte ein neues Wort ein: ");
            wort = sc.nextLine();

            if (hatLeerzeichen(wort))
                System.out.println("Ihre Eingabe wird nicht in der Liste aufgenommen, da ein Leerzeichen vorkommt!\n");
            else if (schonVorhanden(wortListe, wort))
                System.out.println("Das aktuelle Wort wird nicht erneut aufgenommen, da es bereits vorhanden ist!\n");
            else
                wortListe.add(wort);

            System.out.println("Aktueller Listeninhalt:");
            schreibeListe(wortListe);
        }
    }
}







