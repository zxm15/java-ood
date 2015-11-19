package Excel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZXM on 11/18/15.
 */
public class Cell {
    Object content;
    List<Relation> relationList = new ArrayList<>(); //directed graph.



    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public List<Relation> getRelationList() {
        return relationList;
    }

    public void setRelationList(List<Relation> relationList) {
        this.relationList = relationList;
    }
}
