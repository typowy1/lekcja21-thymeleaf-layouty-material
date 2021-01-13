package pl.javastart.lekcja21thymeleaflayoutymaterial;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Configuration
public class ThymeleafConfig {

    //configuracja thymeleafa layout
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
