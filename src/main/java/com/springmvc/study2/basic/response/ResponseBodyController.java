package com.springmvc.study2.basic.response;

import com.springmvc.study2.basic.HelloData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class ResponseBodyController {

    @GetMapping("response-body-string-v1")
    public void responseBodyStringV1(HttpServletResponse response) throws Exception {
        response.getWriter().write("ok");
    }

    @GetMapping("response-body-string-v2")
    public ResponseEntity<String> responseBodyStringV2() throws Exception {
        return ResponseEntity.ok("ok");
    }

    @ResponseBody
    @GetMapping("response-body-string-v3")
    public String responseBodyStringV3() throws Exception {
        return "ok";
    }


    @GetMapping("response-body-json-v1")
    public ResponseEntity<HelloData> responseBodyJsonV1() throws Exception {
        HelloData helloData = new HelloData();
        helloData.setUsername("userA");
        helloData.setAge(20);
        return ResponseEntity.ok(helloData);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK) // 상태코드 지정
    @GetMapping(value = "response-body-json-v2",consumes = MediaType.APPLICATION_JSON_VALUE)
    public HelloData responseBodyJsonV2() throws Exception {
        HelloData helloData = new HelloData();
        helloData.setUsername("userA");
        helloData.setAge(20);
        return helloData;
    }


}
