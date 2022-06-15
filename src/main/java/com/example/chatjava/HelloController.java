package com.example.chatjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField msgField;
    @FXML
    TextArea mainArea;



    public void sendMsg(ActionEvent actionEvent) {
        if (msgField.getText().trim().length() > 1){
            mainArea.appendText(msgField.getText() + "\n");
            msgField.clear();
            msgField.requestFocus();
        }
    }
}