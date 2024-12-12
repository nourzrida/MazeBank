package gestion.Controllers.Client;

import gestion.Models.Model;
import static gestion.Views.ClientMenuOption.ACCOUNTS;
import static gestion.Views.ClientMenuOption.TRANSACTIONS;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;


/**
 * FXML Controller class for the Client main view.
 * Dynamically switches between Dashboard and Transactions views.
 * 
 * @author MSI
 */
public class ClientController implements Initializable {

    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Add a listener to observe changes in the selected menu item
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            if (newVal == TRANSACTIONS) {
    client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
} else if (newVal == ACCOUNTS) {
    client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
} else {
    client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
}


        });
    }
}
