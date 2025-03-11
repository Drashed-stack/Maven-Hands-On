package com.example.demo1;  // Change this back to match your original structure

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Demo1Application {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "This is a Spring Boot Static Web Application");
        model.addAttribute("msg", "Application Is Deployed To Kubernetes");
        return "index"; // Ensure "index.html" exists in src/main/resources/templates/
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
}

