package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getpieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int x = 0; x < board.getColumns(); x++) {
                mat[i][x] = (ChessPiece) board.piece(i, x);

            }
        }
        return mat;
    }
}
