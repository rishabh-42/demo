package com.example.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;


@Controller
public class controller {

    @RequestMapping("/shubham/{lastname}")
    @ResponseBody
    public String getString (@PathVariable String lastname )
    {
        return lastname;

    }



    @RequestMapping("/get-view")
    public ModelAndView getView()
    {

        ModelAndView model = new ModelAndView("view");
        model.addObject("welcome","swagat hai");
        return model;


    }

    @ModelAttribute
    public Model addObject (Model model)
    {
        model.addAttribute("test","value");
    return model;

    }


    @RequestMapping("/get-list")
    public ModelAndView getList()
    {

        List<String> list = new ArrayList<>();

        list.add("Rishabh");
        list.add("Rajput");

        ModelAndView model = new ModelAndView("view");
        model.addObject("list",list);

        return model;
    }




}
