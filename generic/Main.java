package generic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setContent(List.of(1,3,4,5,4));
        Box<String> stringBox = new Box<>();
        stringBox.setContent(List.of("12"));

        System.out.println(box.getContent());
        System.out.println(stringBox.getContent());
    }
}
