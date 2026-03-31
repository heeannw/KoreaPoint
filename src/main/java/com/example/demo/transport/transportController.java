package com.example.demo.transport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class transportController {

    @GetMapping("/transport")
    public String transport() {
        return "transport/transport";
    }
}
