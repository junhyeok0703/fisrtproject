package com.example.fisrtproject.controller;


import com.example.fisrtproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleCdbontroller {
    @GetMapping("/articles/new")
            public String newArticleForM(){
                return "articles/new";
            }
    @PostMapping("/articles/create")
    public String createAricle(ArticleForm form){ //파라미터 중요
        System.out.println(form.toString());
        return "";
    }
}
