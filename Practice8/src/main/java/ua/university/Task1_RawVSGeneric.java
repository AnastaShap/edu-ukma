package ua.university;

import java.util.ArrayList;
import java.util.List;

public class Task1_RawVSGeneric {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123);

        String s1 = (String) rawList.get(0); // Потрібен каст або буде ClassCastException для числа

        // Використання generics
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        // stringList.add(123); // помилка компіляції

        for (String s : stringList) {
            System.out.println(s); // без кастів
        }

        // Generics дозволяють уникнути помилок часу виконання,
        // забезпечуючи перевірку типів на етапі компіляції.

    }

}
