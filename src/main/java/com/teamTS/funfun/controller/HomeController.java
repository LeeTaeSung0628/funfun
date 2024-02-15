package com.teamTS.funfun.controller;

import com.teamTS.funfun.model.TestModel;
import com.teamTS.funfun.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private TestRepository testRepository;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("data", "Home!!");
        return "home/homeView";
    }

    @GetMapping("/hello")
    public String HelloWorld(Model model) {
        List<TestModel> tm = testRepository.getTestData();
        model.addAttribute("data", tm.get(0).getTitle());
        return "home/homeView";
    }

}