package com.example.interview.common;

public class OverrideClass {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.print();

        System.out.println("==================================");

        Child child1 = new Child();
        child1.print();

        System.out.println("==================================");

        Parent child2 = new Child();
        child2.print();

    }
}

class Parent {

    // 생성자
    public Parent(){
        System.out.println("부모 클래스 생성자");
    };

    void print(){
        System.out.println("부모 클래스에서 선언");;
    }

}

class Child extends Parent {

    public Child(){
        System.out.println("자식 클래스 생성자");
    }

    @Override
    void print(){
        System.out.println("자식 클래스에서 재정의");
    }
}
