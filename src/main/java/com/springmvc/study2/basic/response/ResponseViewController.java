package com.springmvc.study2.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @GetMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView modelAndView = new ModelAndView("/hello")
                .addObject("data", "hello!");
        return modelAndView;
    }

    @GetMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!2");
        return "/hello";
    }

    // 비권장 명시성이 내려간다
    // url에 따라서 뷰를 찾음
    @GetMapping("/hello")
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!3");
    }



}
