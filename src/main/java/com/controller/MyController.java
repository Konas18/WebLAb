package com.controller;

import com.dto.*;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class MyController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/user/list", method = RequestMethod.GET)
    public List<User> getUserList(){
        return userService.getList();
    }

    @RequestMapping(value = "/user/find", method = RequestMethod.POST)
    public GetUserByIdRsDto getById(@RequestBody GetUserByIdRqDto getUserByIdRqDto){
        return userService.getById(getUserByIdRqDto.getId());
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public LoginRsDto Verification(@RequestBody LoginRqDto loginRqDto){
        return userService.Verification(loginRqDto);
    }

    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
    public RegistrationRsDto Verification(@RequestBody RegistrationRqDto registrationRqDto){
        return userService.Registration(registrationRqDto);
    }

//    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
//    public CreateUserRsDto createUser(@RequestBody CreateUserRqDto createUserRqDto){
//        return userService.create(createUserRqDto);
//    }

}
