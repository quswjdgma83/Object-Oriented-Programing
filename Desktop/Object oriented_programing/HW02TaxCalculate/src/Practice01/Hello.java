package Practice01;

public class Hello {
    String toWhom = "world";
    Hello() {
    }
    void setWhom(String whom) {
        toWhom = whom;
    }
    void sayHello() {
        System.out.println("Hello " + toWhom);
    }

    public static void main(String[] args) {
        Hello[] arr = new Hello[3];
        String[] whom = {"ycho", "jsl", "everyone"};
        int index = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = new Hello();
            arr[i].setWhom(whom[index]);
            index++;
        }

        for (Hello a : arr) {
            a.sayHello();
        }
    }
}
