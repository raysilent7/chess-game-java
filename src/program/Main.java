package program;

import gamematch.ChessException;
import gamematch.ChessMatch;
import gamematch.ChessPiece;
import gamematch.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException excp) {
                System.out.println(excp.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException excp) {
                System.out.println(excp.getMessage());
                sc.nextLine();
            }
        }
    }
}
