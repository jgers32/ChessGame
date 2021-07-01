package sample;

import java.io.FileNotFoundException;
import java.util.Random;

public class surpriseBoardSpace extends chessBoard{
    @Override
    public void createBoard(int i, int j) {
    }

    public surpriseBoardSpace() throws FileNotFoundException {
        // this is the secret algorithm behind the MESS!

        // picks a random number between 0-8 for both the row and column
        // winner will be in the top left square because (0,0) is the most popular square
        // just because one of your pieces sits there does not guarantee a win, it comes down to the last click.
        Random random = new Random();
        int randomInt = random.nextInt(8);
        int randomInt2 = random.nextInt(8);

        this.boardHeight = randomInt;
        if(this.boardHeight % 2 == 0){
            this.boardHeight = 0;
        }
        if(this.boardWidth % 2 == 0){
            this.boardWidth = 0;
        }
        this.boardWidth = randomInt2;
    }



}