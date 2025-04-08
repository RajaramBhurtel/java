import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDate {
    public static void main(String[] args) {
        DateThread myDate = new DateThread();
        Thread t = new Thread(myDate);
        t.start();  // Start the thread
    }
}

class DateThread implements Runnable {
    public void run() {
        System.out.println("Date thread running!");
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(now));  // Properly formatted date
    }
}

