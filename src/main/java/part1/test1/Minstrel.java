package part1.test1;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by yangyue on 2017/9/12.
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream inputStream) {
        this.stream = inputStream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la la, the knight is so brave");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee");
    }
}
