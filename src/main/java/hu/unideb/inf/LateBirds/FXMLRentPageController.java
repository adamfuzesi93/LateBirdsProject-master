package hu.unideb.inf.LateBirds;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class FXMLRentPageController implements Initializable {
    public void secondPageBackButtonPressed(ActionEvent actionEvent) {

    }

    @FXML
    private ComboBox<String> AdventurePark;

    @FXML
    private ComboBox<String> ViaFerrata;

    @FXML
    private ComboBox<String> hiking;

    @FXML
    private ImageView imageView;

    @FXML
    private Button logoutButton;

    @FXML
    private ComboBox<String> motorbike;

    @FXML
    private ComboBox<String> snowboard;

    @FXML
    private Button checkoutButton;

    final private Connect database = new Connect();
    ObservableList<String> AdventureList(int category) throws SQLException{
        database.getData("NAME", "PRODUCT", "CATEGORY = " + category);
        ObservableList<String> firstlist = FXCollections.observableArrayList();
        while (database.rs.next()){
            String name = database.rs.getString("NAME");
            firstlist.add(name);
        }
        database.rs.close();
        return firstlist;
    }

    ObservableList<String> ViaFerrata(int category) throws SQLException{
        database.getData("NAME", "PRODUCT", "CATEGORY = " + category);
        ObservableList<String> firstlist = FXCollections.observableArrayList();
        while (database.rs.next()){
            String name = database.rs.getString("NAME");
            firstlist.add(name);
        }
        database.rs.close();
        return firstlist;
    }

    ObservableList<String> hiking(int category) throws SQLException{
        database.getData("NAME", "PRODUCT", "CATEGORY = " + category);
        ObservableList<String> firstlist = FXCollections.observableArrayList();
        while (database.rs.next()){
            String name = database.rs.getString("NAME");
            firstlist.add(name);
        }
        database.rs.close();
        return firstlist;
    }

    ObservableList<String> motorbike(int category) throws SQLException{
        database.getData("NAME", "PRODUCT", "CATEGORY = " + category);
        ObservableList<String> firstlist = FXCollections.observableArrayList();
        while (database.rs.next()){
            String name = database.rs.getString("NAME");
            firstlist.add(name);
        }
        database.rs.close();
        return firstlist;
    }

    ObservableList<String> snowboard(int category) throws SQLException{
        database.getData("NAME", "PRODUCT", "CATEGORY = " + category);
        ObservableList<String> firstlist = FXCollections.observableArrayList();
        while (database.rs.next()){
            String name = database.rs.getString("NAME");
            firstlist.add(name);
        }
        database.rs.close();
        return firstlist;
    }

    @FXML
    void logoutButtonPressed(ActionEvent event) throws IOException {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLateBirds.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void checkoutButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLGoodBye.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.setCursor(Cursor.WAIT);
        Stage stage = (Stage) checkoutButton.getScene().getWindow();
        //stage.setTitle("LateBirds");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            AdventurePark.getItems().addAll(AdventureList(4));
            ViaFerrata.getItems().addAll(ViaFerrata(3));
            hiking.getItems().addAll(hiking(2));
            motorbike.getItems().addAll(motorbike(0));
            snowboard.getItems().addAll(snowboard(1));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
