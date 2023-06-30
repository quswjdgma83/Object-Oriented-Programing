package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayList {
    public static void main(String[] args) {
        List<String> lst = new java.util.ArrayList<String>();
        lst.add("Seoul");
        lst.add("Busan");

        Iterator iter = lst.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.println(s);
        }

        for (String s : lst) {
            System.out.println(s);
        }

        List<Integer> intLst = new java.util.ArrayList<>();
        intLst.add(5);
        intLst.add(3);

        iter = intLst.iterator();
        while (iter.hasNext()) {
            Integer s = (Integer) iter.next();
            System.out.println(s);
        }

        for (Integer s : intLst) {
            System.out.println(s);
        }
    }

}
