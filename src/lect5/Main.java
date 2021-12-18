package lect5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // modyfikacja id globalnego statyczne
        User.setId(10);
        User user1 = new User("mk","mk");
        User user2 = new User("aa","aa");
        User user3 = new User("bb","bb");
        User user4 = new User("cc","cc");
//        user.login = "sss";
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        // sprawdzenie jaka jest wartość ostatnio wprowadzonego id
        System.out.println(User.getId());
        Post post1 = new Post("test1", "test1", Category.IT, user1);
        Post post2 = new Post("test2", "test2", Category.IT, user3);
        Post post3 = new Post("test3", "test3", Category.IT, user1);
        System.out.println(post1);
        System.out.println(post2);
        // Kolekcje
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        System.out.println("=============================");
        users.forEach(System.out::println);
        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        System.out.println("=============================");
        posts.forEach(System.out::println);

        // Ile postów napisał każdy użytkownik
        for (User user : users) {               // iteruje po wszystkich użytkownikach
            int counter = 0;
            for (Post post: posts) {            // iteruje po wszystkich postach
                if(user.getUser_id() == post.getAuthor().getUser_id()){     // czy iterowany użytkownik jest autorem iterowanego posta
                    counter++;
                }
            }
            System.out.printf("Liczba postów napisana przez użytkownika %s wynosi: %d\n", user.getLogin(), counter);
        }
    }
}
