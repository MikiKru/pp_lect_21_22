package lect2;

import java.util.Scanner;

public class IOOperations {
    public static void main(String[] args) {
        System.out.println("Tworzymy nowy obiekt klasy User");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login");
        String login = scanner.nextLine();  // nextLine() - odczyt z klawiatury do obiektu String
        System.out.println("Podaj hasło");
        String password = scanner.nextLine();
        System.out.println("Podaj email");
        String email = scanner.nextLine();
        User user = new User(login, password, email);
        System.out.println("Taki obiekt utworzyłeś");
        System.out.println(user);
        scanner.close();
//        scanner.nextLine(); - błąd!!!
    }
}
