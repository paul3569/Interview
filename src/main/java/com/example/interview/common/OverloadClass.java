package com.example.interview.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OverloadClass {
    public static void main(String[] args) {

        // 메서드1 호출
        print("메서드1 호충");

        // 메서드2 호출
        print(2);

        // 메서드3 호출
        List<String> list = new ArrayList<String>();
        list.add("메서드3-1 호출");
        list.add("메서드3-2 호출");
        list.add("메서드3-3 호출");
        print(list);

        // 메서드4 호출
        Map<String ,String> map = new HashMap<String, String>();
        map.put("key1", "메서드4-1 호출");
        map.put("key2", "메서드4-2 호출");
        map.put("key3", "메서드4-3 호출");
        map.put("key4", "메서드4-4 호출");
        print(map);

    }


    // 메서드 1
    public static void print(String str1){
        System.out.println("print method1");
        System.out.println("param : " + str1);
    }

    // 메서드 2
    public static void print(int i){
        System.out.println("print method2");
        System.out.println("param : " + i);
    }

    // 메서드 3
    public static void print(List<String> strList){
        System.out.println("print method3");
        for(String str : strList){
            System.out.println("param : " + str);
        }
    }

    // 메서드 4
    public static void print(Map<String, String> map){
        System.out.println("print method4");
        for(String key : map.keySet()){
            System.out.println("param : " + map.get(key));
        }

    }
}
