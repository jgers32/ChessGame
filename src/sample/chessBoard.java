package sample;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.io.FileNotFoundException;

public class chessBoard extends Pane {
    public int boardWidth = 8;
    public int boardHeight = 8;

    // private rectangle for the board some it is just read only and cannot be changed in anyway
    private Rectangle[][] board;
    public String color;

    public chessBoard() throws FileNotFoundException {
        //creates the squares on the board
        board = new Rectangle[boardWidth][boardHeight];

        for (int x = 0; x < boardWidth; x++) {
            for (int j = 0; j < boardHeight; j++) {
                board[x][j] = new Rectangle();
                board[x][j].setWidth(100);
                board[x][j].setHeight(100);
                board[x][j].setX(x * 100);
                board[x][j].setY(j * 100);
            }
        }

        // puts either the pieces or the blank colors on the chess board
        for (int x = 0; x < boardWidth; x++) {
            for (int j = 0; j < boardHeight; j++) {

                //one line below me saves 30 lines of code here
                Pieces pieces = new Pieces();

                if ((x % 2 == 0 && j % 2 == 1) || (x % 2 == 1 && j % 2 == 0)) {
                    board[x][j].setFill(Color.BEIGE);
                    if(j==0 & x == 7) {
                        board[x][j].setFill(pieces.blackRook2);
                    }
                    if(j==0 & x == 5) {
                        board[x][j].setFill(pieces.blackBishop2);
                    }
                    if(j==0 & x == 3) {
                        board[x][j].setFill(pieces.blackQueen2);
                    }
                    if(j==0 & x == 1) {
                        board[x][j].setFill(pieces.blackKnight2);
                    }
                    if(j==7 & x == 0) {
                        board[x][j].setFill(pieces.whiteRook2);
                    }
                    if(j==7 & x == 6) {
                        board[x][j].setFill(pieces.whiteKnight2);
                    }
                    if(j==7 & x == 2) {
                        board[x][j].setFill(pieces.whiteBishop2);
                    }
                    if(j==7 & x == 4) {
                        board[x][j].setFill(pieces.whiteKing2);
                    }
                    if(j==1){
                        board[x][j].setFill(pieces.blackPawn2);
                    }
                    if(j==6){
                        board[x][j].setFill(pieces.whitePawn2);
                    }

                } else {
                    board[x][j].setFill(Color.DARKGRAY);
                    if(j==0 & x == 0) {
                        board[x][j].setFill(pieces.blackRook2);
                    }
                    if(j==0 & x == 2) {
                        board[x][j].setFill(pieces.blackBishop2);
                    }
                    if(j==0 & x == 4) {
                        board[x][j].setFill(pieces.blackKing2);
                    }
                    if(j==0 & x == 6) {
                        board[x][j].setFill(pieces.blackKnight2);
                    }
                    if(j==7 & x == 7) {
                        board[x][j].setFill(pieces.whiteRook2);
                    }
                    if(j==7 & x == 1) {
                        board[x][j].setFill(pieces.whiteKnight2);
                    }
                    if(j==7 & x == 5) {
                        board[x][j].setFill(pieces.whiteBishop2);
                    }
                    if(j==7 & x == 3) {
                        board[x][j].setFill(pieces.whiteQueen2);
                    }
                    if(j==1){
                        board[x][j].setFill(pieces.blackPawn2);
                    }
                    if(j==6){
                        board[x][j].setFill(pieces.whitePawn2);
                    }
                }
            }
        }
    }
    public void createBoard(final int i, final int j){
        getChildren().add(board[i][j]);
        board[i][j].setOnMousePressed(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
                try {
                    surpriseBoardSpace surprisePiece = new surpriseBoardSpace();
                    surpriseChessPiece surpriseChessPiece = new surpriseChessPiece();
                    Pieces pieces = new Pieces();

                    // picks a random king to be put in the random rectangle spot, may the best man win.
                    if(surpriseChessPiece.color.equalsIgnoreCase("black")){
                        board[surprisePiece.boardHeight][surprisePiece.boardWidth].setFill(pieces.blackKing2);
                    }
                    else {
                        board[surprisePiece.boardHeight][surprisePiece.boardWidth].setFill(pieces.whiteKing2);
                    }
                } catch (FileNotFoundException notFoundException) {
                    notFoundException.printStackTrace();
                }
                if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                    board[i][j].setFill(Color.BEIGE);
                }
                else{
                    board[i][j].setFill(Color.DARKGREY);
                }
            }
        });
    }
}