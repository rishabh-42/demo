package com.example.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class controller {

    @RequestMapping("/shubham/{lastname}")
    @ResponseBody
    public String getString (@PathVariable String lastname )
    {
        return lastname;

    }
}
