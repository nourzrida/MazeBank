/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gestion.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class CreateClientController implements Initializable {

    public TextField fName_fld;
    public TextField lName_fld;
    public TextField password_fld ;
    public CheckBox pAdrdress_box;
    public Label pAddress_lbl ;
    public CheckBox ch_acc_box;
    public TextField ch_amount_fld;
    public CheckBox sv_acc_box;
    public TextField sv_amount_fld;
    public Button create_client_btn ;
    public Label error_lbl ;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
