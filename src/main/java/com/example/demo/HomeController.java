package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping("/")
    public String listCoureses(Model model){
        model.addAttribute("courses", courseRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String coureseForm(Model model){
        model.addAttribute("course", new Course());
    }
    {
        if (result.hasErrors()){
            return "courseform";
        }
        courseRepository.save(course);
        return "redirect:/
    @PostMapping("/process")
    public String processForm@Valid Course course,
       bindingResult result";
    }

    @RequestMapping("/detail/{id}")
    public String showCourse(@PathVariable("id")
}
