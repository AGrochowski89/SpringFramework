package config;

import i18n.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class PersonConfig {

    @Value("${person.default.firstName}")
    private String defFirstName;
    @Value("${person.default.lastName}")
    private String defLastName;

    @Bean(name = "zPolski")
    public Person z_polski(){
        return new Person(defFirstName, defLastName);
    }
    @Bean(name = "zAmeryki")
    public Person z_ameryki(){
        return new Person("Donald", "Trump");
    }
    @Bean(name ="zNiemiec")
    public Person z_niemiec(){
        return new Person("Angela", "Merkel");
    }
}
