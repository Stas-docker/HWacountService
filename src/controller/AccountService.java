package controller;

import model.Account;

/**
 * Service interface for managing and searching bank accounts.
 */
public interface AccountService {
    /**
     * It finds an account by owner id
     *
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);

    /**
     * It counts the number of account with balance > the given value
     *
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}
