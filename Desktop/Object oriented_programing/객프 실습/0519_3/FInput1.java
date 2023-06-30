import java.io.*;

class FInput1 {
    public static void main(String[] args) {
      try {
        FileInputStream f = new FileInputStream("test.txt");
        int data = f.read();
        System.out.println((char) data);
        f.close();
      }
      catch (Exception e) {
          e.printStackTrace();
      }
    }
}
      