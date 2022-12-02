package com.example.groupdproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Squarebysawan extends Application {
    @Override
    public void start(Stage mystage) {
        //Drawing a Square
        Rectangle Square = new Rectangle();

        //Setting the properties of the Square
        Square.setX(120.0f);
        Square.setY(120.0f);
        Square.setWidth(250.0f);
        Square.setHeight(250.0f);

        //Create a Group object
        Group Root = new Group(Square);

        //Create a scene object
        Scene myScene = new Scene(Root, 500, 500);

        //Set title to the Stage
        mystage.setTitle("Drawing Sqaure by Sawan");

        //Add scene to the stage
        mystage.setScene(myScene);

        //Display the stage
        mystage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}

