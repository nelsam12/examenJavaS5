package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField logintxt;
    @FXML
    private PasswordField passwordtxt;


    public void getLogin(ActionEvent event){
        String login = logintxt.getText();
        String password = passwordtxt.getText();
        if (login.isEmpty() || password.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login Successful");
        alert.setContentText(login + " " + password);

        alert.showAndWait();
    }
   
}
