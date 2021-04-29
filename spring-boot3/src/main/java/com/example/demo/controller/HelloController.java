package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "form";
    }

    @PostMapping("/confirm")
    //httpのpostリクエストを受け付ける
    public String confirm(@RequestParam(required = false) String message, Model model){
        //コントローラ側で、モデルに変数messageを登録しているため、confirm.html
        //で扱うことができる
        //@RequestMappingは、GETやPOSTなどの集合体で、５種類のリクエスト
        // （GET、POST、PUT、DELETE、PATCH）を受け取ることができます。また、
        //@RequestMappingは、クラスレベルとメソッドレベルの両方で使用できます
        model.addAttribute("message",message);
        return "confirm";
    }

}
