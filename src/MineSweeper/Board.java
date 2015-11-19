package MineSweeper;

import java.util.Random;

/**
 * Created by ZXM on 11/18/15.
 */
public class Board {

    private Cell[][] board;


    public Board(int row, int col, int bombs) {
        create(bombs);

    }

    /**
     * Randomly select some place on board to place bombs, after that write the
     * board cells to correct numbers
     * @param bombs
     * @return
     */
    private void create(int bombs) {
        int m = board.length, n = board[0].length;
        if (bombs >= m * n) throw new IllegalArgumentException();
        initialize();
        Random rand = new Random();
        for (int i = 0; i < bombs; i++) {
            while (true) {
                int row = rand.nextInt(m);
                int col = rand.nextInt(n);
                Cell cell = board[row][col];
                if (cell.isBomb()) continue;
                cell.setValue(Game.bombValue);
                expandNeighbors(row, col);
            }

        }
    }

    private void initialize() {

    }

    private void expandNeighbors(int row, int col) {
        int[] dx = new int[] {}; //eight neighbors
        int[] dy = new int[] {};

        for (int i = 0; i < dx.length; i++) {
            int x = row + dx[i];
            int y = col + dy[i];
            if (isInBoundaries(x, y));
            Cell neighbor = board[x][y];
            if (! neighbor.isBomb()) {
                neighbor.setValue(neighbor.getValue() + 1);
            }
        }
    }

    public boolean isInBoundaries(int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) return false;
        return true;
    }

    public Cell getCell(int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col > board[0].length)
            throw new IllegalArgumentException("The input is not valid");
        return board[row][col];
    }

    public int getLength() {
        return board.length;
    }

    public int getWidth() {
        return board[0].length;
    }









}
