package com.zavier.scaffold.web;

import com.zavier.scaffold.common.ProcessException;
import com.zavier.scaffold.common.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @Value("${amazon.sourceId}")
    private String sourceId;

    @GetMapping("/test")
    public ResultBean<String> test() {
        log.info(sourceId);
        return ResultBean.createBySuccess("SUCCESS");
    }

    @GetMapping("/testerror")
    public ResultBean<String> testError() {
        log.error("error");
        throw new ProcessException("testError");
    }

    @GetMapping("/testerror1")
    public String testError1() {
        log.error("error");
        throw new ProcessException("testError");
    }
}
