package com.hackerrank.sample.controller;


import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.sample.model.Employees;
import com.hackerrank.sample.model.Model;
import com.hackerrank.sample.repository.ModelRepository;
import com.hackerrank.sample.repository.S;


@RestController
public class ModelController {


private final ModelRepository repository;

  ModelController(ModelRepository repository) {
    this.repository = repository;
  }

 
  @GetMapping("/sample/employee.json")
  List<Model> all() {
    return repository.findAll();
  }

  @PostMapping("/sample/employee.json")
  <Employees> Employees newEmployee(@RequestBody Employees newEmployee) {
   
	  return repository.save(newEmployee);
  }
}