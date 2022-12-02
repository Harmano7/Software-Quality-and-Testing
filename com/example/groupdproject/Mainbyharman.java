package com.example.groupdproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainbyharman extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Harmandeep Singh 500209183
        Group root =new Group();
        Scene scene = new Scene(root, 500, 500);
        Button btn1=new Button();
        Button btn2=new Button();
        Button btn3=new Button();

        btn1.setText("Draw Ractangle");
        btn1.setLayoutX(200);
        btn1.setLayoutY(100);
        root.getChildren().add(btn1);
        btn2.setText("Draw Square");
        btn2.setLayoutX(200);
        btn2.setLayoutY(130);
        root.getChildren().add(btn2);
        btn3.setText("Draw circle");
        btn3.setLayoutX(200);
        btn3.setLayoutY(160);
        root.getChildren().add(btn3);

        // on click send but action handler
        btn1.setOnAction(actionEvent -> {

            Ractanglebyrahul ractanglebyrahul=new Ractanglebyrahul();
            ractanglebyrahul.start(stage);


        });

        btn2.setOnAction(actionEvent -> {

           Squarebysawan squarebysawan =new Squarebysawan();
           squarebysawan.start(stage);


        });

        btn3.setOnAction(actionEvent -> {

          Circlebygaurav circlebygaurav=new Circlebygaurav();
            try {
                circlebygaurav.start(stage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        });

        stage.setTitle("Chosse Your Shape");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
