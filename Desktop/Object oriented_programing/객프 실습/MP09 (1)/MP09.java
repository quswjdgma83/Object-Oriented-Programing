import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MP09 {
    public static void main(String[] args) {
        try {
            Map<String, Integer> counts = new HashMap<String, Integer>();
            BufferedReader reader = new BufferedReader(new FileReader("MP09data.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] arr = line.split("[\t\n :.,;-]");
                for (String s : arr) {
                    if (!s.equals("")) {
                        if (counts.containsKey(s)) {
                            int n = counts.get(s);
                            counts.put(s, n + 1);
                        }
                        else {
                            counts.put(s, 1);
                        }
                    }
                }
                line = reader.readLine();
            }
            for (String s : counts.keySet()) {
                System.out.printf("Key: %s, count: %d\n", s, counts.get(s));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
