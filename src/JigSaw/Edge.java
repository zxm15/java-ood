package JigSaw;

/**
 * Created by ZXM on 10/11/15.
 */
public class Edge {

    EdgeType edgeType;

    public Edge(EdgeType edgeType) {

        this.edgeType = edgeType;
    }
    //given function
    public boolean fitsWith(Edge edge) {
        return true;
    }

}
