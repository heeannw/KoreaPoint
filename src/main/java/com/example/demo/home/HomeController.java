package com.example.demo.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 이 부분이 있는지 꼭 확인해 주세요!
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home/home"; // 방금 전까지 작업하신 home.html을 띄우는 역할
    }
}