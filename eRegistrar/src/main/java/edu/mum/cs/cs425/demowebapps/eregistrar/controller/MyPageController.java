package edu.mum.cs.cs425.demowebapps.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {
    @GetMapping(value = {"/", "/eregistrar/", "/eregistrar//home"})
    public String displayHomePage(){
        return "home/index";
    }

}
