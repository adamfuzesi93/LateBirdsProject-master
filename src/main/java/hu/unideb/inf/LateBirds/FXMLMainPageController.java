package hu.unideb.inf.LateBirds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FXMLMainPageController {

    @FXML
    private Button login;

    @FXML
    private PasswordField password;

    @FXML
    private Button register;

    /*@FXML
    private Label invalidLabel;*/

    @FXML
    private Button loginAsAdmin;

    @FXML
    private TextField username;

    public FXMLMainPageController() {
    }

    @FXML
    void loginAsAdministrator(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLAdmin.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.setCursor(Cursor.WAIT);
        Stage stage = (Stage) register.getScene().getWindow();
        //stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loginPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/RentPage.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.setCursor(Cursor.WAIT);
        Stage stage = (Stage) login.getScene().getWindow();
        stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void registerButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLRegisterPage.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.setCursor(Cursor.WAIT);
        Stage stage = (Stage) register.getScene().getWindow();
        //stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.show();

    }

    /*public void changeScene(ActionEvent event, String fxml) throws IOException {
        Parent dashboard = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        Scene dashboardScene = new Scene(dashboard);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.setTitle("LateBirds");
        window.show();
    }*/

   // public Admin activeAdmin;

   /* public void loginPressed(ActionEvent event) throws Exception {
        //loginIcon.setVisible(true);
        String userName = this.username.getText();
        String pass = this.password.getText();
        List<Customer> all_customers = new ArrayList<>();
        List<Admin> all_admins = new ArrayList<>();

        try (CustomerDAO cDAO= new JPACustomerDAO();
             AdminDAO aDAO = new JpaAdminDAO();) {
            all_customers = cDAO.getCustomersAll();
            all_admins = aDAO.getAdminsAll();

            for (Admin admin :all_admins){
                if(admin.getUserName().equals(userName)&& admin.getPassword().equals(pass)){//jo admin
                    invalidLabel.setVisible(false);
                    activeAdmin = aDAO.getAdminbyID(admin.getId());
                    FXMLAdminController.getActiveAdmin(activeAdmin);
                    changeScene(event,"/fxml/FXMLAdmin.fxml");
                }
            }//admin
            for (Customer customer :all_customers){
                if(customer.getUserName().equals(userName)&& customer.getPassword().equals(pass)){//jo user
                    invalidLabel.setVisible(false);
                    changeScene(event,"/fxml/RentPage.fxml");
                }
                else {
                    invalidLabel.setVisible(true);
                }
            }//cust
        }//try
    }
*/

}