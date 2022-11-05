package my.home.lesson14.part3;

import java.util.Scanner;

public class Reverse {

    public void go(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        while (!(scanner.hasNextInt())) {
            scanner.nextLine();
        }
        int num = scanner.nextInt();
        scanner.close();


        if (num == 1) {
            Handler<String> handler = s -> new StringBuilder(s).reverse().toString();
            System.out.println(handler.handle(str));

        }
    }
}



