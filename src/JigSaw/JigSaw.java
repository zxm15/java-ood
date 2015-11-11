package JigSaw;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by ZXM on 10/11/15.
 */
public class JigSaw {
    private final int width = 10;
    private final int length = 10;
    Piece[][] pieces = new Piece[length][width];

    public JigSaw(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public void solveJigSaw() {
        if (pieces == null || pieces.length == 0)
            throw new IllegalArgumentException("The puzzle is empty");
        int m = pieces.length, n = pieces[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pieces[i][j].getNumOfPlainEdges() >= 2) {
                    int count = length * width;
                    Queue<Piece> queue = new LinkedList<>();
                    Set<Piece> visited = new HashSet<>();
                    queue.offer(pieces[i][j]);
                    visited.add(pieces[i][j]);
                    while (! queue.isEmpty()) {
                        Piece piece = queue.poll();
                        for (int )
                    }
                }
            }
        }
    }
}
