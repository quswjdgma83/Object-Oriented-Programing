package test6;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
