package hu.unideb.inf.LateBirds;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        motorbike.setItems(FXCollections.observableArrayList("Helmet","Jacket","Trousers","Gloves","Body Protection"));
        hiking.setItems(FXCollections.observableArrayList("Hiking Stick","Boots","Tent","Waterproof Jacket","Backpack","Rope", "Miscellaneous"));
        snowboard.setItems(FXCollections.observableArrayList("Helmet","Jacket","Trousers","Gloves","Body Protection"));
        ViaFerrata.setItems(FXCollections.observableArrayList("Helmet","Gloves","Harness","Lanyard"));
        AdventurePark.setItems(FXCollections.observableArrayList("Helmet","Gloves","Harness","Lanyard"));
    }
}