import java.util.ArrayList;

class Prac11_03 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 != 0) {
                lst.add(i);
            }
        }
        
        int sum = 0;
        for (Integer n : lst) {
            System.out.println(n);
            sum += n;
        }
        System.out.println(sum);
    }
}