package com.example.interview.Model;

import lombok.Getter;
import lombok.Setter;


// lombok 라이브리러. 어노테이션으로 Getter, Setter 자동 생성
@Getter
@Setter
// MVC 패턴의 Model을 담당하는 class로, 데이터와 비지니스 로직을 담당하며, View 또는 Controller에 의존하지 않는다.
// UserVO의 경우 데이터를 담는 바구니의 역할을 한다.
public class UserVO {
    private String userId;
    private String userPw;
    private String userName;
    private int age;
    private char gender;
    private String phoneNum;
    private String address;
}

// 참고
// 데이터 타입이 class인 변수를 선언하여 사용하고 class 자체가 변수가 되기 때문에 유연하고 객채지향적인 형태다
