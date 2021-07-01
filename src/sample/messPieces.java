//package sample;
//
//import javafx.event.EventHandler;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//
//import java.io.FileNotFoundException;
//
//public class messPieces extends chessBoard{
//
//    public messPieces() throws FileNotFoundException {
//    }
//
//    @Override
//    public void createBoard(int i, int j) {
//      super.createBoard(i, j);
//        getChildren().add(board[i][j]);
//        board[i][j].setOnMousePressed(new EventHandler<MouseEvent>()
//        {
//            @Override
//            public void handle(MouseEvent t) {
//                try {
//                    surpriseBoardSpace surprisePiece = new surpriseBoardSpace();
//                    surpriseChessPiece surpriseChessPiece = new surpriseChessPiece();
//                    Pieces pieces = new Pieces();
//
//                    // picks a random king to be put in the random rectangle spot, may the best man win.
//                    if(surpriseChessPiece.color.equalsIgnoreCase("black")){
//                        board[surprisePiece.boardHeight][surprisePiece.boardWidth].setFill(pieces.blackKing2);
//                    }
//                    else {
//                        board[surprisePiece.boardHeight][surprisePiece.boardWidth].setFill(pieces.whiteKing2);
//                    }
//                } catch (FileNotFoundException notFoundException) {
//                    notFoundException.printStackTrace();
//                }
//                if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
//                    board[i][j].setFill(Color.BEIGE);
//                }
//                else{
//                    board[i][j].setFill(Color.DARKGREY);
//                }
//            }
//        });
//    }
//}
