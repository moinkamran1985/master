package com.example.moinrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TestController {

    @Autowired
    TestRepository testRepository;

    @RequestMapping("/test/{id}")
    public City test(@PathVariable Integer id){

        System.out.println("hi");
        Optional<City> city = testRepository.findById(id);

        return city.get();

    }
}
