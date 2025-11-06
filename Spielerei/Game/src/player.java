public class Player {
    private final String name;
    private int level;
    private int health;
    private int experience;
    private int mana;
    private int stamina;

    private String weapon;
    private String armor;
    private String shield;

    // Konstruktor legt nur den Namen fest und ruft initialize auf
    public Player(String name) {
        this.name = name;
        initializePlayer();
    }

    void giveStandardEquipment() {
        this.weapon = "Wooden Sword";
        this.armor = "Leather Armor";
        this.shield = "Wooden Shield";

        System.out.println("You have been equipped with:");
        System.out.println("Weapon: " + weapon);
        System.out.println("Armor: " + armor);
        System.out.println("Shield: " + shield);
    }

    void initializePlayer() {
        this.level = 1;
        this.health = 100;
        this.experience = 0;
        this.mana = 50;
        this.stamina = 75;

        System.out.println("Player Initialized:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Stamina: " + stamina);
    }

    void levelUp() {
        this.level++;
        int healthIncrease = 20;
        int manaIncrease = 10;
        int staminaIncrease = 15;

        this.health += healthIncrease;
        this.mana += manaIncrease;
        this.stamina += staminaIncrease;

        System.out.println("Congratulations! You've leveled up to Level " + level);
        System.out.println("Health increased by " + healthIncrease);
        System.out.println("Mana increased by " + manaIncrease);
        System.out.println("Stamina increased by " + staminaIncrease);
    }

    // Utility methods zur Steuerung des Player-Status
    int getExperience() {
        return this.experience;
    }

    void addExperience(int xp) {
        this.experience += xp;
    }

    int getLevel() {
        return this.level;
    }
}
