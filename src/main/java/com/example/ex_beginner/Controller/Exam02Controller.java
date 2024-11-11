package com.example.ex_beginner.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {
    
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String inputNum(){
        return "exam02";
    }
    @RequestMapping("/calc")
    public String calc(int num1, int num2){
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        int sum = num1 + num2;
        session.setAttribute("sum", sum);
        return "exam02-result";
    }
    @RequestMapping("/to-page1")
    public String toPage1(){
        return "exam02-result";
    }
    @RequestMapping("/to-page2")
    public String toPage2(){
        return "exam02-result2";
    }
}
