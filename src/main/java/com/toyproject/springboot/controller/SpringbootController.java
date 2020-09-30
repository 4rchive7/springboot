package com.toyproject.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringbootController {

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    @ResponseBody
    @RequestMapping(value="/respTest")
    public String respTest(){
        return "test..l";
    }


    @RequestMapping(value="/mappingHtmlTest")
    public String mappingHtml(){
        System.out.println(String.format("[%s] is called on server", getMethodName()));
        System.out.println(String.format("[%s] is closed on server", getMethodName()));
        return "mappingHtml.html";
    }

}
