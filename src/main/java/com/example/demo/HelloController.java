package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.nio.Buffer;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView map;
    //Image image = new ImageInput("C:\\Users\\Michael\\IdeaProjects\\demo\\images\\floor2.png");
    //Image Image = new Image("C:\\Users\\Michael\\IdeaProjects\\demo\\images\\floor2.png");



    @FXML
    protected void First() {
        welcomeText.setText("Этаж 1");

    }
    @FXML
    protected void Second() {
        welcomeText.setText("Этаж 2");
       // map.setImage(Image);
    }
    @FXML
    protected void Third() {
        welcomeText.setText("Этаж 3");
    }
}