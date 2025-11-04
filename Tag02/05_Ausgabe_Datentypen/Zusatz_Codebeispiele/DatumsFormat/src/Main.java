import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {
        String datum = "20.01.1980"; // String eines Datum
        String uhrzeit = "12:30"; // String einer Uhrzeit

        String datum_uhrzeit = datum+" "+uhrzeit; // Zusammengefügtes Datum aus Datum und Uhrzeit
        System.out.println("Datum und Uhrzeit als String: ");
        System.out.println(datum_uhrzeit); // Ausgabe des zusammengefügten Datums

        /*
            Umwandeln eines Datum Strings in einen Datumsdatentyp hierbei in LocalDateTime
            Das Konvertieren geschieht mit der Parse Methode der Klasse LocalDateTime, diese Methode benötigt
            zum einen den Datum String sowie das Format des Übergabe String als Parameter
        */
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        //Über die Klasse DateTimeFormatter kann ich mit der Methode ofPattern ein Format angeben in Form eines Strings
        LocalDateTime dateTime = LocalDateTime.parse(datum_uhrzeit,fm);
        // Nun kann mein Datum String mithilfe des DateTimeFormatter an die pars Methode der Klasse LocalDateTime
        // übergeben werden und in einen Datumstyp umgewandelt werden.
        System.out.println("Datum und Uhrzeit als LocalDateTime Objekt:");
        System.out.println(dateTime); // Ausgabe über den LocalDateTime Datentyp

        fm = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // speichern eines neuen Formates in fm
        String getDatum = dateTime.format(fm); // über die format Methode ist es uns wieder möglich mit übergabe eines
        // Formates als Parameter das Datum wieder in einen String zu speichern
        System.out.println("Datum String aus dem LocalDateTime Objekt:");
        System.out.println(getDatum); // Wie man in der Ausgabe sehen kann 20.01.1980 <- dd.MM.yyyy hier nur das Datum

        fm = DateTimeFormatter.ofPattern("HH:mm"); // speichern eines neuen Formates in fm
        String getUhrzeit = dateTime.format(fm);
        System.out.println("Uhrzeit String aus dem LocalDateTime Objekt:");
        System.out.println(getUhrzeit); // Ausgabe 12:30 <- HH:mm


        // Zeit zwischen zwei Daten berechnen
        LocalDateTime datetimeNOW = LocalDateTime.now();
        // Ausgabe in Tagen
        int tage = unterschiedInTagen(dateTime,datetimeNOW);
        System.out.println("Ausgabe Tage zwischen dem 20.01.1980 und Heute: ");
        System.out.println(tage);
        // Ausgabe in Jahren
        System.out.println("Ausgabe Jahre zwischen dem 20.01.1980 und Heute: ");
        int jahre = unterschiedInJahren(dateTime,datetimeNOW);
        System.out.println(jahre);


        // Erstellen eines LocalDate Datum-Objekt
        LocalDate localDate = LocalDate.of(2022,9,9); // Übergabe des Datums im Mittels int-Werten Jahr,Monat,Tag
        System.out.println("Ausgabe LocalDate Objekt:");
        System.out.println(localDate);
        fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String getDateFromLocalDate = localDate.format(fm);
        System.out.println("Ausgabe als formatierter String: ");
        System.out.println(getDateFromLocalDate);

        // Erstellen eines LocalTime Zeit-Objekt
        LocalTime localTime = LocalTime.of(12,45);
        System.out.println("Ausgabe LocalTime Objekt:");
        System.out.println(localTime);
        fm = DateTimeFormatter.ofPattern("HH:mm:ss");
        String getTimeFromLocalTime = localTime.format(fm);
        System.out.println("Ausgabe als formatierter String: ");
        System.out.println(getTimeFromLocalTime);


        LocalDate newDate = localDate.plusDays(12);
        System.out.println("Ausgabe newDate Objekt berechnet mit der plusDays Methode");
        System.out.println(newDate);
        System.out.println("Ausgabe als formatierter String verschachtelt in der Ausgabe: ");
        System.out.println(newDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))); // Ausgabe des newDate als formatierter String

        newDate = newDate.minusDays(1);
        System.out.println(newDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))); // Ausgabe des newDate als formatierter String
    }

    // Methode zum Kontrollieren wie viel Tage zwischen 2 Daten vergehen
    public static int unterschiedInTagen(LocalDateTime start, LocalDateTime ende) {
        LocalDate startDatum = start.toLocalDate(); // Methode ruft den LocalDate Teil von LocalDateTime ab und speichert
        // diesen in einer Variable vom Typ der LocalDate Klasse
        LocalDate endDatum = ende.toLocalDate();
        // in der IF - Bedingung wird kontrolliert, ob die Startzeit nach der Endzeit liegt, wenn ja wird auf das Startdatum
        // 1 Tag aufgerechnet
        if (start.toLocalTime().isAfter(ende.toLocalTime())) {
            startDatum = startDatum.plusDays(1);
        }
        // ChronoUnit ist ein Standardsatz von Einheiten für Datumsperioden / ist ein Enum
        return (int) ChronoUnit.DAYS.between(startDatum, endDatum);
    }

    public static int unterschiedInJahren(LocalDateTime start, LocalDateTime ende) {
        LocalDate startDatum = start.toLocalDate(); // Methode ruft den LocalDate Teil von LocalDateTime ab und speichert
        // diesen in einer Variable vom Typ der LocalDate Klasse
        LocalDate endDatum = ende.toLocalDate();
        // in der IF - Bedingung wird kontrolliert, ob die Startzeit nach der Endzeit liegt, wenn ja wird auf das Startdatum
        // 1 Tag aufgerechnet
        if (start.toLocalTime().isAfter(ende.toLocalTime())) {
            startDatum = startDatum.plusDays(1);
        }
        // ChronoUnit ist ein Standardsatz von Einheiten für Datumsperioden / ist ein Enum
        return (int) ChronoUnit.YEARS.between(startDatum, endDatum);
    }

}
