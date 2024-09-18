package com.housely.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HouselyController {
    @GetMapping("/")
    @ResponseBody
    public String getMethodName() {
        return "Hello World";
    }
    
    
}
