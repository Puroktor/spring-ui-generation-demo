package ru.vsu.csf.skofenko.ui.generation.spring.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.csf.skofenko.ui.generation.spring.demo.dto.TestDto2;

@RestController
@RequestMapping("api/controller2")
public class TestController2 {
    @PostMapping
    public void ignoredEndpoint(@RequestBody TestDto2 dto2) {
    }
}
