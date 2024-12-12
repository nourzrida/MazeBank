/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gestion.Controllers.Admin;

import gestion.Models.Model;
import static gestion.Views.AdminMenuOption.CREATE_CLIENT;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class AdminMenuController implements Initializable {

    public Button create_client_btn; 
    public Button clients_btn;
    public Button deposit_btn;
    public Button logout_bt;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addListeners();
    }    
    private void onCreateClient() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(CREATE_CLIENT);
    }

    private void addListeners() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
