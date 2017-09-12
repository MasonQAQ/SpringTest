package part1.test2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import part1.test2.config.CDPlayerConfig;

import static org.junit.Assert.assertNotNull;


/**
 * Created by yangyue on 2017/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext-p1-t2.xml")
@ContextConfiguration(classes = CDPlayerConfig.class)
public class App {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
        System.out.println(cd);
    }

    @Test
    public void play(){
        System.out.println(player);
        player.play();
    }
}
