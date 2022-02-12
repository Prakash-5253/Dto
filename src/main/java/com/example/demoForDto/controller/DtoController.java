package com.example.demoForDto.controller;

import com.example.demoForDto.entity.Address;
import com.example.demoForDto.entity.Dto;
import com.example.demoForDto.entity.Student;
import com.example.demoForDto.repository.AddressRepository;
import com.example.demoForDto.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DtoController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/savedto")
    public Student saveDetails(@RequestBody Dto dto){
     //   Dto dtd=new Dto();
        Address atd=new Address();
        atd.setStreet(dto.getStreet());
        atd.setCity(dto.getCity());
        Address att=addressRepository.save(atd);
        Student std=new Student();
        std.setName(dto.getName());
        std.setAge(dto.getAge());
        std.setAddress(att);
        Student sss=studentRepository.save(std);

        return sss;
    }
    @GetMapping("/getDto/{id}")
    public Dto getById(@PathVariable("id") String id){
        Student std=studentRepository.getById(id);
        Dto dtd=new Dto();
        dtd.setName(std.getName());
        dtd.setAge(std.getAge());
        dtd.setStreet(std.getAddress().getStreet());
        dtd.setCity(std.getAddress().getCity());
return  dtd;
    }

}
