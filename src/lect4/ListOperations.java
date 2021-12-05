package lect4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                Arrays.asList("Anna","Adam","Jan")
        );
        System.out.println(names);
        for (String name : names){
            System.out.println(name);
        }
        // dodawanie obiektu do listy
        names.add("Michał");
        // modyfikowanie obiektu
        names.set(0, "Alicja");
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        // błędy adresowania
//        System.out.println(names.get(10));    IndexOutOfBoundsException
        // usunięcie elementu z listy
        names.remove(1);
        System.out.println(names);
        // sprawdzenie występowania obiektu w liście
        System.out.println(names.contains("Adam"));
        System.out.println(names.contains("Michał"));

    }
}
