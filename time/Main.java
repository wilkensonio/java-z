package time;

import java.time.Duration;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        DurationDemo dr = new DurationDemo();
        System.out.println(dr.dr);
        System.out.println(dr.hour);

        LocalTime time = LocalTime.now();
        int x = time.getHour() + dr.hour;
        System.out.println(x + time.getMinute());
        System.out.println();

        System.out.println(time.getSecond());



//      formatter
//        LocalDate today = LocalDate.now();
//        LocalDateTime now = LocalDateTime.now();
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-dd-MM");
//        System.out.println(dtf.format(today));
//        System.out.println(dtf.format(now));


    }
}
class DurationDemo {
    Duration dr;
    byte hour;

    public DurationDemo() {
        LocalTime start = LocalTime.of(2, 12);
        LocalTime end = start.plusHours(3);
        this.dr = Duration.between(start, end);
        this.hour = (byte) dr.toHours();
    }
}
