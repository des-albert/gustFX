package org.db;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class gustMain extends Application {

    private static Stage primaryStage;
    public static Stage getPrimaryStage() {
        return gustMain.primaryStage;
    }
    public gustMain() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("base.fxml"));
        primaryStage.setTitle("Grand Unified SOAP Tool");
        primaryStage.setScene(new Scene(root));
        Image icon = new Image(getClass().getResourceAsStream("/img/gust.png"));
        primaryStage.getIcons().add(icon);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
