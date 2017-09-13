package part1.test4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import part1.test4.School;
import part1.test4.Student;

/**
 * Created by yangyue on 2017/9/13.
 */
@Configuration
public class MyConfig {
    @Bean
    public School getSchool(){
        return new School("Beijing 4 middle school","Beijing");
    }

    @Bean
    public Student getStudent(){
        return new Student("xiaoming",21, getSchool());
    }
}
