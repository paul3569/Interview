package com.example.interview.common;

public class TryWithReourcesClass {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.doSomething();
            System.out.println("이 부분은 try 블록 내부");
            // Exception 강제 발생
            throw new Exception("Exception 강제 발생");
        } catch (Exception e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
        System.out.println("try-with-resources 블록 종료 후");
    }
}

class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("Resource: 자원 열림");
    }

    public void doSomething() {
        System.out.println("Resource: 자원 사용 중");
    }

    // Exception 발생 시 close() 메서드가 자동으로 실행되고 해당 exception 의 catch 문으로 이동
    @Override
    public void close() {
        System.out.println("Resource: 자원 닫힘 (close() 호출됨)");
    }
}