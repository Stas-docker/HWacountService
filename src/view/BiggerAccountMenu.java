package view;

import controller.AccountService;
import controller.AccountServiceImpl;
import database.AccountDataBase;
import model.Account;
import utils.Utils;

import java.util.Scanner;

public class BiggerAccountMenu {

    public static void countWealthierAccounts(final Scanner scanner, final AccountService accountService) {
        showMenu();

        final long number = accountService.countAccountsWithBalanceGreaterThan(Utils.readLongInput(scanner));
        System.out.println("\nAccounts that contain more money than you've just mentioned are: " + number);
    }

    private static void showMenu() {
        System.out.println("\nFind the quantity of accounts where balance is greater than you has typed.");
        System.out.println("Write the amount: ");
    }
}
