package hu.unideb.inf.LateBirds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;



public class FXMLRegisterPageController {

    @FXML
    private GridPane LateBirdsRegister;

    @FXML
    private Button backButton;

    @FXML
    private TextField emailAddr;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private PasswordField password;

    @FXML
    private Button submitButton;

    @FXML
    private TextField username;

    public FXMLRegisterPageController() {
    }

    @FXML
    public void backButtonPushed(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLateBirds.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.setCursor(Cursor.WAIT);
        Stage stage = (Stage) backButton.getScene().getWindow();
        //stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public void submitButtonPushed(ActionEvent actionEvent) {
    }
}
