import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);

        System.out.println(map.get("apple"));

        map.remove("apple");

        if(!map.containsKey("apple")) {
            System.out.println("사과 존재 x");
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
