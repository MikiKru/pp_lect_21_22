package lect1;

import static java.lang.Math.pow;

public class Operators {
    public static void main(String[] args) {
        // inkrementacja
        int number1 = 5;
        int number2 = 5;
        System.out.println("Przyrostowa tj.: najpierw wypisuję liczbę a potem inkrementuje " + number1++);
        System.out.println("Przyrostowa tj.: najpierw inkrementuje liczbę a potem wypisuję " + ++number2);

        System.out.println(number1);
        System.out.println(number2);
        int result = ((1 + number1++) + --number2 ) * ++number1;
        // problem decyzyjny 3-arg
        System.out.println(result == 60);
        System.out.println(result == 96 ?
                "Wynik poprawny" :
                "Wynik błędny powinno być "+ result + " a podałeś " + 96);

        System.out.println("X^Y");
        int x = 4;
        int y = 2;
        // autopodpowiedź ALT + Enter
        // wypisanie na std wyjściu tekstu sformatowanego
        System.out.printf("Liczba %d do potęgi %d wynosi %.2f",x, y, pow(x,y));
        char symbol = '#';
        System.out.printf("Wybrany symbol to: %s.", symbol);

    }
}
