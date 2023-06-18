package com.example.javafx_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btnOK = new Button("OK");
        Scene scene = new Scene(btnOK, 300, 400);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();

        Stage stage1 = new Stage();
        stage1.setTitle("Second Stage");
        stage1.setScene(new Scene(new Button("New Stage"), 300,400));
        stage1.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
