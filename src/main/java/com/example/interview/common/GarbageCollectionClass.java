package com.example.interview.common;

public class GarbageCollectionClass {

    public static class Data {
        private int[] largeArray = new int[1000000]; // 메모리 큰 객체

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Garbage Collector가 객체를 수거합니다.");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Data data1 = new Data();  // 객체 생성
        Data data2 = new Data();  // 객체 생성

        data1 = null;  // 첫 번째 객체 참조 해제
        System.gc();   // GC 실행 요청

        System.out.println("main 메소드 종료 전");

        data2 = null;  // 두 번째 객체 참조 해제
        System.gc();   // GC 실행 요청

        System.out.println("main 메소드 종료");
    }
}

/*
1. Data 클래스는 finalize() 메서드를 오버라이드해 객체가 수거될 때 메시지를 출력합니다.
2. data1 참조를 null로 만들어 첫 번째 객체가 더 이상 참조되지 않도록 합니다.
3. System.gc()로 GC를 실행 요청하지만 GC 시점은 JVM에 따라 다릅니다.
4. 두 번째 객체도 참조 해제 후 GC를 요청합니다.
5. 콘솔에 "Garbage Collector가 객체를 수거합니다." 메시지가 출력되면 GC가 실행된 것입니다.
 */

