/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t01a03_2_iu_anninnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author jose
 */
public class T01A03_2_IU_AnnInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button neww = new Button("New");
        neww.setPadding(new Insets(6.33));
        neww.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        Button open = new Button("Open");
        open.setPadding(new Insets(6.33));
        open.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir Proceso");
            }
        });
        
        Button save = new Button("Save");
        save.setPadding(new Insets(6.33));
        save.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar Proceso");
            }
        });
        
        Button print = new Button("Print");
        print.setPadding(new Insets(6.33));
        print.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir Proceso");
            }
        });
        
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10.0);
        root.getChildren().addAll(neww, open, save, print);
        
        Scene scene = new Scene(root, 300, 100);
        
        primaryStage.setTitle("Annonymous Inner Class");
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
