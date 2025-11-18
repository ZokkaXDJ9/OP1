package aufgaben.lösung_5v2;

/* Level 3
In einem Tennis-Match treten 2 Mannschaften gegeneinander an. Gespielt wird nach dem Ko-System.
Ein zufälliger Spieler aus Mannschaft 1 spielt gegen einen zufälligen Spieler aus Mannschaft 2.
Der Spieler, der das Spiel verliert, scheidet aus und wird aus der Mannschaft entfernt.

Eine Begegnung dauert so lange, bis ein Spieler DREI Matches gewonnen hat. Hier weichen wir von den offiziellen Regeln ab (glaub ich :-)).
Beispiel:
	Spieler 1 - Spieler 2
Match 1:    6     -    4
Match 2:    3     -    6
Match 3:    3     -    6
Match 4:    6     -    2
Match 5:    6     -    5
	Spieler 1 - Spieler 2 (haben jeweils einen eigenen Zähler, der hochgezählt wird)
Eine Zufallszahl entscheidet, wer einen Punkt bekommt.
Beispiel-Match:
S1	S2
1	0
1	1
2	1
3	1
3	2
4	2
5	2
5	3
6	3

Turnier-Sieger ist die Mannschaft, die noch Spieler hat. Eine Mannschaft besteht aus 4 Spielern.

Team 1:			        Team 2:
Hugo Meier			    Fritz
Susi Sorglos			Walter
Fred Feuerstein			Sigrid
Marie Müller			Annemarie

Aus beiden Mannschaften werden ZUFÄLLIG Spieler gewählt.
Der Sieger verbleibt in seiner Mannschaft, der Verlierer scheidet aus.
Danach wird neu ZUFÄLLIG ausgelost.
 */

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Spieler> team1 = new ArrayList<>();
        team1.add(new Spieler("Hugo"));
        team1.add(new Spieler("Susi"));
        team1.add(new Spieler("Fred"));
        team1.add(new Spieler("Marie"));

        ArrayList<Spieler> team2 = new ArrayList<>();
        team2.add(new Spieler("Fritz"));
        team2.add(new Spieler("Walter"));
        team2.add(new Spieler("Sigrid"));
        team2.add(new Spieler("Annemarie"));

        Tennis tennis = new Tennis(team1, team2);

        /*Spieler gewinner = tennis.zusammentreffen(team1.get(0), team2.get(0));
        System.out.println();
        System.out.println(gewinner.getName());
        System.out.println(team1);
        System.out.println(team2);*/

        ArrayList<Spieler> gewinner = tennis.spielablauf();
        System.out.println();
        System.out.println("Die Gewinner sind:");
        for (Spieler s : gewinner)
            System.out.println(s.getName());
    }

}


