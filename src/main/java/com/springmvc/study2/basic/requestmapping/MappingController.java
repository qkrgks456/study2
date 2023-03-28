package com.springmvc.study2.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MappingController {

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String helloBasic() {
        log.info("helloBasic");
        return "ok";
    }

    @GetMapping("/hellos")
    public String mappingGet() {
        log.info("mappingGet");
        return "ok";
    }

    // /mapping/userA
    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable String userId) {
        log.info("userId = {}", userId);
        return "ok";
    }

    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
        log.info("userId = {}", userId);
        log.info("orderId = {}", orderId);
        return "ok";
    }

    @GetMapping(value = "/mapping-param", params = "mode=debug")
    public String mappingParam(@RequestParam String mode) {
        log.info("mode = {}", mode);
        return "ok";
    }

    @GetMapping(value = "/mapping-header", headers = "mode=debug")
    public String mappingHeader(@RequestHeader String mode) {
        log.info("mode = {}", mode);
        return "ok";
    }

    @PostMapping(value = "/mapping-consumes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String mappingConsumes() {
        return "ok";
    }

    // 헤더에 accept에 따라서
    @PostMapping(value = "/mapping-produces", produces = MediaType.TEXT_HTML_VALUE)
    public String mappingProduces() {
        return "ok";
    }

}
