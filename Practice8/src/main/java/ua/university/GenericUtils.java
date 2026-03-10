package ua.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericUtils {
    // Повертає перший елемент або null
    public static <T> T firstOrNull(List<T> list) {
        return (list == null || list.isEmpty()) ? null : list.get(0);
    }

    // Сума чисел
    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) total += n.doubleValue();
        return total;
    }

    // Додає дефолтні ID (наприклад, 0, 1, 2)
    public static void addDefaultIds(List<? super Integer> list) {
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("A", "B", "C");
        System.out.println("firstOrNull: " + firstOrNull(strings));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        System.out.println("sum: " + sum(numbers));

        List<Number> ids = new ArrayList<>();
        addDefaultIds(ids);
        System.out.println("ids: " + ids);
    }


}
