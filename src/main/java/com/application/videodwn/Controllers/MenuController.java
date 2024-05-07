package com.application.videodwn.Controllers;

import com.application.videodwn.Model;
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
        System.out.println("SAVE BTN");
        System.out.println(Model.getInstance().getViewFactory().getSelectedMenu());
    }

    private void onDownloadBTN() {
        Model.getInstance().getViewFactory().getSelectedMenu().set("DwnBoard");
        System.out.println("DWN BTN");
        System.out.println(Model.getInstance().getViewFactory().getSelectedMenu());
    }
}
