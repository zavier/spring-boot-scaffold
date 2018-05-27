package com.zavier.scaffold.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @Value("${amazon.sourceId}")
    private String sourceId;

    @GetMapping("/test")
    public String test() {
        log.info(sourceId);
        return "Hello";
    }

    @GetMapping("/testerror")
    public String testError() {
        log.error("error");
        throw new RuntimeException("testError");
    }
}
