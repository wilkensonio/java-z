package functional;


import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodRefExam {
    public static void main(String[] args) {
        // change list of string to uppercase
        List<String> names = Arrays.asList("Wilkenson", "Hilarion", "Altema");

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);

        // filter list of integer
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 9, 10, 11);

        List<Integer> squareOddNum = listInt.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squareOddNum);

//        count even numbers
        TerminalOperation.count();

//         words fewer than 6 characters
        IntermediateOperationsExample.listStr();

//        lambda
        LoopToForEachExample.loopToEach();

    }

    static class TerminalOperation {
        public static void count() {
            List<Integer> l = Arrays.asList(1, 2, 4, 5, 8, 9);

            long count = l.stream()
                    .filter(n -> n % 2 == 0)
                    .count();
            System.out.println(count + " filter even and get count ");

        }
    }

    static class IntermediateOperationsExample {
        public static void listStr() {
            List<String> str = Arrays.asList("Wilkenson", "Hilarion", "Lord", "wilk", "wi");
            List<String> fewerThan6 = str.stream()
                    .filter(n -> n.length() < 6)
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.println(fewerThan6 + " filter less than 6 ");

        }
    }

    static class LoopToForEachExample {
        public static void loopToEach(){
            List<String> str = Arrays.asList("wilkenosn", "hilarion");
            for (String s : str) {
                System.out.println(s);
            }
            // use foreach and lambda exp
            str.forEach(s -> System.out.println(s));
        }
    }
}
