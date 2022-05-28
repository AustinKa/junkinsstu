package com.example.junkinsstu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guixiao
 * @className DemoController
 * @description TODO
 * @date 2022/5/28 14:16
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/oracle")
    public String list(){
        return "12112测试21";
    }
}
