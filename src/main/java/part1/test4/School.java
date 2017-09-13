package part1.test4;

/**
 * Created by yangyue on 2017/9/13.
 */
public class School {
    private String name;
    private String city;

    public School(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"city\":\"")
                .append(city).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
