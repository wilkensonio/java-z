package functional;


import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.List;
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
        System.out.println(TerminalOperation.count());

    }

    static class TerminalOperation {
        public static long count() {
            List<Integer> l = Arrays.asList(1, 2, 4, 5, 8, 9);

            return l.stream()
                    .filter(n -> n % 2 == 0)
                    .count();
        }
    }
}
