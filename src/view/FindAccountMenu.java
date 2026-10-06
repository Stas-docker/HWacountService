package view;

import controller.AccountService;
import controller.AccountServiceImpl;
import database.AccountDataBase;
import model.Account;
import utils.Utils;

import java.util.Scanner;

public class FindAccountMenu {

    public static void findAccountById(final Scanner scanner, final AccountService accountService) {
        System.out.println("Find an account by ID.\n");

        final Account account = accountService.findAccountByOwnerId(getValidId(scanner));

        System.out.println("It belongs to: " + account.getOwner().getFirstName() + " " + account.getOwner().getLastName());
    }

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
