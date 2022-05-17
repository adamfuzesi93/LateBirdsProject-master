package hu.unideb.inf.LateBirds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLAdminController {


    @FXML
    private GridPane AdminPage;

    @FXML
    private TextField adminName;

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
        stage.setFullScreen(true);
        stage.show();

    }

    public void deleteButtonPushed(ActionEvent actionEvent) {
    }
}
