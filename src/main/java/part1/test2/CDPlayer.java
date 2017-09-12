package part1.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangyue on 2017/9/12.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    /**
     * 通过注解构造器的方式进行自动装配
     * @param compactDisc
     */
    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

    public CompactDisc getCompactDisc() {
        return compactDisc;
    }

    /**
     * 通过setter进行自动装配
     * @param compactDisc
     */
//    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    /**
     * 通过普通方法进行自动装配
     * @param compactDisc
     */
//    @Autowired
    public void insertCD(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    @Override
    public String toString() {
        return "CDPlayer{" +
                "compactDisc=" + compactDisc +
                '}';
    }
}
