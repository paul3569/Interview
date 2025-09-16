package com.example.interview.Controller;

import com.example.interview.Model.UserVO;
import com.example.interview.Service.UserServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "User API", description = "회원 관련 API")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/save")
    private void save(@RequestBody UserVO userVO){
        userServiceImpl.save(userVO);
    }
}
