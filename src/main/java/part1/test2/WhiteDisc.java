package part1.test2;

import java.util.List;

/**
 * Created by yangyue on 2017/9/13.
 */
public class WhiteDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    //    public WhiteDisc(String title, String artist, List<String> tracks) {
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks){
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"title\":\"")
                .append(title).append('\"');
        sb.append(",\"artist\":\"")
                .append(artist).append('\"');
        sb.append(",\"tracks\":")
                .append(tracks);
        sb.append('}');
        return sb.toString();
    }
}
