package lect1;
// psvm -> metoda główna: public static void main(String[] args)
// CTRL + / -> komentarz liniowy
// sout -> System.out.println();
// CTRL + D -> duplikowanie linii
public class Introduction {
    public static void main(String[] args) {
        // liczby całkowite
        // deklaracja -> zarezerowanie miejsca w pamięci
        int number;
        // przypisanie wartości
        number = 123;
        // deklaracja i inicjalizacja
        short smallNumber = 23488;
        // edycja
        smallNumber = -12;
        System.out.println(number);
        System.out.println(smallNumber);

        // znaki
        char exampleSign1 = 'a';
        char exampleSign2 = 'A';
        char exampleSign3 = '\n';

        System.out.print(exampleSign1);
        System.out.print(exampleSign2);
        System.out.print(exampleSign3);
        System.out.println("END");

        System.out.println(exampleSign1 == exampleSign2);
//      rzutowanie int na char
        System.out.println((char)(exampleSign1 + 1));
        System.out.println((char)(118));
        System.out.println((int)'v');
        
        // typ logiczny
        boolean status = true;
        System.out.println("status = " + status);

        // przekazywanie wartości
        int num1 = 1;
        int num2 = 2;
        num1 = 0;
        num2 = num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 = 5;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // przy przypisywaniu do zmiennej innej zmiennej przekazywana jest tylko wartość

        // jaki wynik?
        int x1 = 1;
        int x2 = 4;
        System.out.println("Wynik zawężony: " + (x1/x2));  // int / int -> int
        System.out.println("Wynik rozszeżony: " + ((double)x1/x2));  // double / int -> double


    }
}
