package controller;

import model.Account;

/**
 * Implementation of the {@link AccountService} interface.
 */
public class AccountServiceImpl implements AccountService {
    private Account[] accounts;

    /**
     * Constructs the service with an array of accounts.
     *
     * @param accounts array of accounts to process
     */
    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
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
