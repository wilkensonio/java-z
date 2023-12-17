package localTime;

import java.time.LocalTime;

class Main {
    public static void main(String[] argrs) {
        LocalTimeDemo localT = new LocalTimeDemo();
        LocalTime lt1 = localT.lt1;
        System.out.println("LocalTime.now() : " + lt1);
        LocalTime ltcp = lt1.plusHours(5);
        System.out.println("LocalTime.now().plusHours(5) : " + ltcp);
    }
}

class LocalTimeDemo {
    LocalTime lt1;
    LocalTime lt2;
    LocalTime lt3;

    LocalTimeDemo() {
        lt1 = LocalTime.now();
        lt2 = LocalTime.of(10, 30, 59);
        lt3 = LocalTime.parse("10:30:50");
    }

}