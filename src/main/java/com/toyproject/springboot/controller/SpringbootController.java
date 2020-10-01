package com.toyproject.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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

    /*@RequestMapping(value="/testMappingJsp")
    public ModelAndView jspFileName() throws Exception{
        System.out.println(String.format("[%s] is called on server", getMethodName()));
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "goddaehee");
        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        mav.addObject("list", testList);

        System.out.println(String.format("[%s] is closed on server", getMethodName()));
        return mav;
    }*/
    @RequestMapping(value="/jsp")
    public ModelAndView mappingJSP() throws  Exception{
        System.out.println(String.format("[%s] is called on server", getMethodName()));
        String destination = "mappingJSP";
        ModelAndView mav = new ModelAndView(destination); //This command determine destination
        mav.addObject("name", "objName");
        List<String> testList = new ArrayList<String>();
        testList.add("list1");
        testList.add("list2");
        testList.add("list3");
        mav.addObject("list", testList);

        System.out.println(String.format("[%s] is closed on server", getMethodName()));
        return mav;
    }

}
