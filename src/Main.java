import controller.AccountService;
import controller.AccountServiceImpl;
import database.AccountDataBase;
import view.BiggerAccountMenu;
import view.FindAccountMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final AccountService accountService = new AccountServiceImpl(AccountDataBase.getAccounts());

        FindAccountMenu.findAccountById(scanner, accountService);
        BiggerAccountMenu.countWealthierAccounts(scanner, accountService);

        scanner.close();
    }
}
