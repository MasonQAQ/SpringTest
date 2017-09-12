package part1.test2;

import org.springframework.stereotype.Component;

/**
 * Created by yangyue on 2017/9/12.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public String toString() {
        return "SgtPeppers{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
