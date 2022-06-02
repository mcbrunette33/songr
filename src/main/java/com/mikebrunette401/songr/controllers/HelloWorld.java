package com.mikebrunette401.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;
@Controller // "parent" responsibility for resources inside this class for paths below
public class HelloWorld {
    @GetMapping("/sayhello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        String upperName = name.toUpperCase(Locale.ROOT);
        return "Hello " + upperName;

    }
    @GetMapping("/hello") //GET route for /hello paths do not have to be the same thing as the method
    @ResponseBody //use this for response
    public String helloWorld(){
        return "helloWorld";
    }

}
