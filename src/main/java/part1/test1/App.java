package part1.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangyue on 2017/9/12.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-p1-t1.xml");
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(part1.test1.conf.KnightConfig.class);
        Knight knight = ctx.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}

