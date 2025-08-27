package com.example.interview.common;

public class StringClass {
    public static void main(String[] args) {

        int iterations = 10000;

        // 1. String concat
        long startString = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";  // 매번 새 객체 생성
        }
        long endString = System.nanoTime();
        System.out.println("String concat time: " + (endString - startString) / 1_000_000 + " ms");

        // 2. StringBuffer append
        long startBuffer = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");  // 같은 객체에 문자열 추가, 동기화된 상태
        }
        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer append time: " + (endBuffer - startBuffer) / 1_000_000 + " ms");

        // 3. StringBuilder append
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("a");  // 같은 객체에 문자열 추가, 비동기
        }
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder append time: " + (endBuilder - startBuilder) / 1_000_000 + " ms");

        // 문자열 길이 확인
        System.out.println("String length: " + str.length());
        System.out.println("StringBuffer length: " + sb.length());
        System.out.println("StringBuilder length: " + sbuilder.length());
    }
}
