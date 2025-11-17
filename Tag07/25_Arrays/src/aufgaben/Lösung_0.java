package aufgaben;

/* Level 1
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein Array "Album" vom Typ String mit der Größe 5 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 5 Songs hinzu. Dabei ist jedes Element im Array ein Song-Titel.
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie Length-Eigenschaft des Arrays für die Schleifenbedingung.
 */

public class Lösung_0 {

    public static void main(String[] args) {


        String[] album = new String[5];

        album[0] = "Sulfur";
        album[1] = "Psychosocial";
        album[2] = "Dead Memories";
        album[3] = "Gehenna";
        album[4] = "All Hope Is Gone";

        for (int i = 0; i < album.length; i++)
        {
            System.out.println(album[i]);
        }

    }
}
