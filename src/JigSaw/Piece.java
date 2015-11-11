package JigSaw;

/**
 * Created by ZXM on 10/11/15.
 */
public class Piece {
    private int id;
    private final int numOfEdges = 4;
    private Edge[] edges = new Edge[numOfEdges];

    public Piece(Edge[] edges) {
        this.edges = edges;
    }

    public boolean fitWith(Edge a, Edge b) {
        return true;
    }


}
