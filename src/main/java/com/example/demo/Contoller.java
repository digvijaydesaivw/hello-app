package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Contoller {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
