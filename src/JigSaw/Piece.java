package JigSaw;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZXM on 10/11/15.
 */
public class Piece {

    private Map<Orientation, Edge> edges = new HashMap<>();

    public Piece(Edge[] edgeList) {

    }

    public Edge getEdge(Orientation orientation) {
        return edges.get(orientation);
    }




}
