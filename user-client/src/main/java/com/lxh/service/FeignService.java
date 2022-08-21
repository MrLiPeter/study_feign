package com.lxh.service;

import com.lxh.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("USER-SERVICE")
public interface FeignService {
    /**
     * 方法要求:
     *  返回参数:和远程方法对应(其实能转换的话不对应也可以)
     *  参数:要与远程方法一致
     *  方法名: 随意
     *  请求方式:要与远程方法一致
     *  请求路径:远程接口路径
     */
     @GetMapping("/hello")
     String callServiceHello();

    /**
     * 通过@Requstparam注解传递表单参数，如果变量名和远程方法一致可以不写name，否则就得这样写@Requstparam("userName")
     */
    @PostMapping("/printUserNameAndPassword")
    String callUserServicePrintUserNameAndPassword(@RequestParam("userName") String username,@RequestParam String password);

    @GetMapping("/restful/{userName}/{age}")
    String callUserRestful(@PathVariable String userName, @PathVariable Integer age);

    /**
     * 隐式的添加了@ResquestBody注解,Feign中最多只能有一个不加注解的参数
     */
    @PostMapping("/entityParam")
    User callUserServiceEntityParam(User user);



}
