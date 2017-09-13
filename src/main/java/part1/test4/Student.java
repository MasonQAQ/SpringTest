package part1.test4;

/**
 * Created by yangyue on 2017/9/13.
 */
public class Student {
    private String name;
    private int age;
    private School school;

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"school\":")
                .append(school);
        sb.append('}');
        return sb.toString();
    }
}
