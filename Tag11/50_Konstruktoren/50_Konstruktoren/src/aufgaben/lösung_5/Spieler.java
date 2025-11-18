package aufgaben.lösung_5;

import java.util.ArrayList;

public class Spieler
{
    public String name;
    public static ArrayList<Spieler> team1 = new ArrayList<>();
    public static ArrayList<Spieler> team2 = new ArrayList<>();

    public Spieler(String name, int team)
    {
        this.name = name;
        if (team == 0)
        {
            team1.add(this);
        }
        else
        {
            team2.add(this);
        }
    }
}
