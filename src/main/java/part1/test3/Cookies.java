package part1.test3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import part1.test3.anno.Sweet;

/**
 * Created by yangyue on 2017/9/13.
 */
@Component
@Sweet
public class Cookies implements Dessert {

    private String name = "cookie";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void taste() {
        System.out.println("cookies is so sweet!");
    }
}
