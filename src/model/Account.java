package model;

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
        this.id = id;
        this.balance = balance;
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
