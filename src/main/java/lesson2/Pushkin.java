package lesson2;

import org.springframework.stereotype.Component;

@Component("LyricistBean1")
public class Pushkin implements Lyricist {
    @Override
    public String generate() {
        return "Я помню чудное мгновенье:\r\n" + "Передо мной явилась ты,\r\n" + "Как мимолетное виденье,\r\n"
                + "Как гений чистой красоты.";
    }
}
