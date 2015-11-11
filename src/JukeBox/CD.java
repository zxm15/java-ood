package JukeBox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zxm on 10/9/15.
 */
public class CD {
    private int id;
    private int numOfSongs = 0;
    private Map<Integer, Song> songMap = new HashMap<>();

    public CD(int id, List<Song> songs) {
        this.id = id;
        for (Song song : songs) {
            songMap.put(song.getId(), song);
        }
        numOfSongs = songs.size();
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public Map<Integer, Song> getSongMap() {
        return songMap;
    }

    public void setSongMap(Map<Integer, Song> songMap) {
        this.songMap = songMap;
    }
}
