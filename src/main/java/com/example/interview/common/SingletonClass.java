package com.example.interview.common;

public class SingletonClass {
    public static void main(String[] args) {

        // 일반 객체 주소값
        CommonClass commonClass1 = new CommonClass();
        System.out.println("commonClass1 adress : " + System.identityHashCode(commonClass1));
        CommonClass commonClass2 = new CommonClass();
        System.out.println("commonClass2 adress : " + System.identityHashCode(commonClass2));
        CommonClass commonClass3 = new CommonClass();
        System.out.println("commonClass3 adress : " + System.identityHashCode(commonClass3));

        // 싱글톤 객체 주소값
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("singleton1 adress : " + System.identityHashCode(singleton1));

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2 adress : " + System.identityHashCode(singleton2));

        Singleton singleton3 = Singleton.getInstance();
        System.out.println("singleton3 adress : " + System.identityHashCode(singleton3));

    }
}

class Singleton {

    // singelton instance 가 생성되어 있는지 확인하기 위한 static 변수
    private static Singleton instance = null;

    private Singleton(){

    }

    // instance를 반환하는 정적 메서드 생성
    public static Singleton getInstance(){
        // singleton 객체가 생성된 적이 있으면 생성되있는 객체를 리턴
        if(instance == null){
            // 없으면 객체생성
            instance = new Singleton();
        }
        return instance;
    };
}

class CommonClass{

}
