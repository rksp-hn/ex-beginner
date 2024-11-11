package com.example.ex_beginner.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

    @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String inputData(){
        return "exam03";
    }
    @RequestMapping("/calc")
    public String calc(){
        Integer itemPrice1 =0;
        Integer itemPrice2 =0;
        Integer itemPrice3 =0;
        itemPrice1 = (Integer)application.getAttribute("itemPrice1");
        itemPrice2 = (Integer)application.getAttribute("itemPrice2");
        itemPrice3 = (Integer)application.getAttribute("itemPrice3");
        
        Integer sum = itemPrice1 + itemPrice2 + itemPrice3;
        Integer tax = sum / 10;
        Integer sumIncTax = sum + tax;
        application.setAttribute("sum", sum);
        application.setAttribute("sumIncTax", sumIncTax);

        application.setAttribute("itemPrice1", itemPrice1);
        application.setAttribute("itemPrice2", itemPrice2);
        application.setAttribute("itemPrice3", itemPrice3);


        return "exam03-result";
    }
}
