package com.example.interview.common;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashClass {

    public static void main(String[] args) {

        // HashMap<key, value>
        // 순서 보장 X
        // 가벼움
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);

        // keySet : key들의 집합
        for(String key : hashMap.keySet()){
            System.out.println("HashMap print !!! [key : " + key + ", value : " + hashMap.get(key)+"]");
        }

        // LinkedHashMap<key, value>
        // 순서 보장
        // 조금 더 무거움
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("four", 4);
        linkedHashMap.put("five", 5);

        // keySet : key들의 집합
        for(String key : linkedHashMap.keySet()){
            System.out.println("LinkedHashMap print !!! [key : " + key + ", value : " + linkedHashMap.get(key)+"]");
        }


        // HashSet<value>
        // 순서 보장 X
        // 가벼움
        // 중복, NULL 허용 X
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("HashSet print All !!! : " + set);

        for(int i : set){
            System.out.println("HashSet print !!! [value : " + i +"]");
        }

        // ConcurrentHashMap<key, value>
        // 순서 보장 X
        // null 값 X
        // 높은 동시성 지원으로 멀티스레드 환경에 최적
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("one", 1);
        concurrentHashMap.put("two", 2);
        concurrentHashMap.put("three", 3);
        concurrentHashMap.put("four", 4);
        concurrentHashMap.put("five", 5);

        for(String key : concurrentHashMap.keySet()){
            System.out.println("ConcurrentHashMap print !!! [key : " + key + ", value : " + concurrentHashMap.get(key)+"]");
        }

    }

}