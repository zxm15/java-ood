package JukeBox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zxm on 10/9/15.
 */
public class CDLibrary {
    private Map<Integer, CD> cdMap = new HashMap<>();

    public CDLibrary(List<CD> CDList) {
        for (CD cd : CDList) {
            cdMap.put(cd.getId(), cd);
        }
    }

    public boolean searchCD(CD cd) {
        return cdMap.containsKey(cd.getId());
    }

    public boolean searchSong(Song song) {
        return searchCD(song.getCd());
    }

    public void addCD(CD cd) {
        if (cdMap.containsKey(cd)) cdMap.put(cd.getId(), cd);
    }

    public void removeCD(CD cd) {
        cdMap.remove(cd);
    }
}
