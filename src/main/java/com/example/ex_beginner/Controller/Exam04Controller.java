package com.example.ex_beginner.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {

    @RequestMapping("")
    public String index(){
        return "exam03";
    }
}
