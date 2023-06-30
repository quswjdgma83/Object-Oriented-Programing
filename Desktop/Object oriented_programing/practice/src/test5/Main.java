package test5;

abstract class Animal {
    abstract void eat();
    abstract void move();
}

class Dog extends Animal{
    void eat() {
        System.out.println("개가먹음");
    }
    void move() {
        System.out.println("개가 움직임");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("고양이가 먹음");
    }

    void move() {
        System.out.println("고양이가 움직임");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.eat();
        myDog.move();

        myCat.eat();
        myCat.move();

        String[] kings = {"안녕","하세","요","난","변정흠","입니다."};
        for(String name:kings) {
            System.out.println(name);
        }
    }
}