import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrListTest {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("Seoul");
        lst.add("Busan");
        /*String s = lst.get(0);        
        System.out.println(s);
        lst.add(5);*/
/*        for (int i = 0; i <lst.size(); i++) {
            System.out.println(lst.get(i));
        }
        */
        Iterator iter = lst.iterator();
        while (iter.hasNext()) {
           String s = (String) iter.next();
           System.out.println(s);
        }
        
        for (String s : lst) {
            System.out.println(s);
        }
        
        
        List<Integer> intLst = new ArrayList<>();
        intLst.add(5);
        intLst.add(3);
/*        Integer a = intLst.get(0);
        int c = a;      
        int b = intLst.get(1);
        System.out.printf("c = %d, b = %d\n", c, b);
  */      
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

/*
import java.util.ArrayList;

class ArrListTest {
    public static void main(String[] args) {
        //ArrayList lst2 = new ArrayList();
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Seoul");
        lst.add("Busan");
        //lst.add(new Integer(5));
        //lst.add(3);
        //lst2.add("Seoul");
        //lst2.add("Busan");
        for (int i = 0; i < lst.size(); i++) {
          //  String s2 = (String) lst2.get(i);
            String s = lst.get(i);
            //System.out.println(o.toString());
           // String s = (String) o;
            //s.substring()
            if o instanceof String {
               String s= (String) o;
            }
            else if o instanceof Integer {
            }
            
        }
    }
}*/