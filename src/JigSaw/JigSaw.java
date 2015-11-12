package JigSaw;

import java.util.*;

/**
 * Created by ZXM on 10/11/15.
 */
public class JigSaw {
    private final int width = 10;
    private final int length = 10;
    private Set<Piece> pieces; //remaining pieces to put away
    private Piece[][] solution = new Piece[length][width];

    public JigSaw(Set<Piece> peices) {
        this.pieces = peices; //intially it has a full amount of pieces
    }

    public void solveJigSaw() {
        if (pieces == null || pieces.size() != width * length)
            throw new IllegalArgumentException("The game does not contains enough pieces");
        Set<Piece> corner = new HashSet<>();
        Set<Piece> outer = new HashSet<>();
        Set<Piece> inside = new HashSet<>();
        groupPieces(corner, outer, inside, pieces); //seperate pieces into different groups

        fillCorners(corner);
        fillBoundaries(outer);
        fillInsider(inside);
    }
    //you got the idea here
    private void fillCorners(Set<Piece> corner) {

//        for (Piece cornerPiece : corner) {
//            if (isValidTopLeft(cornerPiece)) {
//                solution[0][0] = cornerPiece;
//                break;
//            } else if ()
//        }

    }

    private void fillBoundaries(Set<Piece> outer) {

    }

    private void fillInsider(Set<Piece> inside) {
        for (int i = 1; i < length - 1; i++) {
            for (int j = 1; j < width - 1; j++) {
                Edge prevEdge = solution[i][j - 1].getEdge(Orientation.RIGHT);
                solution[i][j] = searchPiece(prevEdge, Orientation.RIGHT, inside);
            }
        }
    }

    /**
     * Find the fitting piece, rotate it to the correct position, then remove it from the set and place it on the board
     */
    private Piece searchPiece(Edge matchingEdge, Orientation edgeOrientation, Set<Piece> set) {
        Piece res = null;
        for (Piece piece : set) {
           for (Orientation orientation : Orientation.values()) {
               if (piece.getEdge(orientation).fitsWith(matchingEdge)) {
                   res = piece;
                   rotate(piece, orientation, edgeOrientation.getOppsite());
                   set.remove(piece);
                   return res;
               }
           }

        }

        return res;
    }

    private void rotate(Piece piece, Orientation start, Orientation dest) {

    }

    private void groupPieces(Set<Piece> corner, Set<Piece> outer, Set<Piece> inside, Set<Piece> pieces) {

    }


}
