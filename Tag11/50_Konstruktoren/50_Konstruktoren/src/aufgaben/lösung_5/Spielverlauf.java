package aufgaben.lösung_5;

import java.util.Random;

public class Spielverlauf
{
    private static final Random zuf = new Random();
    private static int auswahlSpieler1;
    private static int auswahlSpieler2;
    private static int matchSieg1;
    private static int matchSieg2;

    public static void dasTurnier()
    {
        do
        {
            spielerErmitteln();
            spielVerlauf();
            siegerErmitteln();
        } while (Spieler.team1.size() > 0 && Spieler.team2.size() > 0);

        if (Spieler.team1.size() == 0)
        {
            System.out.println("\n\nDer Gewinner des Turniers: TEAM 2!!!!!!");
        }
        else if (Spieler.team2.size() == 0)
        {
            System.out.println("\n\nDer Gewinner des Turniers: TEAM 1!!!!!!");
        }
    }

    public static void spielerErmitteln()
    {
        auswahlSpieler1 = zuf.nextInt(Spieler.team1.size());
        String nameSpieler1 = Spieler.team1.get(auswahlSpieler1).name;
        auswahlSpieler2 = zuf.nextInt(Spieler.team2.size());
        String nameSpieler2 = Spieler.team2.get(auswahlSpieler2).name;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Es treffen aufeinander:");
        System.out.println("Spieler 1: " + nameSpieler1 + "\nSpieler 2: " + nameSpieler2);
    }

    public static void spielVerlauf()
    {
        matchSieg1 = 0;
        matchSieg2 = 0;
        int matchZaehler = 1;
        do
        {
            int matchDetails1 = 0;
            int matchdetails2 = 0;
            do
            {
                int x = zuf.nextInt(2);
                if (x == 0)
                {
                    matchDetails1++;
                }
                else
                {
                    matchdetails2++;
                }
            } while (matchDetails1 < 6 && matchdetails2 < 6);

            System.out.print("Match " + matchZaehler + ": " + matchDetails1 + " - " + matchdetails2);
            matchZaehler++;
            if (matchDetails1 == 6)
            {
                matchSieg1++;
            }
            else if (matchdetails2 == 6)
            {
                matchSieg2++;
            }
            System.out.println("\t\t" + matchSieg1 + " - " + matchSieg2);
        } while (matchSieg1 < 3 && matchSieg2 < 3);
    }

    public static void siegerErmitteln()
    {
        if (matchSieg1 == 3)
        {
            Spieler.team2.remove(auswahlSpieler2);
        }
        else if (matchSieg2 == 3)
        {
            Spieler.team1.remove(auswahlSpieler1);
        }
        System.out.println("\nVerbliebene Spieler Team1:");
        for (Spieler s : Spieler.team1)
        {
            System.out.println(s.name);
        }
        System.out.println("\nVerbliebene Spieler Team2:");
        for (Spieler s : Spieler.team2)
        {
            System.out.println(s.name);
        }
    }
}
