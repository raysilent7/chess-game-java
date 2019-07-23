package program;

import gameboard.Board;
import gameboard.Position;
import gamematch.ChessMatch;

public class Main {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
