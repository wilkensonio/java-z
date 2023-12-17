package time.azoneDateTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZoneDateTimeDemo zd = new ZoneDateTimeDemo();
        System.out.println(zd.z1);
    }
}
class ZoneDateTimeDemo {
    ZonedDateTime z1;
    ZonedDateTime z2;
    ZonedDateTime z3;

    public ZoneDateTimeDemo() {
        this.z1 = ZonedDateTime.now();
        this.z2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
//        this.z3 = ZonedDateTime.parse("");
    }
}
