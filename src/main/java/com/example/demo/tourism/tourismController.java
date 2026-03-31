package com.example.demo.tourism;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tourismController {

    @GetMapping("/tourism")
    public String tourism() {
        return "tourism/tourism";
    }
}
