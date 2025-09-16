package com.example.interview.Service;

import com.example.interview.Model.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public void save(UserVO userVO){

        try {
            System.out.println("ID : " + userVO.getUserId());
            System.out.println("PW : " + userVO.getUserPw());
            System.out.println("Name : " + userVO.getUserName());
            System.out.println("Age : " + userVO.getAge());
            System.out.println("Gender : " + userVO.getGender());
            System.out.println("Address : " + userVO.getAddress());
            System.out.println("PhoneNum : " + userVO.getPhoneNum());

            //TODO db 연동 및 쿼리 작성
            //TODO try with resource 적용해보기

        } catch(Exception e) {
            e.getStackTrace();
        }

    }
}
