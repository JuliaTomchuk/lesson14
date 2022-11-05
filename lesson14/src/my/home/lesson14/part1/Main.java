package my.home.lesson14.part1;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = readFromConsole();
        LocalDate date = intArrayToDate(array);
        System.out.println(date.getDayOfWeek());

    }

    public static int[] readFromConsole() {
        int[] result = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year (ex.1991):");
        while (!(scanner.hasNextInt())) {
            scanner.nextLine();
            System.out.println("Enter year (ex.1991):");
        }

        result[0] = scanner.nextInt();


        System.out.println("Enter month (ex.01..12):");
        while (!(scanner.hasNextInt())) {
            scanner.nextLine();
            System.out.println("Enter month (ex.01..12):");

        }
        result[1] = scanner.nextInt();

        System.out.println("Enter dayOfMonth (ex.01..31):");
        while (!(scanner.hasNextInt())) {
            scanner.nextLine();
            System.out.println("Enter dayOfMonth (ex.01..31):");
        }

        result[2] = scanner.nextInt();

        scanner.close();


        return result;

    }

    public static LocalDate intArrayToDate(int[] array) {

        LocalDate date = LocalDate.of(array[0], array[1], array[2]);
        return date;
    }


}