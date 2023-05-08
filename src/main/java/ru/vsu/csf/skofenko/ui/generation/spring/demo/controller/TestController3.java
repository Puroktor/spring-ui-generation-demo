package ru.vsu.csf.skofenko.ui.generation.spring.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.AutoGenerateUI;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.DisplayName;

@RestController
@RequestMapping("api/controller3")
@AutoGenerateUI
public class TestController3 {

    @DeleteMapping("example")
    @DisplayName("Another example method")
    public void deleteEntity(@RequestParam("id1") @DisplayName("query id1 name") int id1,
                             @RequestParam(value = "id2", required = false) @DisplayName("query id2 name") int id2) {
    }
}
