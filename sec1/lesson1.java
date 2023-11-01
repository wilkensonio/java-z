package sec1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.err.println(name);
        sc.close();
    }
}