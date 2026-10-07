package database;

import model.Account;

/**
 * In-memory storage for account records.
 */
public class AccountDataBase {

    private static Account user1 = new Account(1234L, 5000L, UserDataBase.getUser1());
    private static Account user2 = new Account(1235L, 12000L, UserDataBase.getUser2());
    private static Account user3 = new Account(1236L, 3500L, UserDataBase.getUser3());
    private static Account user4 = new Account(1237L, 800L, UserDataBase.getUser4());
    private static Account user5 = new Account(1238L, 25000L, UserDataBase.getUser5());
    private static Account user6 = new Account(1239L, 15000L, UserDataBase.getUser6());

    /**
     * Returns all stored accounts as an array.
     *
     * @return array of accounts
     */
    private static Account[] accounts = {
            user1, user2, user3, user4, user5, user6
    };

    public static Account[] getAccounts() {
        return accounts;
    }
}
