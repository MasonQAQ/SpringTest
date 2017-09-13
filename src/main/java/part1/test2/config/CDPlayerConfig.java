package part1.test2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import part1.test2.CDPlayer;
import part1.test2.CompactDisc;
import part1.test2.SgtPeppers;

/**
 *
 * Created by yangyue on 2017/9/12.
 */
@Configuration
//@ComponentScan(basePackageClasses = part1.test2.App.class) //类型安全的，扫描该类所在包及这个包下所有的子包
//@ComponentScan(basePackages = "part1.test2") // 扫描同一个包及这个包下所有的子包
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    /**
     * 并不是每次都会调用sgtPeppers进行注入，因为sgtPeppers上使用了@Bean进行注解，
     * Spring会拦截所有对它的调用，并确保直接返回该方法所创建的bean，而不是每次都
     * 对其进行实际的调用。
     * @return
     */
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    /**
     * 通过此方法不会引起理解上的歧义，在创建CDPlayer Bean的时候，它会自动装配一个
     * CompactDisc到配置方法中
     * 这种方法往往是最好的~
     * 好处： 1. 不会引起理解上的歧义
     *        2. 不用明确引用CompactDisc的@Bean方法
     *        3. 不用要求CompactDisc必须要在同一配置类中，甚至没有要求要用
     *        JavaConfig进行配置，完全可以使用XML或者组件扫描功能。
     * @param compactDisc
     * @return
     */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}

