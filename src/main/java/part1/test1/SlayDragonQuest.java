package part1.test1;

import java.io.PrintStream;

/**
 * Created by yangyue on 2017/9/12.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
