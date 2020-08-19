package kopach.edu.course.controller.rest;/*
 @author Vladyslav Zaichenko
 @since 08 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// викидає джийсон на виході
@RestController
public class HelloRestController {
    @RequestMapping("/hello")
        String showHello(){
            return "<h1>Hello from controller</h1>";
        }
}
