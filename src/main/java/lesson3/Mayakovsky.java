package lesson3;

public class Mayakovsky implements Lyricist {

    @Override
    public String generate() {
        return "А вы\r\n" + "ноктюрн сыграть\r\n" + "могли бы\r\n" + "на флейте водосточных труб?";
    }
}
