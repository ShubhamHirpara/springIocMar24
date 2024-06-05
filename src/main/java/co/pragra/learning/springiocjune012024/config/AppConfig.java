package co.pragra.learning.springiocjune012024.config;

import co.pragra.learning.springiocjune012024.Cineplex;
import co.pragra.learning.springiocjune012024.Samsung;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "prototype")
    public Samsung samsung25(){
        Samsung samsung25 = new Samsung(cineplex());
        samsung25.setModel("S25");
        return samsung25;
    }

    @Bean
    public Samsung samsung26(){
        Samsung samsung25 = new Samsung(cineplex());
        samsung25.setModel("S26");
        return samsung25;
    }

    @Bean
    public Cineplex cineplex(){
        return new Cineplex();
    }
}
