package part1.test3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import part1.test3.config.EatConfig;

/**
 * Created by yangyue on 2017/9/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EatConfig.class)
public class App {

    @Autowired
    private SweetLover sweetLover;

//    @Autowired
//    private Dessert dessert;

    @Test
    public void test1(){
        sweetLover.eatDessert();
    }
}
