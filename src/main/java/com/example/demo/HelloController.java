package com.example.demo;


import java.io.*;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    String Search = "c1.2.256";
    @FXML
    TextField Tfield = new TextField();


    @FXML
    private Label welcomeText;
    @FXML
    public ImageView map; // подключение к картинкам из fxml

    FileInputStream inputstream1 = new FileInputStream("first.jpg");// загрузка картинок в приложение
    Image floor1 = new Image(inputstream1);
    FileInputStream inputstream2 = new FileInputStream("second.jpg");// загрузка картинок в приложение
    Image floor2 = new Image(inputstream2);
    FileInputStream inputstream3 = new FileInputStream("third.png");// загрузка картинок в приложение
    Image floor3 = new Image(inputstream3);
    FileInputStream inputstream4 = new FileInputStream("info.png");// загрузка картинок в приложение
    Image info = new Image(inputstream4);

    public HelloController() throws FileNotFoundException {
    }

    //Это функция открытия карты первого этажа
    @FXML
    protected void First() {
        welcomeText.setText("Этаж 1");
        map.setImage(floor1);
    }
    //Это функция открытия карты второго этажа
    @FXML
    protected void Second() {
        welcomeText.setText("Этаж 2");
        map.setImage(floor2);
    }
    //Это функция открытия карты третьего этажа
    @FXML
    protected void Third() {
        welcomeText.setText("Этаж 3");
        map.setImage(floor3);
    }
    //Это функция показа инфы
    @FXML
    protected void Info() {
        welcomeText.setText("");
        map.setImage(info);
    }

    //Это функция навигатора
    @FXML
    protected void Search() {

        Search = Tfield.getText();//считывает текст и сохраняет его в переменную search
        welcomeText.setText("Этаж " + Search.charAt(5) + " Корпус " + Search.charAt(3)); //Считывает определенный по счету символ и вписывает его в информацию о местоположении кабитнета
        ///ниже условие которое определяет какую карту нужно включить, для заданного кабинета
        if(Search.charAt(5)=='1'){
            map.setImage(floor1);
        }
        else if(Search.charAt(5)=='2'){
            map.setImage(floor2);
        }
        else if(Search.charAt(5)=='3'){
            map.setImage(floor3);
        }

    }

}