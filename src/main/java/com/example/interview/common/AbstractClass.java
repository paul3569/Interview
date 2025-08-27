package com.example.interview.common;


// 추상클래스: 여러 클래스의 공통점을 뽑아 재사용성을 높이는 목적. 일부 동작의 기본 구현을 제공.
public class AbstractClass{
    public static void main(String[] args) {
        Dog dog = new Dog("강아지", 3);
        Cat cat = new Cat("고양이", 3);
        dog.move();
        dog.bark();
        cat.move();
        cat.bark();
    }
}

// 추상 클래스 정의
abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("이동한다");
    }

    // 추상 메서드: 자식에게 구현 강제
    public abstract void bark();
}

// 구체 클래스
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void bark() {
        System.out.println("멍멍!!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void bark() {
        System.out.println("야옹~~");
    }
}
