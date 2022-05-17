package hu.unideb.inf.LateBirds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class FXMLMainPageController {

    @FXML
    private Button login;

    @FXML
    private PasswordField password;

    @FXML
    private Button register;

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
        stage.setFullScreen(true);
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
        stage.setFullScreen(true);
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
        stage.setFullScreen(true);
        stage.show();

    }

}