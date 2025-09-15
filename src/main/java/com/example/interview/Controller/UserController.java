package com.example.interview.Controller;

import com.example.interview.Model.UserVO;
import com.example.interview.Service.UserServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "User API", description = "회원 관련 API")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping()
    private void save(UserVO userVO){
        userServiceImpl.save(userVO);
    }
}
