package controller;

import model.Account;

public class AccountServiceImpl implements AccountService {
    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(final long id) {
        Account foundAccount = null;
        for (Account account : accounts) {
            if (account.getOwner().getId() == id) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(final long balance) {
        long numberOfAccounts = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getBalance() > balance) {
                numberOfAccounts++;
            }
        }
        return numberOfAccounts;
    }
}
