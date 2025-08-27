package com.example.interview.common;

public class ConstructorClass {
    public static void main(String[] args) {


        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor("input Str2", 2);
        Constructor constructor3 = new Constructor("input Str3", 3, true);

        System.out.println("============ constructor1 ==========");
        System.out.println("String value : " + constructor1.getStringValue() +
                ", Integer value : " + constructor1.getIntegerValue() +
                ", boolean value : " + constructor1.getBooleanValue());
        System.out.println("====================================");

        System.out.println("============ constructor2 ==========");
        System.out.println("String value : " + constructor2.getStringValue() +
                ", Integer value : " + constructor2.getIntegerValue() +
                ", boolean value : " + constructor2.getBooleanValue());
        System.out.println("====================================");

        System.out.println("============ constructor3 ==========");
        System.out.println("String value : " + constructor3.getStringValue() +
                ", Integer value : " + constructor3.getIntegerValue() +
                ", boolean value : " + constructor3.getBooleanValue());
        System.out.println("====================================");
    }
}

class Constructor{

    String str;
    int i;
    boolean check;


    // 생성자 오버로딩
    public Constructor(){};

    public Constructor(String str, int i){
        this.str = str;
        this.i = i;
    }

    public Constructor(String str, int i, boolean check){
        this.str = str;
        this.i = i;
        this.check = check;
    }

    public String getStringValue(){
        return str;
    }

    public int getIntegerValue(){
        return i;
    }

    public boolean getBooleanValue(){
        return check;
    }
}
