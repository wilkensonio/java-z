package lambda;

import java.util.Scanner;

public class Lambda {
    public static void main(String[] args) {
        Calculator add = (int x, int y) -> x+y;
        Calculator sub = (int x, int y) -> x-y;
        Calculator c = (int x, int y) -> {
            System.out.println("Hello");
            return x * y;
        };

        System.out.println(add.add(2, 4));
        System.out.println(sub.add(2, 4));
        System.out.println(c.add(2, 4));

//        int r = execute(3,4, c);
//        int r = execute(3,4, (x, y) -> x + y);

        int r = execute(3,4, Integer::sum);
        System.out.println(r);

        Greet greet = (name) -> {
          Scanner scanner = new Scanner(System.in);
          String userName = scanner.next();
          return name + userName;
        };

        System.out.println(greet.greet("Hello "));
    }

    public static int execute(int n1, int n2, Calculator cal){
        return cal.add(n1, n2);
    }
}
