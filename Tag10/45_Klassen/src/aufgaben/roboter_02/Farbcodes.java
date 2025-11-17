package aufgaben.roboter_02;

public enum Farbcodes
{
    RESET("\33[0m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    PURPLE("\033[0;35m"),
    CYAN("\033[0;36m"),
    WHITE("\033[0;37m"),
    BLACK("\033[0;30m");

    private final String fCode;

    Farbcodes(final String fCode) {
        this.fCode = fCode;
    }

    public String getfCode() {
        return this.fCode;
    }
}
