package lect4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class QueueOperations {
    public static void main(String[] args) {
        Deque<String> messages = new ArrayDeque<>();
        // FIFO
        // wiadomości przychodzące na koniec kolejki
        messages.addLast("pierwsza");
        System.out.println(messages);
        messages.addLast("druga");
        System.out.println(messages);
        messages.addLast("trzecia");
        System.out.println(messages);
        messages.addLast("czwarta");
        System.out.println(messages);
        // wiadomości obsługiwane z początku kolejki
        System.out.println("Obsłużono: " + messages.removeFirst());
        System.out.println(messages);
        System.out.println("Obsłużono: " + messages.removeFirst());
        System.out.println(messages);
        System.out.println("Obsłużono: " + messages.removeFirst());
        System.out.println(messages);
        System.out.println("Obsłużono: " + messages.removeFirst());
        System.out.println(messages);

        // FILO
        Deque<String> commits = new ArrayDeque<>(Arrays.asList("C1","C2","C3"));
        System.out.println(commits);
        commits.removeLast();
        System.out.println(commits);
        commits.removeLast();
        System.out.println(commits);
        commits.removeLast();
        System.out.println(commits);
//        commits.removeLast();       NoSuchElementException
//        System.out.println(commits);
    }
}
