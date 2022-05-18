package hu.unideb.inf.LateBirds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLAdminController {

    private static Admin activeAdmin;

    @FXML
    private GridPane AdminPage;

    @FXML
    private Label adminName;

    @FXML
    private Button deleteButton;

    @FXML
    private Button backToMain;

    @FXML
    void backToMainPressed(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLateBirds.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.setCursor(Cursor.WAIT);
        Stage stage = (Stage) backToMain.getScene().getWindow();
        //stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.show();

    }
    /*public static void getActiveAdmin(Admin admin) {
        activeAdmin = admin;
    }*/

    public void deleteButtonPushed(ActionEvent actionEvent) {
    }
}
