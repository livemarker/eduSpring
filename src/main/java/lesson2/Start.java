package lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Lyricist lyricist = applicationContext.getBean("LyricistBean1", Lyricist.class);
        System.out.println(lyricist.generate());
        System.out.println(lyricist.hashCode());
        Lyricist lyricist1=applicationContext.getBean("LyricistBean2",Lyricist.class);
        System.out.println(lyricist1.generate());
        System.out.println(lyricist1.hashCode());
        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
