package utils;

import java.util.Scanner;

public class Utils {

    public static long readLongInput(final Scanner scanner) {
        validateLongInput(scanner);
        final long id = scanner.nextLong();
        scanner.nextLine();
        return id;
    }

    public static void validateLongInput(final Scanner scanner) {
        while (!scanner.hasNextLong()) {
            System.out.println("\nIt should contain numbers, try again");
            scanner.nextLine();
        }
    }
}
