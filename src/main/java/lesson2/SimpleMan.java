package lesson2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("LyricistBean2")
public class SimpleMan implements Lyricist {
    @Override
    public String generate() {
        return "Я человек простой, стихи не пишу";
    }
}
