package config;

import i18n.Greeting;
import i18n.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(value = PersonConfig.class)

public class GreetingConfig {

    @Autowired
    @Qualifier("zPolski")
    private Person osoba;

    @Bean(name = "greet_pl")
    public Greeting greeting_pl(){
        return new Greeting("Witaj", osoba);
    }
    @Bean(name = "greet_en")
    public Greeting greeting_en(){
        return new Greeting("Welcome", osoba);
    }
    @Bean(name = "greet_ru")
    public Greeting greeting_ru(){
        return new Greeting("Priviet", osoba);
    }
}
