package com.springmvc.study2.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

    @GetMapping("/log-test")
    public String test() {
        log.info("안녕");

        return "ok";
    }
}
