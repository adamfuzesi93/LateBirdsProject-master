package hu.unideb.inf.LateBirds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class FXMLGoodByeController {

    @FXML
    private Button backButton;

    @FXML
    void backToMainPage(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLateBirds.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.setCursor(Cursor.WAIT);
        Stage stage = (Stage) backButton.getScene().getWindow();
        //stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.show();
    }

}


