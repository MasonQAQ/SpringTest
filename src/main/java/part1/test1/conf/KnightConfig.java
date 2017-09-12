package part1.test1.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import part1.test1.BraveKnight;
import part1.test1.Knight;
import part1.test1.Quest;
import part1.test1.SlayDragonQuest;

/**
 * Created by yangyue on 2017/9/12.
 */

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }


}
