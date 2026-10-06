package view;
import controller.AccountService;
import database.AccountDataBase;
import model.Account;
import utils.Utils;
import java.util.Scanner;

/**
 * Handles console interaction for finding an account by owner ID.
 */
public class FindAccountMenu {

    /**
     * Prompts the user for an owner ID and prints the corresponding account details.
     *
     * @param scanner        scanner instance for reading user input
     * @param accountService account service for finding account
     */
    public static void findAccountById(final Scanner scanner, final AccountService accountService) {
        System.out.println("Find an account by ID.\n");

        final Account account = accountService.findAccountByOwnerId(getValidId(scanner));

        System.out.println("It belongs to: " + account.getOwner().getFirstName() + " " + account.getOwner().getLastName());
    }

    /**
     * Checks if an account exists for the given owner ID.
     *
     * @param searchId owner ID to search for
     * @return true if account exists, false otherwise
     */
    private static boolean isIdExist(long searchId) {
        boolean idExist = false;
        for (Account account : AccountDataBase.getAccounts()) {
            if (account.getId() == searchId) {
                idExist = true;
                break;
            }
        }
        return idExist;
    }

    /**
     * Repeatedly prompts the user until a valid existing owner ID is entered.
     *
     * @param scanner scanner instance for reading input
     * @return valid and existing owner ID
     */
    private static long getValidId(final Scanner scanner) {
        System.out.print("Type ID of an account: ");
        long id = Utils.readLongInput(scanner);

        while (!isIdExist(id)) {
            System.out.println("Error: account with ID " + id + " does not exist! Try again.\n");
            System.out.print("Type ID of an account: ");
            id = Utils.readLongInput(scanner);
        }
        return id;
    }
}
