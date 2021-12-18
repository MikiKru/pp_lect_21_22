package lect5;

public class Main {
    public static void main(String[] args) {
        User user = new User("mk","mk");
//        user.login = "sss";
        System.out.println(user);
        Post post = new Post("test", "test", Category.IT, user);
        System.out.println(post);
    }
}
