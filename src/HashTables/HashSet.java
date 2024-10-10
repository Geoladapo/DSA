package HashTables;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();
        int[] numbers = {1, 2, 3, 2, 1, 4};
        for (var number : numbers) {
            set.add(number);
        }
        System.out.println(set);
    }
}
