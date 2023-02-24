package com.example.fisrtproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Fisrtcontrolller {


    @GetMapping("/hi")   //접속할 url이름을 정해줘야한다.
    public String nicemeetyou(Model model) {//파라미터로 username을 받아줘야함.
        model.addAttribute("username","junhyeok");//변수등록 addattribute
        return "greetings"; //templates/greetings.mustache -> 브라우저로 전송한다.
    }

    @GetMapping("/bye")   //접속할 url이름을 정해줘야한다.
     public String goodbye(Model model) {//파라미터로 username을 받아줘야함.
         model.addAttribute("nickname","junhyeok!");//변수등록 addattribute
         return "byetings"; //templates/greetings.mustache -> 브라우저로 전송한다.
     }
}
