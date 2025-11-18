package aufgaben.lösung_5v2;

import java.util.ArrayList;
import java.util.Random;

public class Tennis
{
    private static final Random random = new Random();

    private ArrayList<Spieler> team1;
    private ArrayList<Spieler> team2;

    public Tennis(ArrayList<Spieler> team1, ArrayList<Spieler> team2)
    {
        this.team1 = team1;
        this.team2 = team2;
    }

    // Eine Methode für das Zusammentreffen zweier Spieler
    // Ein Spieler gewinnt, wenn drei Matches gewonnen wurden

    /**
     * Es werden so lange Matches gespielt, bis ein Spieler 3 Matches gewonnen hat. Der Verlierer wird aus dem Team entfernt.
     * @param s1
     * @param s2
     * @return Der Gewinner wird zurückgegeben.
     */
    private Spieler zusammentreffen(Spieler s1, Spieler s2)
    {
        System.out.printf("%s vs %s\n", s1.getName(), s2.getName());
        int punkteS1 = 0;
        int punkteS2 = 0;

        for (int i = 1; punkteS1 != 3 && punkteS2 != 3; i++)
        {
            System.out.printf("Match %d: ", i);
            Spieler gewinner = match(s1, s2);
            System.out.println();
            if (gewinner == s1)
                punkteS1++;
            else
                punkteS2++;
        }

        if (punkteS1 == 3)
        {
            team2.remove(s2);
            return s1;
        }
        else
        {
            team1.remove(s1);
            return s2;
        }
    }

    // Eine Methode für den Ablauf eines einzelnen Matches
    // Ein Match ist gewonnen, wenn 6 Punkte erreicht wurden

    /**
     * Ein Match wird so lange gespielt, bis ein Spieler 6 Punkte hat.
     * Die Verteilung der Punkte wird per Random bestimmt.
     * @param s1
     * @param s2
     * @return Der Gewinner wird zurückgegeben.
     */
    private Spieler match(Spieler s1, Spieler s2)
    {
        int punkteS1 = 0;
        int punkteS2 = 0;

        while (punkteS1 != 6 && punkteS2 != 6)
        {
            // Zufallszahl entscheidet, wer gewinnt.
            int werGewinnt = (random.nextInt(100) + 1) % 2;
            if (werGewinnt == 0) // ist die Zahl gerade
                punkteS1++; // bekommt Spieler 1 einen Punkt
            else
                punkteS2++; // sonst Spieler 2
        }

        System.out.print(punkteS1 + " - " + punkteS2);

        if (punkteS1 == 6)
            return s1;
        else
            return s2;
    }

    // Eine Methode für den gesamten Spielablauf
    // Es gewinnt das Team, das am Ende übrig ist

    /**
     * Die beiden Teams treten so lange gegeneinander an, bis nur noch ein Team übrig ist.
     * @return Die verbliebenen Spieler des Teams, das gewonnen hat.
     */
    public ArrayList<Spieler> spielablauf()
    {
        while(team1.size() > 0 && team2.size() > 0)
        {
            Spieler s1 = team1.get(random.nextInt(team1.size()));
            Spieler s2 = team2.get(random.nextInt(team2.size()));

            Spieler gewinner = zusammentreffen(s1, s2);
            System.out.println(gewinner.getName());
        }

        if (team1.size() > 0)
            return team1;
        else
            return team2;
    }
}
