package com.liangyi.controller;

import com.liangyi.pojo.Dog;
import com.liangyi.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("json")
public class JsonController {

    @GetMapping("dog")
    @ResponseBody
    public Dog getDog(){
        Dog dog = new Dog("Mike", 12, "write");
        return dog;
    }

    @PostMapping("student")
    @ResponseBody
    public Student returnStu(@RequestBody Student student){

        System.out.println(student);
        return student;
    }

    @GetMapping("listDog")
    @ResponseBody
    public List<Dog> getListDog(){
        Dog dog = new Dog("Mike", 12, "write");
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        return dogs;
    }
}
