package utils;
import java.util.Scanner;

/**
 * Helper class for console input validation and parsing.
 */
public class Utils {

    /**
     * Reads a valid long value from the console.
     *
     * @param scanner scanner instance for reading input
     * @return validated long value
     */
    public static long readLongInput(final Scanner scanner) {
        validateLongInput(scanner);
        final long id = scanner.nextLong();
        scanner.nextLine();
        return id;
    }

    /**
     * Validates that the next input is a long number.
     *
     * @param scanner scanner instance for checking input
     */
    public static void validateLongInput(final Scanner scanner) {
        while (!scanner.hasNextLong()) {
            System.out.println("\nIt should contain numbers, try again");
            scanner.nextLine();
        }
    }
}
