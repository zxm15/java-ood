package JigSaw;

/**
 * Created by ZXM on 10/11/15.
 */
public class Edge {
    private int pieceId;
    private int id;
    EdgeType edgeType;

    public Edge(int pieceId, int id, EdgeType edgeType) {
        this.pieceId = pieceId;
        this.id = id;
        this.edgeType = edgeType;
    }
}
