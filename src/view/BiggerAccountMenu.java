package view;
import controller.AccountService;
import utils.Utils;
import java.util.Scanner;

/**
 * Handles console interaction for counting accounts with a balance above a threshold.
 */
public class BiggerAccountMenu {

    /**
     * Prompts the user for a balance amount and prints the count of accounts exceeding it.
     *
     * @param scanner        scanner instance for reading user input
     * @param accountService account service for calculation
     */
    public static void countWealthierAccounts(final Scanner scanner, final AccountService accountService) {
        showMenu();

        final long number = accountService.countAccountsWithBalanceGreaterThan(Utils.readLongInput(scanner));
        System.out.println("\nAccounts that contain more money than you've just mentioned are: " + number);
    }

    /**
     * Displays menu header instructions.
     */
    private static void showMenu() {
        System.out.println("\nFind the quantity of accounts where balance is greater than you has typed.");
        System.out.println("Write the amount: ");
    }
}
