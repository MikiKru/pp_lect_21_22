package lect2;

// klasa uruchomieniowa
// implementująca obiekty klasy User
public class Main {
    public static void main(String[] args) {
        // każdy obiekt ma własną przestrzeń adresową
        User user1 = new User("a", "a", "a@a.pl");
        User user2 = new User("b","b","b@b.pl");
        User user3 = new User("c", "c", "c@c.pl");

        // prywatne skłasowe są widoczne tylko w klasie gdzie są zaimplementowane
//        user1.login = "";
        user1.setEmail("mk@mk.pl");
        System.out.println(user1.getEmail());
        System.out.println(user2.getEmail());
        System.out.println(user1.toString());
        System.out.println(user2);
        System.out.println(user3);
    }
}
