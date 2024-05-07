package com.application.videodwn.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckController implements Initializable {
    public Button biba;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        biba.setOnAction(event -> onSaveVideoBTN());
    }

    private void onSaveVideoBTN() {
        System.out.println("SALAM");
    }
}
