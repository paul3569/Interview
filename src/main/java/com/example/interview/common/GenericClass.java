package com.example.interview.common;


//TODO : 김영한 강의 듣기
public class GenericClass {

    // 2. 제네릭 메서드
    public static <T> void print(T obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        // 타입 변수를 String형으로 선언
        Generic<String> gString = new Generic<>();

        gString.set("String value 삽입");
        System.out.println("출력 1 [gString.get] : " + gString.get());


        // 타입 변수를 int형으로 선언
        Generic<Integer> gInt = new Generic<>();

        gInt.set(12345);
        System.out.println("출력 2 [gInt.get()] : " + gInt.get());


    }

}

// 1. 제네릭 클래스
// <T>는 타입 변수
class Generic<T>{

    // 입력받은 타입으로 value 지정
    private T value;
    // set 메서드 생성(입력받은 타입으로 value를 set하기)
    void set(T value){ this.value = value; }
    // get 메서드 생성(입력 데이터 리턴)
    T get(){ return value; }

}


