package config;

import i18n.Person;
import messages.Message;
import model.HelloName;
import model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {GreetingConfig.class, MsgConfig.class})
public class ConfigurationClazz {

//    @Autowired
//    private Message messageSystem;

    @Bean
    public HelloWorld hello() {
        return new HelloWorld();
    }
    
    @Bean
    public HelloName helloNameConstr() {
        return new HelloName("Domino");
    }

    @Bean(name = {"helloNameSetter", "setterBeanExample"})
    public HelloName helloNameSetter() {
        HelloName helloName = new HelloName();
        helloName.setName("Weronika");
        return helloName;
    }
}
