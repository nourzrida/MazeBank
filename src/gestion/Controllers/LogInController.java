/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.Controllers;

import gestion.Models.Model;
import gestion.Views.AccountType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author MSI
 */
public class LogInController implements Initializable {
    public Button login_btn;
    public ChoiceBox<AccountType> account_selector ;
    public Label payee_adresse_lbl ;
    public TextField  payee_adress_field;
    public Label password_lbl;
    public  TextField password_field;
    public Label error_lbl;
    @Override
public void initialize(URL location, ResourceBundle resources) {
    account_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT,AccountType.ADMIN));
    account_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
    login_btn.setOnAction(event -> onLogin());
}
private void onLogin() {
    Stage stage = (Stage) error_lbl.getScene().getWindow();
    Model.getInstance().getViewFactory().closeStage(stage);
     Model.getInstance().getViewFactory().showClientWindow();
}
}
