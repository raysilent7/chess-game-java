package matchpieces;

import gameboard.Board;
import gamematch.ChessPiece;
import gamematch.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString () {
        return "R";
    }
}
