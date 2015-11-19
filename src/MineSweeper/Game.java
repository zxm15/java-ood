package MineSweeper;

/**
 * Created by ZXM on 11/18/15.
 */
public class Game {

    private Board board;
    private Player player;
    private int count;
    private int bombs;
    public final static String initalFaceMark = "?";
    public final static String flagMark = "f";
    public final static int bombValue = -1;


    public Game(int row, int col, int bombs, Player player) {
        board = new Board(row, col, bombs);
        this.player = player;
        count = row * col;
        this.bombs = bombs;
    }

    public void openCell(int row, int col) {

        Cell cell = board.getCell(row, col);
        if (cell.isHasFlag()) return;
        if (cell.isBomb()) gameOver();
        else if (cell.isNumber()) cell.setFace(String.valueOf(cell.getValue()));
        else exploreBlank(row, col);

    }



    private void exploreBlank(int row, int col) {
        if (! board.isInBoundaries(row, col)) return;
        Cell cell = board.getCell(row, col);
        if (cell.isVisited() || cell.isBomb()) return;
        if (cell.isNumber()) cell.setFace(String.valueOf(cell.getValue()));
        else cell.setFace("");
        count--;
        int[] dx = new int[] {-1, 1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};
        for (int i = 0; i < dx.length; i++) {
            exploreBlank(row + dx[i], col + dy[i]);
        }
    }

    public void markFlag(int row, int col) {
        Cell cell = board.getCell(row, col);
        cell.setFace(Game.flagMark);
    }

    public void unmarkFlag(int row, int col) {
        Cell cell = board.getCell(row, col);
        cell.setFace(Game.initalFaceMark);
    }

    public boolean hasWinner() {
        return count == bombs;
    }

    public void gameOver() {

    }
}
