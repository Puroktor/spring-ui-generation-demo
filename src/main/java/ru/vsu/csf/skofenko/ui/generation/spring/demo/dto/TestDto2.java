package ru.vsu.csf.skofenko.ui.generation.spring.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.TextField;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDto2 {
    private String description1;
    @Nullable
    @TextField(pattern = "Example.*", minLength = 5, maxLength = Integer.MAX_VALUE)
    private String description2;
}
