/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author WERIKE
 */
public class JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("diga 'Olá, Mundo!'");
        Button btn1 = new Button();
        btn1.setText("diga 'Mundo Novo!'");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Olá, Mundo!");
            }
            
        });
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Mundo Novo!");
            }
            
        });
                        
        Group root = new Group();
        root.getChildren().addAll(btn,btn1);
        
        btn.setLayoutY(105);
        btn1.setLayoutY(105);
        btn.setLayoutX(25);
        btn1.setLayoutX(155);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Meu primeiro programa JavaFX!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
