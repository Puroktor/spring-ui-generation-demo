package ru.vsu.csf.skofenko.ui.generation.spring.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.vsu.csf.skofenko.ui.generation.spring.demo.dto.TestDto1;
import ru.vsu.csf.skofenko.ui.generation.spring.demo.dto.TestDto2;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.AutoGenerateUI;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.DisplayName;

import java.util.List;

@RestController
@RequestMapping("api/controller1")
@AutoGenerateUI
@DisplayName("My custom controller")
public class TestController1 {

    @PostMapping("entity")
    public void createEntity(@RequestBody TestDto1 dto1) {
    }

    @GetMapping("entity")
    @DisplayName("Retrieve entity")
    public TestDto1 getEntity(@RequestParam("id")int id) {
        TestDto2 testDto2 = new TestDto2("Example description 1", "Example description 2");
        return TestDto1.builder()
                .id(id)
                .flag(true)
                .status(HttpStatus.ACCEPTED)
                .textList(List.of("hi", "hello"))
                .testDto2(testDto2)
                .build();
    }
}
