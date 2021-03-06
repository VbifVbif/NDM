package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
            //задает сцену, название и тд
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("teseter3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("DigitalMap AITU");
        stage.setScene(scene);
        stage.show();
    }
    //Запуск
    public static void main(String[] args) {
        launch();

    }
}