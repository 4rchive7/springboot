package com.toyproject.springboot.controller;

import com.toyproject.springboot.service.TestService;
import com.toyproject.springboot.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SpringbootController {

    @Autowired
    TestService testService;

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    @ResponseBody
    @RequestMapping(value = "/respTest")
    public String respTest() {
        return "test..l";
    }


    @RequestMapping(value = "/mappingHtmlTest")
    public String mappingHtml() {
        System.out.println(String.format("[%s] is called on server", getMethodName()));
        System.out.println(String.format("[%s] is closed on server", getMethodName()));
        return "mappingHtml.html";
    }

    @RequestMapping(value = "/jsp")
    public ModelAndView mappingJSP() throws Exception {
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


    @RequestMapping(value = "/bringData")
    public ModelAndView bringData() throws Exception {
        ModelAndView mav = new ModelAndView("mapperTest");
        List<TestVo> testList = testService.bringData();
        mav.addObject("list", testList);
        return mav;
    }

}
