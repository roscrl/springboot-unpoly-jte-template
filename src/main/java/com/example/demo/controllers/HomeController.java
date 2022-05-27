package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    // TODO order forms examples nested, see notes https://spring.io/guides/gs/validating-form-input/
    // TODO slow endpoint examples with unpoly

    @GetMapping("/")
    public String view(Model model, HttpServletResponse response) {
        model.addAttribute("model", "aawwwasddads sa asd aaaaa vv");
        return "pages/home";
    }

}
