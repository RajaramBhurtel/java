public class Main {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription() + " | Weekend? " + day.isWeekend());
        }
    }
}


public enum Day {
    MONDAY("Start of work week"),
    TUESDAY("Second day"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost Friday"),
    FRIDAY("Last work day"),
    SATURDAY("Weekend!"),
    SUNDAY("Rest day");

    private final String description;

    // Constructor
    Day(String description) {
        this.description = description;
    }

    // Method to get the description
    public String getDescription() {
        return description;
    }

    // Method to check if it's a weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
