package com.youzhong.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @RequestMapping("index")
    public String index(Model model){
    	System.out.println("*****************************");
        return "index";
    }
}
