package lect4;

public class ArrayOperations {
    public static void main(String[] args) {
        // pusta tablica
        int size = 10;
        int [] numbers = new int[size];
        for (int i : numbers) {
            System.out.println(i);
        }
        String [] names = new String[size];
        // przypisanie wartości do indeksu
        names[4] = "Michał";
        System.out.println(names[4]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
