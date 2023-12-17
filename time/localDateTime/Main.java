package time.localDateTime;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        LocalDateTimeDemo ldt = new LocalDateTimeDemo();
        LocalDateTime ldt1 = ldt.ldt1;
        System.out.println("local date now "+ ldt1);
        LocalDateTime minus = ldt1.minusWeeks(2);
        System.out.println("minus 2 week" + minus);
        int c = ldt1.get(ChronoField.DAY_OF_WEEK);
        System.out.println("chronoField"+ c);

        LocalDateTime ldt2 = ldt.ldt2;
        System.out.println("local date time of "+ ldt2);

    }

}

class LocalDateTimeDemo {
    LocalDateTime ldt1;
    LocalDateTime ldt2;
    LocalDateTime ldt3;

    public LocalDateTimeDemo() {
        this.ldt1 = LocalDateTime.now();
        this.ldt2 = LocalDateTime.of(2025, 12, 31, 23, 59, 59);
        this.ldt3 = LocalDateTime.parse("2026-12-28T23:59:59");
    }
}
