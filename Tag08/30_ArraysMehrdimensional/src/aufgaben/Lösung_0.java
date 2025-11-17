package aufgaben;

/* Level 1
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein 2-Dimensionales Array "Album" vom Typ String mit der Größe 5 und 2 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 5 Songs mit Komponist oder Interpret hinzu. Zum Beispiel:
	Album[0][0] = "Cello Suite No. 1 in G Major"; Album[0][1] = "Johann Sebastian Bach";
 * In einer For-Schleife sollen dann alle Songs des Albums einschließlich Komponist bzw. Interpret ausgegeben werden. Verwenden Sie length für die Schleifenbedingung.
 */

import java.util.Arrays;

public class Lösung_0 {

    public static void main(String[] args) {
        String[][] Album = new String[5][2];

        Album[0][0] = "Cello Suite No. 1 in G Major";
        Album[0][1] = "Johann Sebastian Bach";

        Album[1][0] = "Nightcall";
        Album[1][1] = "Kavinsky";

        Album[2][0] = "An Tagen wie diesen";
        Album[2][1] = "Fettes Brot";

        Album[3][0] = "Rip & Tear";
        Album[3][1] = "Mick Gordon";

        Album[4][0] = "Kickapoo";
        Album[4][1] = "Tenacious D";

        for (int i = 0; i < Album.length; i++) {
            System.out.println(Album[i][0] + " - " + Album[i][1]);
        }

    }

}








