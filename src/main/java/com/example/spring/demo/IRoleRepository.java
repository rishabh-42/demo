package com.example.spring.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;


@Repository
public interface IRoleRepository extends CrudRepository<Details , Integer> {

    // By defauly -> All the method of crud repository are here.
    // Add your custom methods here



}
