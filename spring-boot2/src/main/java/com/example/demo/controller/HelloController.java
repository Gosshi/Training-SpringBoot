package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    // httpのGETリクエストを受け付ける
    @GetMapping("/")
    public String greeting(){
        return "hello";
    }

    @GetMapping("/greeting")
    // @RequestParam リクエストの値を取得できる
    // デフォルトで値が必須であることに注意
    public String greeting(@RequestParam(required = false) String message, Model model){
        //取得した値をThymeleafに渡す(名前、値)
        model.addAttribute("sample",message);
        return "hello";
    }

}
