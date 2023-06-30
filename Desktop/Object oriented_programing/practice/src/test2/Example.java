package test2;

class Parent {
    int parentAttribute;

    void parentMethod() {
        System.out.println("부모 메소드 실행");
    }
}

class Child extends Parent {
    int childAttribute;

    void childMethod() {
        System.out.println("자식 메소드 실행");
    }
}

public class Example {
    public static void main(String[] args) {
        // 자식 클래스의 객체 생성
        Child child = new Child();

        // 부모 클래스의 속성과 메소드에 접근
        child.parentAttribute = 10;
        child.parentMethod();
        System.out.println("부모 속성 값: " + child.parentAttribute);

        // 자식 클래스의 속성과 메소드에 접근
        child.childAttribute = 20;
        child.childMethod();
        System.out.println("자식 속성 값: " + child.childAttribute);
    }
}
