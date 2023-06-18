package com.example.javafx_1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestCircle extends Application {
    private TextField tfRadius  = new TextField();
    private TextField tfArea = new TextField();
    private TextField tfPerimeter = new TextField();
    private Button btCaculate = new Button("Calculate");


    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("Enter Radius :"), 0, 0);
        pane.add(tfRadius, 1, 0);

        pane.add(new Label("Area"), 0, 1);
        pane.add(tfArea, 1, 1);

        pane.add(new Label("Perimeter"), 0, 2);
        pane.add(tfPerimeter, 1, 2);

        pane.add(btCaculate, 1, 3);
        GridPane.setHalignment(btCaculate, HPos.RIGHT);

        tfArea.setEditable(false);
        tfPerimeter.setEditable(false);

        btCaculate.setOnAction(e -> caculateCircle());

        Scene scene = new Scene(pane);
        stage.setTitle("Test Circle");
        stage.setScene(scene);
        stage.show();
    }

    private void caculateCircle(){
        double radius = Double.parseDouble(tfRadius.getText());

        if(radius <= 0){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error");
            a.setContentText("Radius Error");
            a.show();
        } else {
            Circle circle = new Circle(radius);

            tfArea.setText(Double.toString(circle.getArea()));
            tfPerimeter.setText(Double.toString(circle.getPerimeter()));
        }
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
