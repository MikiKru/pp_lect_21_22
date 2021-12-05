package lect4;

import lect2.User;

import java.util.ArrayList;
import java.util.List;

public class UserCollection {
    public static void main(String[] args) {
        User user1 = new User("a", "a", "a@a.pl");
        User user2 = new User("b","b","b@b.pl");
        User user3 = new User("c", "c", "c@c.pl");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(users);

    }
}
