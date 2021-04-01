package lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * без хмля прописаны бины
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LyricistConfiguration.class);
        Lyricist lyricist = applicationContext.getBean("LyricistBean1", Lyricist.class);
        System.out.println(lyricist.generate());
        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
