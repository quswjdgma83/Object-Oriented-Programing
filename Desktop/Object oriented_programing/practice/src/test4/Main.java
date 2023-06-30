package test4;
interface Animal {
    void eat();
}

abstract class Mammal implements Animal {
    abstract void move();
}

class Dog extends Mammal {
    public void eat() {
        System.out.println("개가 먹기 시작했다.");
    }
    public void move() {
        System.out.println("개가 움직이기 시작했다.");
    }
    public void bark() {
        System.out.println("개가 짖기 시작했다.");
    }
}
public class Main {
    public static void main(String[] args) {
        Mammal myDog = new Dog();
        myDog.eat();
        myDog.move();
    }
}
