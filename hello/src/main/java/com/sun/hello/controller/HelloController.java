package com.sun.hello.controller;


import com.sun.hello.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(String nickname,String phone){

        return "hellodada wddawd aw d"+nickname+phone;
    }
    @PostMapping("/post")
    public String post(String name,String password){
        System.out.println("name:"+name);
        System.out.println("password:"+password);
        return "post";
    }
    @PostMapping("/post2")
    public String post2(User user){
        System.out.println(user);
        return "post2";
    }
//    json类型
    @PostMapping("/post3")
    public String post3(@RequestBody User user){
        System.out.println(user);
        return "post2";
    }
}
