package gestion.Views;

import gestion.Controllers.Client.ClientController;
import gestion.Controllers.Admin.AdminController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.beans.property.StringProperty;
public class ViewFactory {
    private AccountType loginAccountType;
    private final ObjectProperty<ClientMenuOption> clientSelectedMenuItem ;
    private final ObjectProperty<AdminMenuOption> adminSelectedMenuItem ;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView ;
    private AnchorPane accountsView ;
    private AnchorPane createClientView ;


    public ViewFactory() {
    this.loginAccountType = AccountType.CLIENT ;
    this.clientSelectedMenuItem = new SimpleObjectProperty<>();
    this.adminSelectedMenuItem = new SimpleObjectProperty<>();}
    
    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }
    public ObjectProperty getClientSelectedMenuItem(){
    return clientSelectedMenuItem;}
    public ObjectProperty getAdminSelectedMenuItem (){
            return adminSelectedMenuItem;}
    // Method to load the Dashboard view
    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/FXML/Client/Dashboard.fxml"));
                // Explicitly set the root
                dashboardView = loader.load();    // Load the FXML file for the dashboard view
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }
    public AnchorPane getTransactionsView() {
    if (transactionsView == null) { 
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/FXML/Client/Transactions.fxml"));
            
            transactionsView = loader.load(); // Load the FXML file
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    return transactionsView; // Return the loaded view
} 
    public AnchorPane getAccountsView(){
    if (accountsView == null){
    try{
    accountsView = new FXMLLoader(getClass().getResource("/Resources/FXML/Client/Accounts.fxml")).load();
    }catch (Exception e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    return accountsView;}

    public AnchorPane getCreateClientView(){
         if (createClientView == null){
    try{
    createClientView  = new FXMLLoader(getClass().getResource("/Resources/FXML/Admin/CreateClient.fxml")).load();
    }catch (Exception e) {
            e.printStackTrace(); // Handle the exception
        }
    }
    return createClientView ;}
    
  
    // Method to show the Login window
   public void showLoginWindow() {
    try {
        // Load the FXML file for the Login view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/FXML/LogIn.fxml"));
        
        // Load the FXML and get the root node from it (no need to manually set the root)
        Parent loadedRoot = loader.load();

        // Set the loaded root to the scene
        Scene scene = new Scene(loadedRoot);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Maze Bank - Login");
        stage.show();
    } catch (Exception e) {
        System.err.println("Error loading FXML: " + e.getMessage());
        e.printStackTrace();
    }
}


    // Method to show the Client window
   public void showClientWindow() {
    try {
        // Load the FXML file for the Client view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/FXML/Client/Client.fxml"));
        
        // Set the controller for the FXML
        ClientController clientController = new ClientController(); // Create the ClientController instance
        loader.setController(clientController);                     // Set the controller

        // Load the FXML and get the root node from it (no need to manually set the root)
        Parent loadedRoot = loader.load();

        // Set the loaded root to the scene
        Scene scene = new Scene(loadedRoot);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Maze Bank - Client");
        stage.show();
    } catch (Exception e) {
        System.err.println("Error loading FXML: " + e.getMessage());
        e.printStackTrace();
    }
}
   public void showAdminWindow (){
       
         try {
        // Load the FXML file for the Client view
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/FXML/Admin/Admin.fxml"));
        
        // Set the controller for the FXML
        AdminController Controller = new AdminController(); // Create the ClientController instance
        loader.setController(Controller);                     // Set the controller

        // Load the FXML and get the root node from it (no need to manually set the root)
        Parent loadedRoot = loader.load();

        // Set the loaded root to the scene
        Scene scene = new Scene(loadedRoot);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Maze Bank - Admin");
        stage.show();
    } catch (Exception e) {
        System.err.println("Error loading FXML: " + e.getMessage());
        e.printStackTrace();
    }
   }
   public void closeStage (Stage stage){
       stage.close();
   }

   /* public Object getAdminSelectedMenuItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
   
  

}
