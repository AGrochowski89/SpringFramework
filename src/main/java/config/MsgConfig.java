package config;

import messages.EmailMessage;
import messages.Message;
import messages.TraditionalMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MsgConfig {

    @Bean
    @Profile("dev")
    public Message eMessage(){
        return new EmailMessage();
    }

    @Bean
    @Profile("prod")
    public Message tMessage(){
        return new TraditionalMessage();
    }
}
