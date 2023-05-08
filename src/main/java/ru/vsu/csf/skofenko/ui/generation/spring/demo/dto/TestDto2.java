package ru.vsu.csf.skofenko.ui.generation.spring.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDto2 {
    private String description1;
    @Nullable
    private String description2;
}
