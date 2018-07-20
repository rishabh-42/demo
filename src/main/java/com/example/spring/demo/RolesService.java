package com.example.spring.demo;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolesService

{
    @Autowired // Di
    private IRoleRepository iRoleRepository;


    public List<Details> getAllRoles() {

        List<Details> list = new ArrayList<Details>();



        iRoleRepository.findAll().forEach((e)->list.add((e)));

        return list;



    }


    //save data
    public void insert(Details details)
    {
        iRoleRepository.save(details);
    }



    //custom selct method implementation

    public Details findByUsername (String username)
    {
        return  iRoleRepository.findByUsername(username);

    }


}
