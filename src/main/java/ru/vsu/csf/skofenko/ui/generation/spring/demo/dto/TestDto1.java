package ru.vsu.csf.skofenko.ui.generation.spring.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.DateField;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.DisplayName;
import ru.vsu.csf.skofenko.ui.generator.spring.annotation.NumberField;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestDto1 {
    @DisplayName("ID description")
    @NumberField(min = 0, max = Integer.MAX_VALUE)
    private int id;
    private HttpStatus status;
    private List<String> textList;
    @DisplayName("Flag Description")
    private boolean flag;
    @DateField("yyyy/MM/dd")
    private String customDate;
    @DisplayName("Inner DTO")
    private TestDto2 testDto2;
}
