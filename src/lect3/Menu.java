package lect3;

import java.util.Scanner;

public class Menu {
    int[] numbers = {1, 3, 2, 4, 3, 2, 4, 5, 6, 3};

    public Menu() {
        getMenuContext();
    }

    public void getMenuContext() {
        Scanner scanner = new Scanner(System.in);
        String decision = "";
        while (!decision.toUpperCase().equals("Q")) {
            System.out.println("Wybierz zadanie \n\t1 : zadanie 1\n\t2 : zadanie 2\n\t" +
                    "3 : zadanie 3\n\tQ : wyjście");
            decision = scanner.nextLine();
            switch (decision) {
                case "1":
                    System.out.println("Wykonianie zadania 1");
                    exercise1();
                    break;
                case "2":
                    System.out.println("Wykonianie zadania 2");
                    exercise2();
                    break;
                case "3":
                    System.out.println("Wykonianie zadania 3");
                    System.out.println("Podaj liczbę którą chcesz znaleźć");
                    String number = scanner.nextLine();
                    exercise3(Integer.valueOf(number));
                    break;
                case "q":
                case "Q":
                    System.out.println("Wyjście");
                    break;
                default:
                    System.out.println("Błędny wybór");
                    break;
            }
        }
        scanner.close();
    }

    public void exercise1() {
//        for (int i = numbers.length - 1; i >= 0; i--)
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("index: %d zawiera wartość parzystą: %d\n", i, numbers[i]);
            }
        }
    }

    public void exercise2() {
        //typ elementu tablicy : po czym iterujemy
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void exercise3(int numberToFind) {
        int i = 0;
        for (int number : numbers) {
            System.out.println("Iteracja " + (i + 1));
            if (number != numberToFind) {
                i++;
                continue;
            }
            System.out.printf("Wartość %d znajduje się na indeksie %d\n", number, i);
            break;

        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
