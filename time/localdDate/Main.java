package time.localdDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDateDemo localDateDemo = new LocalDateDemo();

        LocalDate date1 = LocalDateDemo.localDate1;
        System.out.println("LocalDate.now() : " + date1);

        LocalDate newdate = date1.plusDays(5);
        System.out.println(newdate.getYear());

        System.out.println("LocalDate.now().plusDays(5) : " + newdate);
        LocalDate date2 = localDateDemo.localdate2;
        System.out.println("LocalDate.of(2025, 12, 31) : " + date2);

        LocalDate date3 = localDateDemo.localdate3;
        System.out.println("LocalDate.parse(\"2026-12-28\") : " + date3);

    }

}

class LocalDateDemo {
    static LocalDate localDate1 = LocalDate.now();
    LocalDate localdate2 = LocalDate.of(2025, 12, 31);
    LocalDate localdate3 = LocalDate.parse("2026-12-28");


}
