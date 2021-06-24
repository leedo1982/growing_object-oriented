package com.example.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String test() {
        try {
            System.out.println("DEMO TEST");
            Thread.sleep(3800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "demo";
    }
}
