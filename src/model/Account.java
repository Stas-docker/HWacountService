package model;

import utils.Utils;

/**
 * Represents a bank account associated with an owner.
 */
public class Account {

    private long id;
    private long balance;
    private User owner;

    /**
     * Constructs a new Account.
     *
     * @param id      account unique identifier
     * @param balance account balance
     * @param owner   account owner
     */
    public Account(long id, long balance, User owner) {
        Utils.validateIdAffiliation(id, owner);
        this.id = id;
        Utils.validateBalanceEssentiality(balance);
        this.balance = balance;
        Utils.validateUserExistence(id);
        this.owner = owner;
    }

    /**
     * @return account ID
     */
    public long getId() {
        return id;
    }

    /**
     * @return account balance
     */
    public long getBalance() {
        return balance;
    }

    /**
     * @return account owner
     */
    public User getOwner() {
        return owner;
    }
}
