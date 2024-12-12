/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gestion.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class AccountsController implements Initializable {

    public Label ch_acc_num ;
    public Label transaction_limit;
    public Label ch_acc_date;
    public Label ch_acc_bal ;
    public Label sv_acc_num;
    public Label sc_acc_date;
    public Label sv_acc_bal;
    public TextField amount_to_sv ;
    public Button trans_to_sv_btn ;
    public TextField amount_to_ch;
    public Button trans_to_cv_btn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
