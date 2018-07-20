package com.example.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@RestController
public class DetailsDemo {

    @Autowired
    private RolesService rolesService;

    @RequestMapping("/getAllRows")
    public List<Details> getAllRoles()
    {

        return  rolesService.getAllRoles();



    }


    @RequestMapping("/getAllRowsView")
    public ModelAndView getData()
    {
        ModelAndView model = new ModelAndView("view");

        List<Details> list = rolesService.getAllRoles();


        System.out.println(1+2);
        model.addObject("data",list);
        return model;
    }

  //




}
