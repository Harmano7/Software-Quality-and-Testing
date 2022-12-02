package com.example.groupdproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Circlebygaurav extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Harmandeep Singh 500209183
        Group root =new Group();
        Scene scene = new Scene(root, 500, 500);

            Circle circle=new Circle();
            circle.setCenterX(250);
            circle.setCenterY(250);
            circle.setRadius(200);
            circle.setFill(Color.BLUE);
            root.getChildren().add(circle);



        stage.setTitle("Draw Circle");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}