package database;

import model.User;

/**
 * Storage for initial user data.
 */
public class UserDataBase {

    private static User user1 = new User(1234L, "Petea", "Ivanov");
    private static User user2 = new User(1235L, "Anna", "Smirnova");
    private static User user3 = new User(1236L, "Maxim", "Sidorov");
    private static User user4 = new User(1237L, "Elena", "Kuznetsova");
    private static User user5 = new User(1238L, "Dmitry", "Popov");
    private static User user6 = new User(1239L, "Olga", "Vasilieva");

    public static User getUser1() {
        return user1;
    }

    public static User getUser2() {
        return user2;
    }

    public static User getUser3() {
        return user3;
    }

    public static User getUser4() {
        return user4;
    }

    public static User getUser5() {
        return user5;
    }

    public static User getUser6() {
        return user6;
    }
}
