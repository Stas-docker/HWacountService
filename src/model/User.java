package model;

/**
 * Represents a user in the system.
 */
public class User {

    private long id;
    private String firstName;
    private String lastName;

    /**
     * Constructs a new User.
     *
     * @param id        user unique identifier
     * @param firstName user first name
     * @param lastName  user last name
     */
    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /** @return user ID */
    public long getId() {
        return id;
    }

    /** @return user first name */
    public String getFirstName() {
        return firstName;
    }

    /** @return user last name */
    public String getLastName() {
        return lastName;
    }
}
