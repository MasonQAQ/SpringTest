package part1.test1;

/**
 * Created by yangyue on 2017/9/12.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
