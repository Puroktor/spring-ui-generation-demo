package ru.vsu.csf.skofenko.ui.generation.spring.demo.controller;

import org.springframework.web.bind.annotation.*;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.AutoGenerateUI;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.DisplayName;

@RestController
@RequestMapping("api/controller3")
@AutoGenerateUI
public class TestController3 {

    @DeleteMapping("example/{id}")
    @DisplayName("Another example method")
    public void deleteEntity(@PathVariable("id") @DisplayName("path param id") int id1,
                             @RequestParam(value = "id2", required = false) @DisplayName("query id2 name") int id2) {
    }
}
