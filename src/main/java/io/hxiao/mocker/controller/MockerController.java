package io.hxiao.mocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MockerController {

    @RequestMapping("/")
    public String index() {
        return "hello";
    }

}
