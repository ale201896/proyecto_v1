/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class run extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }

    public void admVista(Stage stage, String vista, String nombreVentana, boolean visible) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(vista));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(nombreVentana);
        if (visible) { //TRUE PARA ABRIR
            stage.show();
        } else {// FALSE PARA CERRAR
            stage.close();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
