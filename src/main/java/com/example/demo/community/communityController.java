package com.example.demo.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class communityController {

    @GetMapping("/community")
    public String community() {
        return "community/community";
    }
}
