package aufgaben;

/* Level 1
 * Eine Einkaufsliste:
 * Im Main erzeugen Sie eine Liste vom Typ String und fügen ihr fünf Dinge (Brot, Butter, Käse, Rasierschaum, Schokolade) hinzu.
 * Lassen Sie anschließend alle Strings der Liste über eine Foreach-Schleife ausgeben.
 */

import java.util.ArrayList;

public class Lösung_0 {

    public static void main(String[] args) {

        ArrayList<String> einkaufsliste = new ArrayList<String>();
        einkaufsliste.add("Brot");
        einkaufsliste.add("Butter");
        einkaufsliste.add("Käse");
        einkaufsliste.add("Rasierschaum");
        einkaufsliste.add("Schokolade");

        System.out.println("Meine Einkaufsliste: ");
        for (String s : einkaufsliste) {
            System.out.println(s);
        }
    }

}
