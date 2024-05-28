package com.application.videodwn.controllers;


import com.application.videodwn.PanelDownloadedVideoCell;
import javafx.fxml.Initializable;
import com.application.videodwn.models.*;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class SaveVideoBoardController implements Initializable {

    public ListView<PanelDownloadedVideo> listView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setCellFactory(listView -> new PanelDownloadedVideoCell());
    }
}
