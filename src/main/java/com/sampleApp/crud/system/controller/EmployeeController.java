package com.sampleApp.crud.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sampleApp.crud.system.models.Employee;
import com.sampleApp.crud.system.repo.EmployeeRepo;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {
    @Autowired 
    EmployeeRepo employeerepo;

    @GetMapping 
    public List<Employee> getEmployees(){
        return  employeerepo.findAll();
    }
    @PostMapping 
    public Employee save(@Validated @NonNull @RequestBody Employee employee){
        return employeerepo.save(employee);
    }
    @PutMapping("/{id}")
    public Employee update(@Validated @NonNull @RequestBody Employee employee){
        return employeerepo.save(employee);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id) {
        employeerepo.deleteById(id);
    }
}
