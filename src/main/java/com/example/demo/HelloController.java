package com.example.demo;


import java.io.*;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    String Search = "c1.2.256";

    @FXML
    private Label welcomeText;
    @FXML
    public ImageView map;
    //Image image = new ImageInput("C:\\Users\\Michael\\IdeaProjects\\demo\\images\\floor2.png");
    FileInputStream inputstream1 = new FileInputStream("C:\\Users\\Michael\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\first.jpg");
    Image floor1 = new Image(inputstream1);
    FileInputStream inputstream2 = new FileInputStream("C:\\Users\\Michael\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\second.jpg");
    Image floor2 = new Image(inputstream2);
    FileInputStream inputstream3 = new FileInputStream("C:\\Users\\Michael\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\third.png");
    Image floor3 = new Image(inputstream3);

    public HelloController() throws FileNotFoundException {
    }


    @FXML
    protected void First() {
        welcomeText.setText("Этаж 1");
        map.setImage(floor1);
    }
    @FXML
    public void Second() {
        welcomeText.setText("Этаж 2");
       map.setImage(floor2);
    }
    @FXML
    protected void Third() {
        welcomeText.setText("Этаж 3");
        map.setImage(floor3);
    }

    @FXML
    protected void Search() {
        welcomeText.setText("Этаж ");

    }

}