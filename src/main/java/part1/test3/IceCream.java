package part1.test3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import part1.test3.Dessert;
import part1.test3.anno.Cold;
import part1.test3.anno.Creamy;
import part1.test3.anno.Sweet;

/**
 * Created by yangyue on 2017/9/13.
 */
@Component
@Cold
@Sweet
@Creamy
public class IceCream implements Dessert {

    private String name = "ice cream";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void taste() {
        System.out.println("IceCream is so sweet!");
    }
}
