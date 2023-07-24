import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        logger.log(Level.INFO, bean1.getMessage());
        logger.log(Level.INFO, bean2.getMessage());
        logger.log(Level.INFO, String.valueOf(bean1 == bean2));
        Cat cat1 = (Cat) applicationContext.getBean("Cat");
        Cat cat2 = (Cat) applicationContext.getBean("Cat");
        logger.log(Level.INFO, cat1.getName());
        logger.log(Level.INFO, cat2.getName());
        logger.log(Level.INFO, String.valueOf(cat1 == cat2));

    }
}