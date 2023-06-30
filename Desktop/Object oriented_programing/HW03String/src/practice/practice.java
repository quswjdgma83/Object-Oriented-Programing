package practice;

public class practice {
    static long factorial(int n){
        if(n==0) { return 1;}
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        long r = factorial(5);
        System.out.println(r);
    }
}
