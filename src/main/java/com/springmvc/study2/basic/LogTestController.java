package com.springmvc.study2.basic;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class LogTestController {

    @GetMapping("/log-test")
    public String test() {
        log.info("안녕");

        return "ok";
    }
}
