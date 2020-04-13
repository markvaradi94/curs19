package ro.fasttrackit.curs19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainStandard {
    public static void main(String[] args) {
        arrayOperation(elem -> "element: " + elem);
        arrayOperation(elem -> elem + " hello");
        System.out.println();

        arrayVerification(elem -> elem % 2 == 0);
        System.out.println();
        arrayVerification(elem -> elem % 2 != 0);
        System.out.println();
        arrayVerification(elem -> elem < 3);
        System.out.println();
        consumeArray(System.out::println);
        System.out.println();
        consumeArray(elem -> System.out.println("$" + elem));

    }

    public static void arrayOperation(Function<Integer, String> transformer) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            System.out.println(transformer.apply(elem));
        }
    }

    public static void arrayVerification(Predicate<Integer> filter) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            if (filter.test(elem)) {
                System.out.println(elem);
            }
        }
    }

    public static void consumeArray(Consumer<Integer> consumer) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            consumer.accept(elem);
        }
    }
}
