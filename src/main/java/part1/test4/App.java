package part1.test4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import part1.test4.config.MyConfig;

/**
 * Created by yangyue on 2017/9/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class App {

    @Autowired
    private Student student;

    @Autowired
    private School school;

    @Test
    public void test1(){
        System.out.println(student.toString());;
    }
}
