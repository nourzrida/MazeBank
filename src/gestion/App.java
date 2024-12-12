/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package gestion;

import gestion.Models.Model;
import gestion.Views.ViewFactory;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader ;
/**
 *
 * @author MSI
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }
   
    
}
