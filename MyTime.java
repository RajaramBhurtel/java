public class MyTime {
    public static void main(String[] args) {
        Time t1 = new Time(5, 45, 30);
        Time t2 = new Time(3, 55, 50);

        // Display initial times
        System.out.print("Time 1: ");
        t1.displayTime();
        System.out.print("Time 2: ");
        t2.displayTime();

        // Add times
        t1.addTime(t2);
        System.out.print("After Adding: ");
        t1.displayTime();

        // Subtract times
        t1.subtractTime(t2);
        System.out.print("After Subtracting: ");
        t1.displayTime();
    }
}

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Parameterized constructor
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    // Method to normalize the time values
    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }
    }

    // Method to add another Time object to this Time object
    public void addTime(Time t) {
        this.hours += t.hours;
        this.minutes += t.minutes;
        this.seconds += t.seconds;
        this.normalizeTime();
    }

    // Method to subtract another Time object from this Time object
    public void subtractTime(Time t) {
        int totalSeconds1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalSeconds2 = t.hours * 3600 + t.minutes * 60 + t.seconds;
        int totalSecondsResult = totalSeconds1 - totalSeconds2;
        
        if (totalSecondsResult < 0) {
            totalSecondsResult = 24 * 3600 + totalSecondsResult;
        }

        this.hours = totalSecondsResult / 3600;
        totalSecondsResult %= 3600;
        this.minutes = totalSecondsResult / 60;
        this.seconds = totalSecondsResult % 60;
    }

    // Method to display time in HH:MM:SS format
    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}



