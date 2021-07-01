package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("\u2654 Let's Play MESS (Modified Chess)! \u2654");

            GridPane root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            // creates the board with pieces on it by instantiating chessBoard class
            chessBoard board = new chessBoard();

            for(int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        board.createBoard(i, j);
                    }
                }

            // uses pieceClickListener class to detect where the Users mouse clicked at
            pieceClickListener pieceClickListener = new pieceClickListener();
            System.out.println(pieceClickListener);

            // creates the actual javaFX window + displays board
            root.add(board, 0, 0);
            Scene scene = new Scene(root,800,800);
            scene.getStylesheets().add(getClass().getResource("default.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}