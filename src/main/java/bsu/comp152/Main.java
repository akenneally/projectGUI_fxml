package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Parent is the superclass of Stage.
        Parent root = null;
        var loc = getClass().getResource("Main.fxml");
        try {
            root = FXMLLoader.load(loc);
        }catch (IOException e){
            System.out.println("Can't Find FXML file!");
        }
        Scene windowContents = new Scene(root, 300,300);
        primaryStage.setScene(windowContents);
        primaryStage.setTitle("FXML Demo.");
        primaryStage.show();
    }
}
