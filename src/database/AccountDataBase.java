package database;

import model.Account;

public class AccountDataBase {

    private static Account account1 = new Account(1234L, 5000L, UserDataBase.getUser1());
    private static Account account2 = new Account(1235L, 12000L, UserDataBase.getUser2());
    private static Account account3 = new Account(1236L, 3500L, UserDataBase.getUser3());
    private static Account account4 = new Account(1237L, 800L, UserDataBase.getUser4());
    private static Account account5 = new Account(1238L, 25000L, UserDataBase.getUser5());
    private static Account account6 = new Account(1239L, 15000L, UserDataBase.getUser6());

    private static Account[] accounts = {
            account1, account2, account3, account4, account5, account6
    };

    public static Account[] getAccounts() {
        return accounts;
    }
}
