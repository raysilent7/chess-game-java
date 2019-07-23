package matchpieces;

import gameboard.Board;
import gamematch.ChessPiece;
import gamematch.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString () {
        return "K";
    }
}
