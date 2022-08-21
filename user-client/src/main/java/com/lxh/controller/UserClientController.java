package com.lxh.controller;

import com.lxh.entity.User;
import com.lxh.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserClientController {

    @Autowired
    FeignService feignService;

    @GetMapping("/clientHello")
    public String clientHello(){
        return feignService.callServiceHello();
    }

    @GetMapping("/printUserNameAndPassword")
    public String printUserNameAndPassword(){
        return feignService.callUserServicePrintUserNameAndPassword("张三","123456");
    }

    @GetMapping("/restful/{userName}/{age}")
    public String restful(@PathVariable String userName, @PathVariable Integer age){
        return feignService.callUserRestful(userName,age);
    }

    @GetMapping("/entityParam")
    public String entityParam(){
        User user = new User();
        user.setUserName("张三");
        user.setId(1l);
        return feignService.callUserServiceEntityParam(user).toString();
    }


}
