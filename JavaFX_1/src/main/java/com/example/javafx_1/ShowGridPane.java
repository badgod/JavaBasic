package com.example.javafx_1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("Firstname"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("MI"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Lastname"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btnAdd = new Button("Add Name");
        pane.add(btnAdd, 1, 3);
        GridPane.setHalignment(btnAdd, HPos.RIGHT);


        Scene scene = new Scene(pane);
        stage.setTitle("Show Flow Pane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
