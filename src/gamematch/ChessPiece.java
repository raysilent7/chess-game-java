package gamematch;

import gameboard.Board;
import gameboard.Piece;
import gameboard.Position;

public abstract class ChessPiece extends Piece {

    private int moveCount;
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void increseCount () {
        moveCount++;
    }

    public void decreseCount () {
        moveCount--;
    }

    public ChessPosition getChessPosition () {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
