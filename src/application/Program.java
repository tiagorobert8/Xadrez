
package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);   
     ChessMatch chessMatch = new ChessMatch();
     
     while (true){
     UI.printBoard(chessMatch.getPieces());
     System.out.println();
     System.out.print("Source: ");
     ChessPosition source = UI.readChessPsotion(sc);
     
     
     System.out.println();
     System.out.print("Target: ");
     ChessPosition targert = UI.readChessPsotion(sc);
     
     ChessPiece capturedPiece = chessMatch.performChessMove(source, targert);
     
     
     }
         
    }
    
}
