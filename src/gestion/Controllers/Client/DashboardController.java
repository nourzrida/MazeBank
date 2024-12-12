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
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class DashboardController implements Initializable {
    public Text user_name;
    public Label login_date ;
    public Label checking_bal ;
    public Label checking_acc_num ;
    public Label savings_bal;
    public Label savings_acc_num ;
    public Text expensex_lbl ;
    public ListView transaction_listview;
    public TextField payee_fld ;
    public TextField amount_fld;
    public TextArea message_fld;
    public Button send_money_btn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
