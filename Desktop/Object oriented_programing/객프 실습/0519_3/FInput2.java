import java.io.*;
//한글
class FInput2 {
    public static void main(String[] args) {
      try {
        FileReader f = new FileReader("test.txt");
//        BufferedReader f = new BufferedReader(new FileReader("hello.txt"));
        int data = f.read();
        System.out.println(data);
        System.out.println((char) data);
     //   String s = f.readLine();
      //  System.out.println(s);
        f.close();
      }
      catch (Exception e) {
          e.printStackTrace();
      }
    }
}
      