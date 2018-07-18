package com.example.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class formController {

    @RequestMapping(value = "/myForm" ,method = RequestMethod.GET)
    public ModelAndView getNew ()
    {
        ModelAndView model = new ModelAndView("form-demo");
        model.addObject("response",new ResponseData());
        return model;

    }

    @RequestMapping(value = "/myForm" ,method = RequestMethod.POST)
    @ResponseBody
    public String getNew (@ModelAttribute ResponseData response)
    {


        System.out.println(response.getName());
        return "model";

    }

}
