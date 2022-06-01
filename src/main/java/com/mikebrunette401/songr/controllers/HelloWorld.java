package com.mikebrunette401.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;
@Controller
public class HelloWorld {
    @GetMapping("/sayhello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        String upperName = name.toUpperCase(Locale.ROOT);
        return "Hello " + upperName;

    }
    @GetMapping("hello")
    public String helloWorld(){
        return "helloWorld";
    }

}
