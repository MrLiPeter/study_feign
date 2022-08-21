package com.lxh.controller;

import com.lxh.entity.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserServiceController {

    @GetMapping("/hello")
    public String hello(){
        return "hello! Feign";
    }

    @PostMapping("/printUserNameAndPassword")
    public String printUserNameAndPassword(String userName,String password){
        StringBuilder builder = new StringBuilder();
        builder.append("userName：").append(userName).append("\t").append("password:").append(password);
        return builder.toString();
    }

    @GetMapping("/restful/{userName}/{age}")
    public String restful(@PathVariable String userName,@PathVariable Integer age){
        return userName + "-"+age+"岁";
    }

    @PostMapping("/entityParam")
    public User entityParam(@RequestBody User user){
        return user;
    }


}
