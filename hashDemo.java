import java.util.*;

public class hashDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> std = new HashMap<>();
        // Insertion
        std.put(501, "Khushi");
        std.put(101, "Rahul");
        std.put(111, "Raju");
        System.out.println(std);
        std.put(501, "Arman");
        std.put(501, "Ram");
        std.put(501, "Akash");
        System.out.println(std);
        // Searching
        if (std.containsKey(1010)) {
            System.out.println("key Found");
        } else {
            System.out.println("Key not exits");
        }
        System.out.println(std.get(111));
        for (Map.Entry<Integer, String> i : std.entrySet()) {
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

        Set<Integer> Keys = std.keySet();
        for (int i : Keys) {
            System.out.println(i + " " + std.get(i));
        }
        // Remove Element
        std.remove(101);
        System.out.println(std);
    }
}


