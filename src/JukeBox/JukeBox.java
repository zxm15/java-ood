package JukeBox;

import java.util.List;

/**
 * Created by zxm on 10/9/15.
 */
public class JukeBox {

    private CDLibrary library;
    private MusicPlayer player;
    private PlayList list;

    public JukeBox(List<CD> CDs) {
        library = new CDLibrary(CDs);
        player = new MusicPlayer();
        list = new PlayList();
    }


}
