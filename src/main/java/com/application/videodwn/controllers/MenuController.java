package com.application.videodwn.controllers;

import com.application.videodwn.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    public Button saveVideoBTN;
    public Button downloadBTN;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        saveVideoBTN.setOnAction(event -> onSaveVideoBTN());
        downloadBTN.setOnAction(event -> onDownloadBTN());
    }

    private void onSaveVideoBTN() {
        Model.getInstance().getViewFactory().getSelectedMenu().set("SaveVideoBoard");
    }

    private void onDownloadBTN() {
        Model.getInstance().getViewFactory().getSelectedMenu().set("DwnBoard");
    }
}
