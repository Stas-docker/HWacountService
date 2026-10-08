package utils;

import database.AccountDataBase;
import database.UserDataBase;
import model.Account;
import model.User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Helper class for console input validation and parsing.
 */
public class Utils {
    static User[] users = UserDataBase.getUsers();

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

    /**
     * Validates that the input string is not null, empty, or containing digits.
     *
     * @param string the text to validate
     * @throws IllegalArgumentException if string is null, blank, or contains digits
     */
    public static void validateStringInput(String string) {
        final Pattern pattern = Pattern.compile("\\d");

        if (string.isBlank()) {
            throw new IllegalArgumentException("Cannot be null or empty.");
        }

        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            throw new IllegalArgumentException("Cannot contain digits.");
        }
    }

    /**
     * Validates that the user ID is unique.
     *
     * @param id the user ID to check
     * @throws IllegalArgumentException if a user with this ID already exists
     */
    public static void validateIdUniqueness(long id) {
        if (users != null) {

            for (User user : UserDataBase.getUsers()) {
                if (user != null && user.getId() == id) {
                    throw new IllegalArgumentException("User with ID " + id + " already exists");
                }
            }

        }
    }

    /**
     * Validates that the account ID matches the owner's user ID.
     *
     * @param id the account ID
     * @param owner the user who owns the account
     * @throws IllegalArgumentException if the IDs do not match
     */
    public static void validateIdAffiliation(long id, User owner) {
        if (id != owner.getId()) {
            throw new IllegalArgumentException("Account ID must match the owner's User ID.");
        }
    }

    /**
     * Validates that the initial balance is not negative.
     *
     * @param balance the account balance to check
     * @throws IllegalArgumentException if the balance is less than zero
     */
    public static void validateBalanceEssentiality(long balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
    }

    /**
     * Validates that a user with the given ID exists in the database.
     *
     * @param id the user ID to check
     * @throws IllegalArgumentException if no user with this ID is found
     */
    public static void validateUserExistence(long id) {
        if (users != null) {
            for (User user : users) {
                if (user.getId() == id) {
                    return;
                }
            }

            throw new IllegalArgumentException("There's no user like that in data base");
        }
    }
}
