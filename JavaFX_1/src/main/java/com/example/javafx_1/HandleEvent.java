package com.example.javafx_1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        //OKHandlerClass handler1 = new OKHandlerClass();
        //btOK.setOnAction(handler1);
        //CancelHandlerClass handler2 = new CancelHandlerClass();
        //btCancel.setOnAction(handler2);
        btOK.setOnAction((ActionEvent e) -> {
            System.out.println("OK CLick");
        });

        btCancel.setOnAction((ActionEvent e) -> {
            System.out.println("Cancel Click");
        });
        pane.getChildren().addAll(btOK, btCancel);

        Scene scene = new Scene(pane);
        stage.setTitle("HandleEvent"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Displ
    }

    public static void main(String[] args) {
        Application.launch();
    }
}

class OKHandlerClass implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("OK Button Click");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Cancel Button Click");
    }
}
