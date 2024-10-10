package HashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Jane");
        map.put(3, "Joe");
        map.put(4, "Jack");
        map.remove(4);
        var value = map.get(4);
        System.out.println(value);
        map.containsKey(3);     //O(1)
        map.containsValue("Jane");  //O(n)
        System.out.println(map);

        // using keySet - This returns only the key
        for (var item : map.keySet()) {
            System.out.println(item);
        }

        // using entrySet - This returns key-value pairs
        for (var item : map.entrySet()) {
            System.out.println(item);
        }

        CharFinder charFinder = new CharFinder();
        var result = charFinder.findFirstNonRepeatingChar("a green apple");
        System.out.println(result);

    }
}
