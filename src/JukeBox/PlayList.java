package JukeBox;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by zxm on 10/9/15.
 */
public class PlayList {
    private Queue<Song> songList;

    public PlayList() {
        songList = new LinkedList();
    }

    public void addSong(Song song) {
        songList.offer(song);
    }

    public Song getNextSong() {
        return songList.peek();
    }

}
