package lect2;

import java.util.Arrays;

public class StringOperations {
    public static void main(String[] args) {
        String name = "Michał";
        // sprawdzam jaki jest znak na indeksie 0
        char letter = name.charAt(0);
        System.out.println(letter);
        // sprawdzam długość napisu
        System.out.println(name.length());
        // ostatnia litera napisu
        System.out.println(name.charAt(name.length() - 1));
        // szukam znaku w imieniu i zwracam jego pozycję
        System.out.println(name.indexOf('h'));
        System.out.println(name.indexOf('H'));
        // zmiana ciągu zanków na inny ciąg znaków
        String text = "Ala ma kota a kot ma Alę";
        System.out.println(text.replaceAll("kot", "pies"));
        // sprawdzenie wyników porównania
        System.out.println(name.equals(text));
        System.out.println(name.equals(name));
        System.out.println(!name.equals(name));
        // zmiana wielkości liter
        String input = "q";
        System.out.println(input.toUpperCase().equals("Q"));
        System.out.println(input);
        // dzięlę zdanie na słowa
        String [] words = text.split(" ");
        // wypisuje wszystkie elementy tablicy na konsoli
        Arrays.stream(words).forEach(System.out::println);
        // Konkatenacja to nie dodawanie
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        // konkatenuje dwa napisy
        System.out.println(String.valueOf(a) + String.valueOf(b));


    }
}
