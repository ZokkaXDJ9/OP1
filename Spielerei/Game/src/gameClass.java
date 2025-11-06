public class gameClass {
    public static void main(String[] args) {
        System.out.println("--- Starting Game ---");

        // Erzeuge einen Spieler und initialisiere ihn
        Player player = new Player("Hero");
        player.giveStandardEquipment();



        System.out.println("--- Game End ---");
    }
}
