package sample;

import java.io.FileNotFoundException;
import java.util.Random;

public class surpriseChessPiece extends chessBoard {

    public surpriseChessPiece() throws FileNotFoundException {

        Random random = new Random();

        // 8 pieces + 1 pawn for each color = 9 each
        int randomColor = random.nextInt(36);
        //changes the color of the square so you will know who the winner is
        if (randomColor % 2 == 0){
            this.color = "white";
        }
        else{
            this.color = "black";
        }



//        if (randomColor <= 3){
//            this.name = "rook";
//        }
//        if (randomColor > 3 & randomColor <=7){
//            this.name = "knight";
//        }
//        if (randomColor > 7 & randomColor <= 11){
//            this.name = "bishop";
//        }
//        if (randomColor > 11 & randomColor <= 15){
//            this.name = "king";
//        }
//        if (randomColor > 15 & randomColor <= 19){
//            this.name = "queen";
//        }
//        if (randomColor < 19){
//            this.name= "pawn";
//        }
    }
}