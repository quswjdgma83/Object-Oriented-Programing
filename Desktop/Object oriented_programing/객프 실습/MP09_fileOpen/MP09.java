import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
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
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        // BufferedReader 객체를 null로 초기화합니다.

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\201810879\\Desktop\\작년 객프 기출\\FinalCode\\out\\production\\FinalCode\\Prac2\\example.txt\\"));
            // FileReader를 이용하여 "example.txt" 파일을 읽고,
            // 그 결과를 BufferedReader에 넣어 효율적으로 처리할 수 있도록 합니다.

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // readLine 메소드를 이용하여 한 줄씩 읽어들이며,
                // 각 줄을 콘솔에 출력합니다.
                // 파일의 끝에 도달하면 readLine은 null을 반환하므로,
                // 이를 이용하여 파일의 끝을 확인합니다.
            }
        } catch (IOException e) {
            e.printStackTrace();
            // 파일 입출력 과정에서 IOException이 발생하면 이를 콘솔에 출력합니다.
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    // 모든 작업이 끝난 후에는 BufferedReader를 닫아줍니다.
                    // 이는 자원을 정리하고 더 이상 사용되지 않는 파일 핸들을
                    // 운영체제에 반환하기 위한 것입니다.
                } catch (IOException e) {
                    e.printStackTrace();
                    // BufferedReader를 닫는 과정에서 IOException이 발생하면 이를 콘솔에 출력합니다.
                }
            }
        }
    }
}