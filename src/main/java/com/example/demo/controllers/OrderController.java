package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class OrderController {

    @GetMapping("/orda")
    public String view(Model model, HttpServletResponse response) throws InterruptedException {
        model.addAttribute("model", "aawwwasddads sa asd aaaaa vv");
        model.addAttribute("modweel", "reee");
        return "pages/order";
    }

}
