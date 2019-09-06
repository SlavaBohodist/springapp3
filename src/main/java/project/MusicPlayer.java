package project;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music>musiclist= new ArrayList<Music>();

    public void setMusiclist(List<Music> musiclist) {
        this.musiclist = musiclist;
    }
    private String name;
    private int volume;
    public void playMusic(){
        for(int i = 0;i<musiclist.size();i++)
        System.out.println("Playing : "+musiclist.get(i).getSong()  );
    }

}
