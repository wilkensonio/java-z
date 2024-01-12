package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShortHandLambda {
    public static void main(String[] args) {
        Function<Integer, String> toHex = i -> Integer.toHexString(i);
        System.out.println(toHex.apply(5));

        Function<Integer, String> toHexRefMethod = Integer::toHexString;
        System.out.println(toHexRefMethod.apply(100));

        Supplier<ArrayList<String>> list = ArrayList::new;
        ArrayList<String> intList = list.get();
        for (int i = 0; i < 20; i++) {
            intList.add(Integer.toString(i));
        }
//        intList.forEach(System.out::println);

        ArrayList<Integer> intNum = IntStream.range(1, 21)
                .boxed()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        intNum.forEach(System.out::println);
    }
}
