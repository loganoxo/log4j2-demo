package com.logan.controller;

import com.logan.PackgzAndDeleteTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/14
 * @description TODO
 */
@RestController
public class DemoController {

    @GetMapping("/test")
    public void test() {
        PackgzAndDeleteTest.test();
    }

}