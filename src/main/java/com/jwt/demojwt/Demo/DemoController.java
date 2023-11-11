package com.jwt.demojwt.Demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {


    @PostMapping(value = "demo")
    public String wellcome() {
        return "Wellcome from secure endpoint";
    }
}
