package part1.test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import part1.test3.anno.Cold;
import part1.test3.anno.Creamy;
import part1.test3.anno.Sweet;

/**
 * Created by yangyue on 2017/9/13.
 */
@Component
public class SweetLover {
    private String name;
    private Dessert dessert;

    public void setName(String name) {
        this.name = name;
    }

    public void eatDessert(){
        System.out.println("I am eating: " + dessert.getName());
        dessert.taste();
    }

    @Autowired
    @Cold
    @Sweet
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"dessert\":")
                .append(dessert);
        sb.append('}');
        return sb.toString();
    }
}
