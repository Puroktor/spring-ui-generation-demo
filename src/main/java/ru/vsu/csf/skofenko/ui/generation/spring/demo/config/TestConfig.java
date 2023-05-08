package ru.vsu.csf.skofenko.ui.generation.spring.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vsu.csf.skofenko.ui.generator.spring.component.UIGeneratorContextListener;
import ru.vsu.csf.skofenko.ui.generator.spring.config.UIGeneratorProperties;

@Configuration
public class TestConfig {
    @Bean
    public UIGeneratorContextListener uiGeneratorContextListener() {
        UIGeneratorProperties properties = new UIGeneratorProperties();
        properties.setOverride(true);
        properties.setStartup(true);
        return new UIGeneratorContextListener(properties);
    }
}
