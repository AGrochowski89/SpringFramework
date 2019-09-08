import config.ConfigurationClazz;
import i18n.Greeting;
import i18n.Person;
import messages.Message;
import model.HelloName;
import model.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoRunnerSringXMLConf {
    public static void main(String[] args) {
        //System.out.println("yeap");
        //ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClazz.class);

        HelloWorld helloBean = context.getBean(HelloWorld.class);
        helloBean.sayHello();

        HelloName helloName = context.getBean("helloNameConstr",HelloName.class);
        helloName.sayHello();
        helloName.setName("Janusz");
        helloName.sayHello();

        helloName = context.getBean("setterBeanExample",HelloName.class);
        helloName.sayHello();
        helloName.setName("Janusz");
        helloName.sayHello();

        Person person = context.getBean("zPolski", Person.class);
        System.out.println(person);

        Greeting greeting = context.getBean("greet_ru",Greeting.class);
        System.out.println(greeting);
        greeting = context.getBean("greet_en",Greeting.class);
        System.out.println(greeting);
        greeting = context.getBean("greet_pl",Greeting.class);
        System.out.println(greeting);

        Message msg = context.getBean(Message.class);
        msg.send("TEST");
    }
}
