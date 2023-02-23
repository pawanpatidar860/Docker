package com.example.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test-docker")
    public String GetData(){
        return "java tutorial of Docker demo:";
    }
}