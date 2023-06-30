package ArrayListTest;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();

        arrayList.add("안녕");
        arrayList.add("안녕2");

        System.out.println(arrayList.get(1));
    }
}