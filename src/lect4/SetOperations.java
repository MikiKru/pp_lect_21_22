package lect4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(4,3,4,3,6,5,5,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,1,2,3,4));
        System.out.println(set1);
        System.out.println(set2);
        // dodawanie elementów
        set1.add(7);
        System.out.println(set1);
        // usuwnie elementów
        set1.remove(7);
        System.out.println(set1);
        // sprawdzenie przynależności
        System.out.println(set1.contains(7));
        System.out.println(set1.contains(3));
        // operacje na zbiorach
        Set<Integer> unionResult = new HashSet<>();
        unionResult.addAll(set1);
        unionResult.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(unionResult);
    }
}
