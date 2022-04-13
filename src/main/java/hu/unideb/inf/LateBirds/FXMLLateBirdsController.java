package hu.unideb.inf.LateBirds;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FXMLLateBirdsController implements Initializable {

    @FXML
    private ComboBox<String> motorbike;

    @FXML
    private ComboBox<String> hiking;

    @FXML
    private ComboBox<String> snowboard;

    @FXML
    private ComboBox<String> ViaFerrata;

    @FXML
    private ComboBox<String> AdventurePark;

    @FXML
    private Button login;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        motorbike.setItems(FXCollections.observableArrayList("Helmet","Jacket","Trousers","Gloves","Body Protection"));
        hiking.setItems(FXCollections.observableArrayList("Hiking Stick","Boots","Tent","Waterproof Jacket","Backpack","Rope", "Miscellaneous"));
        snowboard.setItems(FXCollections.observableArrayList("Helmet","Jacket","Trousers","Gloves","Body Protection"));
        ViaFerrata.setItems(FXCollections.observableArrayList("Helmet","Gloves","Harness","Lanyard"));
        AdventurePark.setItems(FXCollections.observableArrayList("Helmet","Gloves","Harness","Lanyard"));
    }

    public void loginPressed(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) login.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/SecondPage.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();




    }
}