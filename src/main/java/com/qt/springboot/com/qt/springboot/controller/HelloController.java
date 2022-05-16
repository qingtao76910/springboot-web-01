package com.qt.springboot.com.qt.springboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/banner.jpg")
    public String get(){
        return "hello,controller";
    }
@PutMapping("/user")
public String getUser(){
    return "put";
}
@GetMapping("/car/{id}/owner/{name}")
    public Map<String,Object> getMap(@PathVariable("id") Integer id,@PathVariable("name") String name){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        return map;
    }
}


