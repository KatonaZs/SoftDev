package hu.unideb.inf.java.fx.example.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class FXController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label label6;
    @FXML
    private Label label3;
    @FXML
    private Label label5;
    @FXML
    private Label label2;
    @FXML
    private Label label4;
    @FXML
    private Label label1;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    public void loadData() {
        
    }

    @FXML
    public void handleClearDataAction() {
        label1.setText("");
        label2.setText("");
        label3.setText("");
        label4.setText("");
        label5.setText("");
        label6.setText("");
    }

}
