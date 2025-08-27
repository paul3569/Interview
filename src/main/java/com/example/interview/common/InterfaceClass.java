package com.example.interview.common;

// 인터페이스: 다양한 클래스에 동일한 동작을 강제하여 유연성과 확장성을 높임. 다중 구현 가능
public class InterfaceClass {
    public static void main(String[] args) {
        Dog_I dog = new Dog_I();
        Cat_I cat = new Cat_I();
        dog.move();
        dog.bark();
        cat.move();
        cat.bark();
    }
}


// 인터페이스 정의
interface Animal_I {
    void move();
    void eat();
    void bark();
}

// 구현 클래스
class Dog_I implements Animal_I {
    @Override
    public void move() {
        System.out.println("슥슥~~");
    }
    @Override
    public void eat() {
        System.out.println("개가 먹는다");
    }
    @Override
    public void bark() {
        System.out.println("멍멍!");
    }
}

class Cat_I implements Animal_I {
    @Override
    public void move() {
        System.out.println("사뿐사뿐~~");
    }
    @Override
    public void eat() {
        System.out.println("고양이가 먹는다");
    }
    @Override
    public void bark() {
        System.out.println("야옹~~");
    }
}

