package blog.p1;

/**
 * Created by yangyue
 *
 * @Date: 13/09/2017
 * @Time: 7:31 PM
 * @package_name: blog.p1
 * @Description:
 */
public class Person {

    private Task task;

    public Person(Task task) {
        this.task = task;
    }

    public void doTask(){
        task.doIt();
    }

}
