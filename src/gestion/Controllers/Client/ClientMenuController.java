package gestion.Controllers.Client;

import gestion.Models.Model;
import gestion.Views.ClientMenuOption;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class for the Client Menu.
 * Handles user interactions for navigation buttons.
 * 
 * @author MSI
 */
public class ClientMenuController implements Initializable {

    public Button dashboard;
    public Button transation_btn;
    public Button Accounts_btn;
    public Button Profil_btn;
    public Button logout_btn;
    public Button report_btn ;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addListeners(); // Attach listeners to buttons
    }

    /**
     * Adds event listeners to buttons.
     */
    public void addListeners() {
        dashboard.setOnAction(event -> onDashboard());
        transation_btn.setOnAction(event -> onTransactions());
        Accounts_btn.setOnAction(event -> onAccounts());
    }

    /**
     * Action triggered when the Dashboard button is clicked.
     */
    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOption.DASHBOARD);
    }

    /**
     * Action triggered when the Transactions button is clicked.
     */
    private void onTransactions() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOption.TRANSACTIONS);
    }
     private void onAccounts() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOption.ACCOUNTS);
    }
}
